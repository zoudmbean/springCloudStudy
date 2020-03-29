package com.bjc.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjc.cloud.entity.Dept;
import com.bjc.springcloud.dao.DeptMapper;
import com.bjc.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper Mapper;

	@Override
	public boolean add(Dept dept) {
		return Mapper.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return Mapper.findById(id);
	}

	@Override
	public List<Dept> list() {
		return Mapper.findAll();
	}
}
