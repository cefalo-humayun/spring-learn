package com.springapp.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author humayun
 */
public class App {
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config-autowire.xml");

        Customer cust = (Customer)context.getBean(Customer.class);
        System.out.println(cust.getPerson().getAddress());

    }
}
