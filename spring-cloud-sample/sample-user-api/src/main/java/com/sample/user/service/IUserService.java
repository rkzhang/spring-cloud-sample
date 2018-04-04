package com.sample.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Data;

@FeignClient(name = "user-module")
public interface IUserService {

	@RequestMapping(value="findUserInfo", method = RequestMethod.POST)
	String findUserInfo(UserQuery userId);
	
	@Data
	public static class UserQuery {
		
		private String username;
		
		private String account;
	}

}
