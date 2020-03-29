package com.bjc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient		// 表示本服务启动后，会自动注册进Eureka服务中
@EnableDiscoveryClient  // 服务发现
public class DeptApplication8002 {

	public static void main(String[] args) {
		SpringApplication.run(DeptApplication8002.class, args);
	}
}
