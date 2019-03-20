package com.gwn.mycloud.controller;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwn.mycloud.server.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService DeptService ;
	
	@RequestMapping(value="/list")
	public Object list() {
		
		this.DeptService.list();
		return "获取 LIST ----------- 服务降级啦！";
	}
	
	@RequestMapping(value="/get/{id}")
	public Object get(@PathVariable Long id)  {
		System.out.println("get-----------------------------");
//		throw new RuntimeException("aaaaaaaaaaaaa");
		this.DeptService.get(1);
		return "获取id ----------- 服务降级";
	}
	
}
