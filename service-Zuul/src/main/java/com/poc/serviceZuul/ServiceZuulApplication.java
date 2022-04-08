package com.poc.serviceZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceZuulApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}