package com.ty.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.springcore.di.Animal;
import com.ty.springcore.di.Hello;
import com.ty.springcore.di.Pet;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Hello hello = context.getBean(Hello.class);
    	System.out.println(hello.getMsg());
    	System.out.println(hello.getMap());
    	
    	Hello hello2 = context.getBean(Hello.class);
    	System.out.println(hello);
    	System.out.println(hello2);  // By default, spring creates singleton object for all bean configurations.
    	
    	Animal animal = context.getBean(Animal.class);
    	animal.makeSound();
    	
    	Animal animal2 =(Animal) context.getBean("dog");
    	animal2.makeSound();
    	
    	System.out.println("**********************");
    	
    	Pet pet = context.getBean(Pet.class);
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
    }
}
