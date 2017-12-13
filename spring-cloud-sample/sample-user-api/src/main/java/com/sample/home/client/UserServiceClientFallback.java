package com.sample.home.client;

import org.springframework.stereotype.Component;

@Component
public class UserServiceClientFallback implements UserServiceClient {

	@Override
	public String findUserInfo(String userId) {
		
		return "fallback";
	}

}
