package com.abhinav.springsec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity(debug = true) //HELP US TO CREATE FILTER CHAIN
//Internally the spring looks for SpringSecurityFilterChain this bean is required
//EnableWebSecurity will give the bean to SSFC
public class SecurityAppConfig {
    //TEST Second
}
