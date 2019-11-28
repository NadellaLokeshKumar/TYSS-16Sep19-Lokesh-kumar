package com.ty.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.di.Hello;
import com.ty.springcore.di.Pet;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello =context.getBean(Hello.class);
		hello.setMsg("I love Java");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("siri");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
