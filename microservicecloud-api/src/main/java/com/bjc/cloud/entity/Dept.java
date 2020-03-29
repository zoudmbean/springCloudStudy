package com.bjc.cloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@SuppressWarnings("serial")
@NoArgsConstructor		// 无参构造函数
// @AllArgsConstructor		// 全参构造函数
@Data					// 为每个字段设置set/get
@Accessors(chain=true)	// 访问方式  chain=true 表示链式风格访问
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		this.dname = dname;
	}

}
