package com.Lesson8HandsOn.Animals;

import com.Lesson8HandsOn.Animals.Animals.Animal;

public interface Mammal extends Animal{
	String speak();
	String eat();
	String run();
	

	public class Dog implements Mammal{

		@Override
		public String speak() {
			return "Bark!";
		}

		@Override
		public String run() {
			return "Dogs can run at a top speed of 45 mph!";
		}

		@Override
		public String eat() {
			return "Dogs eat bones.";
		}
	}
	
	public class Cat implements Mammal{

		@Override
		public String speak() {
			return "Meow!";
		}

		@Override
		public String run() {
			return "Cats can run at a top speed of 30 mph!";
		}
		
		@Override
		public String eat() {
			return "Cats eat mice.";
		}
		
	}
	
	public class Cow implements Mammal{

		@Override
		public String speak() {
			return "Moo!";
		}

		@Override
		public String run() {
			return "Cows can run at a top speed of 25 mph!";
		}
		
		@Override
		public String eat() {
			return "Cows eat grass.";
		}
	}
}
