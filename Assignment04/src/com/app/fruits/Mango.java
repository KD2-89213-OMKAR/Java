package com.app.fruits;

//import java.util.Scanner;

public class Mango extends Fruit {
	public Mango(){
		
	}
	public Mango(String name, double weight, String  color) {
		super(name, weight, color);
	}
	public String toString() {
 		return "The fruit name: "+ getName() +", Color-"+ getColor() +", Weight- " + getWeight();
	}
	public String taste() {
		return "Sweet";
	}
}
