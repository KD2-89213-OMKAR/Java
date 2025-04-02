package com.app.fruits;

public class Apple extends Fruit {
	public Apple(){
		
	}
	public Apple(String name, double weight, String  color) {
		super(name, weight, color);
	}
	public String toString() {
		return "The fruit name: "+ getName() +", Color-"+ getColor() +", Weight- " + getWeight();
	}
	public String taste() {
		return "Sweet and Sour";
	}
}
