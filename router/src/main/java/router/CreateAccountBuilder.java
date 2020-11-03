/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package router;

import domain.Account;
import domain.Customer;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 *
 * @author cedricstephani
 */
public class CreateAccountBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // create HTTP endpoint for receiving messages via HTTP
        from("jetty:http://localhost:9000/createaccount?enableCORS=true")
           // make message in-only so web browser doesn't have to wait on a non-existent response
           .setExchangePattern(ExchangePattern.InOnly)
           .log("${body}")
           .to("jms:queue:customerjetty");
        from("jms:queue:customerjetty")
            // convert JSON to domain object
            .unmarshal().json(JsonLibrary.Gson, Account.class) 
            .to("jms:queue:accountobject");
        from("jms:queue:accountobject")
            .bean(CustomerCreator.class, "createCustomer(${body})")
            .log("${body}")
            .to("jms:queue:customerobject");
        
        from("jms:queue:customerobject")
            // remove headers so they don't get sent to Vend
            .removeHeaders("*")
            // add authentication token to authorization header
           .setHeader("Authorization", constant("Bearer KiQSsELLtocyS2WDN5w5s_jYaBpXa0h2ex1mep1a"))
            // marshal to JSON
            .marshal().json(JsonLibrary.Gson)  // only necessary if the message is an object, not JSON
            .setHeader(Exchange.CONTENT_TYPE).constant("application/json")
            // set HTTP method
            .setHeader(Exchange.HTTP_METHOD, constant("POST"))
            // send it
            .log("${body}")
            .to("https://info303otago.vendhq.com/api/2.0/customers")
            // store the response
            .to("jms:queue:vend-response");
        
        from("jms:queue:vend-response")
            .setBody().jsonpath("$.data")
            .marshal().json(JsonLibrary.Gson)
            .to("jms:queue:extracted-response");
        
        from("jms:queue:extracted-response") 
            // convert JSON to domain object
            .unmarshal().json(JsonLibrary.Gson, Customer.class) 
            .to("jms:queue:extractedjson-response");  
        
        
        from("jms:queue:extractedjson-response")
            .bean(AccountCreator.class, "createAccount(${body})")
            .to("jms:queue:beanaccount");
        from("jms:queue:beanaccount")
            // convert from domain object to JSON
            .marshal().json(JsonLibrary.Gson)
            .setHeader(Exchange.CONTENT_TYPE).constant("application/json")
            // set HTTP method
            .setHeader(Exchange.HTTP_METHOD, constant("POST"))
            // send it
            .log("${body}")
            .to("http://localhost:8086/api/accounts");
            //.to("jms:queue:final-account");
        
    }
    
}
