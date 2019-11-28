package com.ty.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pet")
public class Pet {
	private String name;
	@Autowired                     // it is important, we use this in industries.
	@Qualifier("cat")				// Qualify for the particular name i.e here cat.(It is just like byName in autowiring).
	private Animal animal;
	
	public Pet() {
		
	}
	/*public Pet(String name,Animal animal) {    //@Autowired is also used for constructors also(only if all the arguments in constructor are of bean type)
		this.name = name;
		this.animal = animal;
	}*/

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
