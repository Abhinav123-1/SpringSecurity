package com.abhinav.springsec.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//setup DispatcherServelet and will create the DS and create dispather context or servlet context
// WebApplicationInitializor
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {MyAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"} ;
    }
}
