package com.sample.user.service.impl;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sample.user.service.IUserService;

@RestController
public class UserServiceImpl implements IUserService{

	@HystrixCommand(fallbackMethod="findUserInfoFB", commandProperties = @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500"))
	@Override
	public String findUserInfo(@RequestBody UserQuery query) {
		try {
			Thread.sleep(RandomUtils.nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println(String.format("account : %s, username : %s", query.getAccount(), query.getUsername()));
        return query.getAccount() + "-" + query.getUsername();
	}

	public String findUserInfoFB(UserQuery userId) {
		
		return "fallbackMethod";
	}

}
