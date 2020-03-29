package com.ribbon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/** 自定义Ribbon规则类
 * @author Administrator
 *
 */
@Configuration
public class MySelfRule{

	@Bean
	public IRule myRule() {
		// return new RandomRule();  // 用随机算法做个测试
		return new RandomRule_ZY();  // 自定义规则算法
	}

}
