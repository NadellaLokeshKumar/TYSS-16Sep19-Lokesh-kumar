package com.ty.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.ty.springcore.di.Cat;
import com.ty.springcore.di.Dog;
import com.ty.springcore.di.Hello;
import com.ty.springcore.di.Pet;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {

	@Bean(name="hello")
	@Scope("prototype")         
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I love Python");
		return hello;
	}
	
	
}
