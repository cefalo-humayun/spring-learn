package com.springapp;

import com.springapp.xml.ConstructorMessage;
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
@ContextConfiguration("classpath:ConstructorMessageTest-context.xml")
public class ConstructorMessageTest {

    @Autowired
    ConstructorMessage constructorMessage;

    @Test
    public void testConstructor() {
        assertNotNull("Constructor message instance is null.", constructorMessage);
        String msg = constructorMessage.getMessage();

        assertNotNull("Message is null.", msg);

        String expectedMessage = "Spring is fun.";

        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);
    }
}
