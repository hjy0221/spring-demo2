package com.jaeyoon.blog.presentation.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PresentationInterceptorConfiguration implements WebMvcConfigurer {

    private final PresentationInterceptor presentationInterceptor;

    public PresentationInterceptorConfiguration(PresentationInterceptor presentationInterceptor) {
        this.presentationInterceptor = presentationInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(presentationInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/assets/**", "/css/**", "/js/**", "/admin/**", "/h2**", "/favicon.ico", "/error");
    }
}
