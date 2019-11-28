package com.ty.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ty.springcore.di.Cat;
import com.ty.springcore.di.Dog;
import com.ty.springcore.di.Pet;

@Configuration
public class PetConfigurationClass {

	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name="cat")
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean(name="pet")
	public Pet getPet() {
		Pet pet =  new Pet();
		pet.setName("Bittu");
		//pet.setAnimal(getDog());  // wiring.     for autowiring see in Pet class.
		return pet;
	}
}
