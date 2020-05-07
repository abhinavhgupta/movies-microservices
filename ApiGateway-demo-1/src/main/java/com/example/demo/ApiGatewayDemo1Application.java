package com.example.demo;

import java.lang.annotation.Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.access.prepost.PreFilter;

@SpringBootApplication
@EnableZuulProxy
public class ApiGatewayDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayDemo1Application.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter() {

			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String value() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String filterTarget() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
