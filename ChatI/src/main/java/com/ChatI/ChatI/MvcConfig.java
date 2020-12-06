package com.example.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("Home");
		registry.addViewController("/").setViewName("Home");
		registry.addViewController("/chatroom").setViewName("Chatroom");
		registry.addViewController("/userlist").setViewName("UserList");
	}

}