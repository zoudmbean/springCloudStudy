package com.bjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjc.cloud.entity.Dept;
import com.bjc.cloud.service.DeptClientService;

@RestController
@RequestMapping("/consummer/dept")
public class DeptController {

	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}

	@RequestMapping(value = "/list")
	public List<Dept> list() {
		return this.service.list();
	}

	@RequestMapping(value = "/add")
	public Object add(Dept dept) {
		return this.service.add(dept);
	}
	
}
