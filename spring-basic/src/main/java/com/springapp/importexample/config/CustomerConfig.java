package com.springapp.importexample.config;

import com.springapp.importexample.core.CustomerBo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author humayun
 */
@Configuration
public class CustomerConfig {
    @Bean(name="customer")
    public CustomerBo customerBo(){
        return new CustomerBo();

    }
}
