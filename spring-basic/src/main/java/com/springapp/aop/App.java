package com.springapp.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author humayun
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config-aop.xml");

        //CustomerService cust = (CustomerService) appContext.getBean("customerService");
        //CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxyBefore");
        //CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxyAfter");
        CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxyBeforeAfter");
        //CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxyThrow");
        //CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxyAround");


        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
        try {
            cust.printThrowException();
        } catch (Exception e) {

        }

    }
}
