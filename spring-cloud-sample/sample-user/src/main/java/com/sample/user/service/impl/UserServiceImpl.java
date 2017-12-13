package com.sample.user.service.impl;

import org.springframework.web.bind.annotation.RestController;
import com.sample.user.service.IUserService;

@RestController
public class UserServiceImpl implements IUserService{

	@Override
	public String findUserInfo(String userId) {
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("userId : " + userId);
        return userId;
	}

}
