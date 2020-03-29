package com.bjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.bjc"})
@ComponentScan("com.bjc")
public class DeptConsumerApplication_feign {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerApplication_feign.class, args);
	}

}
