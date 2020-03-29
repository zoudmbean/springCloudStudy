package com.bjc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bjc.cloud.entity.Dept;

@RestController
@RequestMapping("/consummer/dept")
public class DeptController {
	
	// private static final String REST_URL_PREX = "http://localhost:8001/dept";
	private static final String REST_URL_PREX = "http://MICROSERVICECLOUD-DEPT";
	
	@Resource
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREX + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREX + "/dept/get/" + id, Dept.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREX + "/dept/list", List.class);
	}
	
	@RequestMapping(value="/getDiscovery",method=RequestMethod.GET)
	public Object getDiscovery() {
		return restTemplate.getForObject(REST_URL_PREX + "/dept/getDiscovery", Object.class);
	}

}
