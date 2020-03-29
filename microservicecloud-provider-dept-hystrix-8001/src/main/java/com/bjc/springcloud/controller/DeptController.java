package com.bjc.springcloud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bjc.cloud.entity.Dept;
import com.bjc.springcloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService service;
	
	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	// @HystrixCommand(fallbackMethod = "get_hystrix")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = service.get(id);
		return Optional.of(dept).orElseThrow(RuntimeException::new);
	}
	
	public Dept get_hystrix(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id)
						.setDname("该ID：" + id + "没有对应的信息，null - get_hystrix")
						.setDb_source("no this database in mysql");
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return service.list();
	}
	
	// 服务发现
	@Autowired
	private DiscoveryClient client;
	@RequestMapping(value="/dept/getDiscovery",method=RequestMethod.GET)
	public Object getDiscovery() {
		
		// 获取服务列表
		List<String> list = client.getServices();
		System.out.println("************************  " + list);
		
		List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
		instances.forEach(in -> System.out.println(in.getServiceId() + "\t" + in.getHost() + "\t" + in.getUri()));
		return client;
	}

}
