package com.sunbeam.creditlimit;

import java.util.Scanner;

public class Customer {
	private final int acc;
	private static int gen;
	private int startBal;
	private int totalCharged;
	private int totalCredit;
	private int allowedCredit;
	
	static {
		System.out.println("Initializing the static variable");
		gen = 1000;
	}
	public Customer() {
		this(0,0,0,0);
	}
	public Customer(int startBal, int totalCharged, int totalCredit, int allowedCredit) {
		this.acc = ++gen;
		this.startBal = startBal;
		this.totalCharged = totalCharged;
		this.totalCredit = totalCredit;
		this.allowedCredit = allowedCredit;
	}
	public void acceptDisplay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Accepting the details of customer.");
		System.out.println("*******************************");
		System.out.print("Enter the start balance: ");
		startBal = sc.nextInt();
		System.out.print("Enter the total of all items charged by the customer this month: ");
		totalCharged = sc.nextInt();
		System.out.print("Enter the total of all credit applied to the customer's this month: ");
		totalCredit = sc.nextInt();
		System.out.print("Enter the allowed limit of the customer for this month: ");
		allowedCredit = sc.nextInt();
	}
	public void printDisplay() {
		System.out.println("Printing the details of customer.");
		System.out.println("*******************************");
		System.out.println("The account number is: "+ acc);
		System.out.println("The start balance: "+startBal);
		System.out.println("The total of all items charged by the customer this month: "+ totalCharged);
		System.out.println("The total of all credit applied to the customer's this month: "+totalCredit);
		System.out.println("Enter the allowed limit of the customer for this month: "+allowedCredit);
		System.out.println();
	}
	public int getStartBal() {
		return startBal;
	}
	public void setStartBal(int startBal) {
		this.startBal = startBal;
	}
	public int getTotalCharged() {
		return totalCharged;
	}
	public void setTotalCharged(int totalCharged) {
		this.totalCharged = totalCharged;
	}
	public int getTotalCredit() {
		return totalCredit;
	}
	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}
	public int getAllowedCredit() {
		return allowedCredit;
	}
	public void setAllowedCredit(int allowedCredit) {
		this.allowedCredit = allowedCredit;
	}
}
