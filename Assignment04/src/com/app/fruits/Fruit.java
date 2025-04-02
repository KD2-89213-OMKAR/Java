package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit() {
		this.color = "";
		this.weight = 0.0;
		this.name = "";
		this.isFresh = true;
	}
	public Fruit(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public abstract String toString();
	public abstract String taste();
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fruit name-");
		setName(sc.next());
		System.out.print("Enter the fruit color-");
		setColor(sc.next());
		System.out.print("Enter the fruit weight-");
		setWeight(sc.nextDouble());
	}
}
