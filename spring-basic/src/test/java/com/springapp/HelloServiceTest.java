package com.springapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author humayun
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class HelloServiceTest {

    @Autowired
    HelloService helloService;

    @Test
    public void testMessage() {
        assertNotNull("Constructor message instance is null.", helloService);
        String msg = helloService.sayHello();

        assertNotNull("Message is null.", msg);

        String expectedMessage = "Hello world!";

        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);

    }
}
