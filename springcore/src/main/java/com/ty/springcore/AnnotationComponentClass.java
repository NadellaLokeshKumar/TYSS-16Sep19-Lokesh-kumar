package com.ty.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.springcore.config.ComponentScanConfiguration;
import com.ty.springcore.di.Hello;
import com.ty.springcore.di.Pet;

public class AnnotationComponentClass {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
	
	Hello hello =context.getBean(Hello.class);
	hello.setMsg("I love Java");
	System.out.println(hello.getMsg());
	
	Pet pet = context.getBean(Pet.class);
	pet.setName("google");
	System.out.println(pet.getName());
	pet.getAnimal().makeSound();
}
}
