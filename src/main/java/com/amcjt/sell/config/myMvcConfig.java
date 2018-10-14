package com.amcjt.sell.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author jbhim
 * @date 2018/6/27/027.
 */
@Configuration
public class myMvcConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/seller/order/list");
        registry.addRedirectViewController("/index", "/seller/order/list");
    }
}
