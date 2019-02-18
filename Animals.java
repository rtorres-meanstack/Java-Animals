package com.Lesson8HandsOn.Animals;

import com.Lesson8HandsOn.Animals.Mammal.Cat;
import com.Lesson8HandsOn.Animals.Mammal.Cow;
import com.Lesson8HandsOn.Animals.Mammal.Dog;
import com.Lesson8HandsOn.Animals.Reptile.Lizard;
import com.Lesson8HandsOn.Animals.Reptile.Turtle;

public class Animals {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		Turtle turtle = new Turtle();
		Lizard lizard = new Lizard();
		
		System.out.println(dog.run());
		System.out.println(dog.speak());
		System.out.println(dog.eat());
		
		System.out.println(cat.run());
		System.out.println(cat.speak());
		System.out.println(cat.eat());
		
		System.out.println(cow.run());
		System.out.println(cow.speak());
		System.out.println(cow.eat());
		
		System.out.println(turtle.crawl());
		System.out.println(turtle.eat());
		
		System.out.println(lizard.crawl());
		System.out.println(lizard.eat());
	}

	public interface Animal{
		static String eat() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
