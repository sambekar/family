package com.family;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "applicationDao")
    ApplicationDaoImpl getApplicationDao(){
        return new ApplicationDaoImpl();
    }
}
