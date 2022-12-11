package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DemoController {

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@GetMapping("/home")
	public String hello() {
		
		return"hello";
	}
	
	@GetMapping("/login")
	public String hello1() {
		
		return"login";
	}
	
	
	
	@PostMapping("/login")
	public String login(@RequestParam("username")String username , @RequestParam("password")String password) {
		
		Optional<UserInfo> userInfo= userInfoRepository.findById(username);
		if(!userInfo.isEmpty() && password.equals(userInfo.get().getPassword())) {
			return "Success";
			
		}else {
			return "Fail";
		}
	}
		
	@GetMapping("/register")
	public String getregister() {
		
		return"register";
	}

	
	@PostMapping("/register")
	public String register(@RequestParam("username1")String username1 , @RequestParam("password1")String password1, @RequestParam("password2")String password2) {
			
				
		UserInfo newUser = new UserInfo(username1,password1);
		
		if (username1!=null ) {
			Optional<UserInfo> userInfo= userInfoRepository.findById(username1);
			if(userInfo.isEmpty() && password1.equals(password2)) {
				 userInfoRepository.save(newUser);
				 return"login";
		} else {
			return  "FailRegister";
		}
			
			
		}else {

			return"FailRe";
		}
		
		
		}}

	
	
