package com.springapp.importexample.config;

import com.springapp.importexample.core.ScheduleBo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author humayun
 */
@Configuration
public class ScheduleConfig {

    @Bean(name="schedule")
    public ScheduleBo scheduleBo() {
        return new ScheduleBo();
    }
}
