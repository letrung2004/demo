package com.lqt.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                ThymeleafConfigs.class,
                HibernateConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebAppContextConfigs.class,
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
