package com.gwn.mycloud.server;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value="" , fallbackFactory = DeptServiceFallBack.class )
public interface DeptService {
	
	

}
