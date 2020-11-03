/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package router;

import domain.Customer;
import domain.Sale;
import domain.Summary;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 *
 * @author cedricstephani
 */
public class SaleBuilder extends RouteBuilder {
    
    @Override
    public void configure() throws Exception {
        from("imaps://outlook.office365.com?username=stece850@student.otago.ac.nz"
            + "&password=" + getPassword("Enter your E-Mail password")
            + "&searchTerm.subject=Vend:SaleUpdate"
            + "&debugMode=false"  // set to true if you want to see the authentication details
            + "&folderName=INBOX")  // change to whatever folder your Vend messages end up in
            .convertBodyTo(String.class)
            //.log("${body}")
            .to("jms:queue:vend-new-sale");
        
        from("jms:queue:vend-new-sale")
             // convert JSON to domain object
            .unmarshal().json(JsonLibrary.Gson, Sale.class) 
            .log("${body}")
            .to("jms:queue:extracted-sale");
        
        from("jms:queue:extracted-sale")
            .setProperty("firstName").simple("${body.customer.firstName}")
            .setProperty("id").simple("${body.customer.id}")
            .setProperty("lastName").simple("${body.customer.lastName}")
            .setProperty("email").simple("${body.customer.email}")
            .setProperty("group").simple("${body.customer.group}")
            //.log("${exchangeProperty.id}")
//            .log("${exchangeProperty.firstName}")
//            .log("${exchangeProperty.lastName}")
//            .log("${exchangeProperty.email}")
            //.log("${exchangeProperty.group}")
            .to("jms:queue:sale-body");
        
        from("jms:queue:sale-body")
            .removeHeaders("*")
            .marshal().json(JsonLibrary.Gson)
            .setHeader(Exchange.HTTP_METHOD, constant("POST"))
            .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
            .toD("http://localhost:8081/api/sales")
            .to("jms:queue:sales-post"); 
        
        from("jms:queue:sales-post")
            .removeHeaders("*") // remove headers to stop them being sent to the service
            .setBody(constant(null)) // can't pass a body in a GET request
            .setHeader(Exchange.HTTP_METHOD, constant("GET"))
            //.log("${exchangeProperty.id}")
            .recipientList()
                .simple("http://localhost:8081/api/sales/customer/${exchangeProperty.id}/summary")
            .to("jms:queue:sales-summary"); 
        
        
        from("jms:queue:sales-summary")
            .log("${exchangeProperty.group}")
            .unmarshal().json(JsonLibrary.Gson, Summary.class)
            //.log("${body}")
            .log("${body.group}")
            .choice()
              .when().simple("${body.group} == ${exchangeProperty.group}")
                .to("jms:queue:groups-true")
              .otherwise()
                .to("jms:queue:groups-false");
//            .to("jms:queue:testing");
            

        
    }
    
    public static String getPassword(String prompt) {
        JPasswordField txtPasswd = new JPasswordField();
        int resp = JOptionPane.showConfirmDialog(null, txtPasswd, prompt,
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (resp == JOptionPane.OK_OPTION) {
            String password = new String(txtPasswd.getPassword());
            return password;
        }
        return null;
    }

    
}
