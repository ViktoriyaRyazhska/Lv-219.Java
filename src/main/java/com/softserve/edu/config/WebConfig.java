package com.softserve.edu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 
 * @author Роман
 * 
 *         Configuration class dispatcher-servlet.xml
 *
 */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.softserve.edu" })
public class WebConfig extends WebMvcConfigurerAdapter {

    // more custom rules/beans

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Index mapping
        // ->index.jsp
        registry.addViewController("/").setViewName("index");

    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

    };

    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    };

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

}
