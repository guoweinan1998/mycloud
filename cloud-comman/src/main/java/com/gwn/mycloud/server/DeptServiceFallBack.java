package com.gwn.mycloud.server;

import feign.hystrix.FallbackFactory;

public class DeptServiceFallBack implements FallbackFactory<DeptService>{

	public DeptService create(Throwable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
