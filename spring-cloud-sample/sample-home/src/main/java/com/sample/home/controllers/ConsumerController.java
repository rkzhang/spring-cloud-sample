package com.sample.home.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.user.service.IUserService;

@RestController
public class ConsumerController {

    //@Autowired
    //private RestTemplate restTemplate;

    @Autowired
    private IUserService userService;
    
    @GetMapping("/consumer")
    public String consumer() {
    	/*
        String url = "http://user-module/findUserInfo?userId=123456";
        System.out.println(url);
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("userId", "123456");
        return restTemplate.getForObject(url, String.class, uriVariables);
        */
    	return userService.findUserInfo("123456");
    }
}
