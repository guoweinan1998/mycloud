package com.gwn.mycloud.server;

import java.util.List;

import org.springframework.stereotype.Component;

import com.gwn.mycloud.entity.Dept;

import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class DeptServiceFallBack implements FallbackFactory<DeptService>{

	public DeptService create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new DeptService() {
			
			public List<Dept> list() {
				System.out.println("服务降级处理---------11111111111111111111111---");

				return  null;
			}
			
			public Dept get(long id) {
				System.out.println("服务降级处理-----------222222222222222222222222222-");
				return new Dept().setDname("服务降级-----------------");
			}
			
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
