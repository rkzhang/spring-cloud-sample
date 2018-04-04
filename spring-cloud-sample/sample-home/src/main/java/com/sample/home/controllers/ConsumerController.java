package com.sample.home.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.user.service.IUserService;
import com.sample.user.service.IUserService.UserQuery;

@RestController
public class ConsumerController {

    //@Autowired
    //private RestTemplate restTemplate;

    @Autowired
    private IUserService userService;
    
    @GetMapping("/consumer")
    public String consumer() {
    	UserQuery query = new UserQuery();
    	query.setAccount("account");
    	query.setUsername("username");
    	return userService.findUserInfo(query);
    }
}
