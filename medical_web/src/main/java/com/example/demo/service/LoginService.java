package com.example.demo.service;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.History;

public interface LoginService {
	 boolean Login(String userName,String pwd);
	 boolean Check_name(String name);
	 boolean Register(String name,String pwd);
	 
}