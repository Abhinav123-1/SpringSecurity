package com.abhinav.springsec.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    //Abstarct implents WbApplicationAnitializor automaticallly detetced by web server
    //Spring security has filters of chain or called as security Filter chain
    //Delegeting Filter Chain --> Bootstartps sAPRING sECURITY
    //Chain of Filters is Spring Security Filter Chain
}
