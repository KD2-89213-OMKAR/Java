package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	private static Scanner sc = new Scanner(System.in);
	
	public static int menuList() {
		int choice;
		System.out.println("******************************");
		System.out.println("0. Exit.");
		System.out.println("1. Add Mango.");
		System.out.println("2. Add Orange.");
		System.out.println("3. Add Apple.");
		System.out.println("4. All fruit name.");
		System.out.println("5. All fresh fruit details.");
		System.out.println("6. All not fresh fruits in basket");
		System.out.println("7. Mark a fruit as stale with specific index.");
		System.out.println("8. Mark all Sour fruit stale.");
		System.out.println("******************************");
		System.out.print("Enter your choice- ");
		choice = sc.nextInt();
		return choice;
	}
	public static void displayAllFruitName(Fruit [] b, int index) {
		if(b == null) {
			System.out.println("wrong basket.");
			return;
		}
//		if(i == 0) {
//			
//		}
		for(int i = 0; i < index; i++) {
			if(!(b[i] == null)) {
				System.out.println("Fruit Name: "+b[i].getName());
			}else {
				System.out.println("No fruit found.");
			}
		}
	}
	public static void displayAllFreshFruits(Fruit [] b, int index) {
		if(b == null) {
			System.out.println("wrong basket.");
			return;
		}
//		if(i == 0) {
//			
//		}
		for(int i = 0; i < index; i++) {
			if(!(b[i] == null)) {
				if(b[i].isFresh() == true) {
					System.out.println(b[i].toString());
					System.out.println("Status: "+(b[i].isFresh() ? "Fresh" : "Not Fresh"));
					System.out.println("Taste: "+b[i].taste());
				}
			}else {
				System.out.println("No fruit found.");
			}
		}
	}
	public static void displayAllNotFreshFruits(Fruit [] b, int index) {
		if(b == null) {
			System.out.println("wrong basket.");
			return;
		}
//		if(i == 0) {
//			
//		}
		for(int i = 0; i < index; i++) {
			if(!(b[i] == null)) {
				if(b[i].isFresh() == false) {
//					System.out.println(b[i].toString());
					System.out.println("Taste: "+b[i].taste());
				}
			}else {
				System.out.println("No fruit found.");
			}
		}
	}
	public static void MarkFruitStale(Fruit [] b, int index) {
		if(b == null) {
			System.out.println("wrong basket.");
			return;
		}
//		if(i == 0) {
//			
//		}
		int check;
		System.out.print("Enter the index you want to find: ");
		check = sc.nextInt();
		if(check >= 0 && check <= index ) {
			b[check].setFresh(false);
		}else {
			System.out.println("O/P: Fruit not found.");
		}
	}
	public static void MarkAllSourFruitStale(Fruit [] b, int index) {
		if(b == null) {
			System.out.println("wrong basket.");
			return;
		}
		for(int i = 0; i < index; i++) {
			if(!(b[i] == null)) {
				if(b[i].taste().equalsIgnoreCase("Sour")) {
					System.out.println("Taste: "+b[i].taste());
					b[i].setFresh(false);
				}
			}else {
				System.out.println("No fruit found.");
			}
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter the size of basket- ");
		int size = sc.nextInt();
		Fruit[] bucket = new Fruit[size];
		int choice;
		int index = 0;
		while((choice = menuList()) != 0) {
			switch(choice) {
				case 1: {
					if(index < size) {
						bucket[index] = new Mango();
						bucket[index].acceptRecord();
						index++;
					}else {
						System.out.println("Basket is full..");
					}
				}
				break;
				case 2:{
					if(index < size) {
						bucket[index] = new Orange();
						bucket[index].acceptRecord();
						index++;
					}else {
						System.out.println("Basket is full..");
					}
				}
				break;
				case 3:{
					if(index < size) {
						bucket[index] = new Apple();
						bucket[index].acceptRecord();
						index++;
					}else {
						System.out.println("Basket is full..");
					}
				}
				break; 
				case 4: {
					displayAllFruitName(bucket, index);
					}
				break;
				case 5: {
					displayAllFreshFruits(bucket, index);
				}
				break;
				case 6:{
					displayAllNotFreshFruits(bucket, index);
				}
					break;
				case 7:{
					MarkFruitStale(bucket, index);
				}
					break;
				case 8: {
					MarkAllSourFruitStale(bucket, index);
				}
				break;
				default :
					System.out.println("Wrong input");
					break;
			}
		}
		System.out.println("Thank you.");
	}

}
