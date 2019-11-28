package com.ty.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.springcore.config.HelloConfigurationClass;
import com.ty.springcore.di.Animal;
import com.ty.springcore.di.Hello;
import com.ty.springcore.di.Pet;

public class AnnotationApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigurationClass.class);
		
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		Hello hello2 = context.getBean(Hello.class);
		System.out.println(hello);
		System.out.println(hello2);
		System.out.println("***************");
		
		/*Animal animal = context.getBean(Animal.class);
		animal.makeSound();*/
		
		System.out.println("************");
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
	}
}
