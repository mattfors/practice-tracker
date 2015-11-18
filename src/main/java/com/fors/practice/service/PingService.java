package com.fors.practice.service;

import org.springframework.stereotype.Component;

@Component
public class PingService {

	public String pong(){
		return "OK-Service";
	}
}
