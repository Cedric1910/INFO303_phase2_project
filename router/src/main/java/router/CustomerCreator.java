/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package router;

import domain.Account;
import domain.Customer;

/**
 *
 * @author cedricstephani
 */
public class CustomerCreator {
    Account account; 
    
    public Customer createCustomer(Account account){
        this.account = account; 
        Customer customer = new Customer(); 
        customer.setEmail(account.getEmail());
        customer.setFirstName(account.getFirstName());
        customer.setLastName(account.getLastName());
        customer.setGroup("0afa8de1-147c-11e8-edec-2b197906d816");
        customer.setCustomerCode(account.getUsername());
        
        return customer; 
    }
}
