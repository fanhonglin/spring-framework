package com.fhl.test.getSingleton;

import org.springframework.context.annotation.Configuration;

@Configuration
public class User {

	public User(){
		System.out.println("user------print");
	}
}
