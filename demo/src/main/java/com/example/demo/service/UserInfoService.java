package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;

@Service
public interface UserInfoService {
	public String addUser(UserInfo userInfo);
}
