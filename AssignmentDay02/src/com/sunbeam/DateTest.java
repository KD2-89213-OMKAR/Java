package com.sunbeam;

import java.util.Scanner;

public class DateTest {
	public static Date getInstance() {
		Date i = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************");
		System.out.print("Enter day: ");
		i.setDay(sc.nextInt());
		System.out.println("Enter month: ");
		i.setMonth(sc.nextInt());
		System.out.println("Enter year: ");
		i.setYear(sc.nextInt());
		System.out.println("****************************************");
		return i;
	}
	public static void displayDate(Date i) {
		System.out.println("****************************************");
		System.out.println("Printing the date- ");
		System.out.println("Date: "+i.getDay()+"/"+i.getMonth()+"/"+i.getYear());;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = DateTest.getInstance();
		System.out.println("Printing the Date..................");
		DateTest.displayDate(date);
	}

}
