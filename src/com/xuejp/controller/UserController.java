package com.xuejp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/list")
	public String list(){
		System.out.println("=====查询用户信息=======");
		return "userinfo/user_list";
	}
	
	@RequestMapping("/add")
	public String add(){
		System.out.println("=====新增用户信息=======");
		return "userinfo/user_add";
	}
	
	@RequestMapping("/update")
	public String update(){
		System.out.println("=====修改用户信息=======");
		return "userinfo/user_update";
	}
}
