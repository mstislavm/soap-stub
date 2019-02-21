package com.reunico;

public class B2B {

    public Customer getDelay(String id){
        Customer customer = new Customer();
        customer.setId(id);
        customer.setDelay(id.equals("9999999999") ?  true : false);
        return customer;
    }
}