package com.bjc.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	/**注入RestTemplate
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	} 
	/*
	@Bean
	public IRule getMyRule() {
		return new RandomRule();   // 使用随机算法替代默认轮询
	}
	*/
}
