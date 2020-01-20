package com.flightmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.flightmanagement")
public class MVCConfig {

	@Bean(name="viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver res=new InternalResourceViewResolver();
		res.setPrefix("/WEB-INF/view/");
		res.setSuffix(".jsp");
		return res;
	}
}