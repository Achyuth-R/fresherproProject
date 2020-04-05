package com.login;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	    registry.addResourceHandler("/css/**").addResourceLocations("/css/**");
//	    registry.addResourceHandler("/img/**").addResourceLocations("/img/**");
//	    registry.addResourceHandler("/js/**").addResourceLocations("/js/**");
//	    registry.addResourceHandler("/sound/**").addResourceLocations("/sound/**");
//	    registry.addResourceHandler("/fonts/**").addResourceLocations("/fonts/**");
//	}

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
	}

}