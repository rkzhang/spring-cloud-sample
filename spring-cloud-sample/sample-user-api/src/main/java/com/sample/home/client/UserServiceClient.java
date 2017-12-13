package com.sample.home.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name = "user-module", fallback = UserServiceClientFallback.class)
@FeignClient(name = "user-module")
public interface UserServiceClient {

	@GetMapping("/findUserInfo")
	String findUserInfo(@RequestParam(value="userId")String userId);
}
