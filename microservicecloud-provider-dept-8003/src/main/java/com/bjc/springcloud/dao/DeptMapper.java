package com.bjc.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bjc.cloud.entity.Dept;

@Mapper
public interface DeptMapper{
	
  @Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE())")
  public boolean addDept(Dept dept);
 
  @Select("select * from dept where deptno=#{id}")
  public Dept findById(Long id);
 
  @Select("select deptno,dname,db_source from dept")
  public List<Dept> findAll();
}
