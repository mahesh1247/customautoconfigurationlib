package com.codelabchronicles.customautoconfigurationlib.autoconfiguration;

import com.codelabchronicles.customautoconfigurationlib.config.CustomBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    @Bean
    public CustomBean customBean(){
        return new CustomBean();
    }
}
