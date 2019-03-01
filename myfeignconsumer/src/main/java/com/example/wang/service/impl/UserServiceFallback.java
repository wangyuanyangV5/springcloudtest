package com.example.wang.service.impl;

import com.example.wang.model.User;
import com.example.wang.service.UserFeignService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserFeignService {
	/**
	  * 出错则调用该方法返回友好错误
	  * @param username
	  * @return
	  */
	public String getUser(String username){
		return "The user does not exist in this system, please confirm username";
	}

	@Override
	public String addUser(User user) {
		return "The user does not exist in this system, please confirm username";
	}

	@Override
	public String updateUser(User user) {
		return "The user does not exist in this system, please confirm username";
	}
}
