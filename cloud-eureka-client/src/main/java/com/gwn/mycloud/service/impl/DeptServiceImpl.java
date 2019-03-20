package com.gwn.mycloud.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atguigu.springcloud.entities.Dept;
import com.gwn.mycloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	@Override
	public boolean add(Dept dept) {
		return false;
	}

	@Override
	public Dept get(Long id) {

		System.out.println(" eureka client 层调用-----   get  ---------------");
		return null;
	}

	@Override
	public List<Dept> list() {
		System.out.println(" eureka client 层调用-----   list  ---------------");
		return null;
	}

}
