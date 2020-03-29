package com.bjc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient		// 表示本服务启动后，会自动注册进Eureka服务中
@EnableDiscoveryClient  // 服务发现
@EnableCircuitBreaker	//对hystrixR熔断机制的支持
public class DeptApplication8001_Hystrix_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptApplication8001_Hystrix_App.class, args);
	}
}
