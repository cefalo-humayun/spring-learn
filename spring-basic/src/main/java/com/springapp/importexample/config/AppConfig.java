package com.springapp.importexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author humayun
 */
@Configuration
@Import({ CustomerConfig.class, ScheduleConfig.class })
public class AppConfig {
}
