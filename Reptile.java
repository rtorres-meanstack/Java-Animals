package com.Lesson8HandsOn.Animals;
import com.Lesson8HandsOn.Animals.Animals.Animal;

public interface Reptile extends Animal {
	String crawl();
	
	public class Turtle implements Reptile{

		public String eat() {
			return "Turtles eat lettuce.";
		}
		
		@Override
		public String crawl() {
			return "Turtles have a crawl speed of 3 mph!";
		}
		
	}
	
	public class Lizard implements Reptile{

		public String eat() {
			return "Lizards eat crickets.";
		}
		
		@Override
		public String crawl() {
			return "Lizards have a crawl speed of 12 mph!";
		}
		
	}
}
