package com.dustnotify;

import com.dustnotify.http.HttpConn;
import com.dustnotify.http.OpenApi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.StopWatch;

@Configuration
@EnableTransactionManagement
public class BeanConfig {

	@Bean
	public HttpConn httpConn() {
		return new HttpConn();
	}

	@Bean
	public OpenApi api() {
		return new OpenApi();
	}
	

	@Bean
	public StopWatch watch() {
		return new StopWatch();
	}
	
}
