package com.olive;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		String user="AJAY";
		BCryptPasswordEncoder pwd=new BCryptPasswordEncoder();
		String encode = pwd.encode(user);
		System.out.println(encode);

	}

}
