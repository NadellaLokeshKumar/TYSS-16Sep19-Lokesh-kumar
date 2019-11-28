package com.ty.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("hello") 			//if we do this Spring makes our class as bean(spring bean).
public class Hello {
	
	public Hello() {
		System.out.println("Hello object created");
	}
	private String msg;
	private Map<String, Integer> map;
	
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	public Map<String, Integer> getMap(){
	return map;
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@PostConstruct     //after object creation.
	public void init() {
		System.out.println("Init method executing from hello");
	}
	@PreDestroy     //before destroying.
	public void destroy() {
		System.out.println("detroy method executing from hello");
	}
	
}
