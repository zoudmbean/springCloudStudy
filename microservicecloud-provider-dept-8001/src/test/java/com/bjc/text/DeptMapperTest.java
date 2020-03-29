package com.bjc.text;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjc.cloud.entity.Dept;
import com.bjc.springcloud.dao.DeptMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class DeptMapperTest {
	
	@Autowired
	private DeptMapper deptMapper;
	
	@Test
	public void test01() {
		List<Dept> findAll = deptMapper.findAll();
		System.out.println(findAll);
	}
	
}
