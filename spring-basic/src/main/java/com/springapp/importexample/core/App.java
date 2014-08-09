package com.springapp.importexample.core;

import com.springapp.importexample.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author humayun
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        CustomerBo customer = (CustomerBo) context.getBean("customer");
        customer.printMsg("Hello 1");

        ScheduleBo scheduler = (ScheduleBo) context.getBean("schedule");
        scheduler.printMsg("Hello 2");

    }
}
