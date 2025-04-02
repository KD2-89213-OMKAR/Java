package com.app.fruits;

public class Orange extends Fruit {
	public Orange() {
	}
	public Orange(String name, double weight, String  color) {
		super(name, weight, color);
	}
	public String toString() {
 		return "The fruit name: "+ getName() +", Color-"+ getColor() +", Weight- " + getWeight();
	}
	public String taste() {
		return "Sour";
	}
}
