package com.sample.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-module")
public interface IUserService {

	@GetMapping("/findUserInfo")
	String findUserInfo(@RequestParam(value="userId")String userId);

}
