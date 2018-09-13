package com.ynd.device.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by ZhuRui on 2018/2/11.
 */


@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
//    @Bean
//    public BossAuthInterceptor bossAuthInterceptor(){
//        return new BossAuthInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(bossAuthInterceptor()).addPathPatterns("/bossfasting/**");
//        super.addInterceptors(registry);
//    }
//
//    @Bean
//    @Scope(value="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
//    public BossWebUser bossWebUser(){
//        return new BossWebUser();
//    }


}
