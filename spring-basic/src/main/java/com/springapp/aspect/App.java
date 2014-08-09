package com.springapp.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author humayun
 */
public class App {
    public static void main(String args[]) throws Exception {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config-aspect.xml");

        Customer customer = (Customer) appContext.getBean("customerBo");
        customer.addCustomer();
        customer.addCustomerReturnValue();
        //customer.addCustomerThrowException();
        customer.addCustomerAround("mkyong");
    }
}
