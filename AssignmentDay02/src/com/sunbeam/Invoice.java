package com.sunbeam;

import java.util.Scanner;

class Invoice{
	private String partNo;
	private String partDesc;
	private int quantity;
	private double price;
	
	public Invoice() {
		partNo = "0";
		partDesc = "";
		quantity = 0;
		price = 0.0;
	}
	public Invoice(String partNo, String partDesc, int quantity, double price) {
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.price = price;
	}
	public void acceptInvoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************");
		System.out.println("Enter the details- ");
		System.out.print("Enter the Part Number: ");
		partNo = sc.next();
		System.out.print("Enter the Part Description: ");
		partDesc = sc.next();
		System.out.print("Enter the Part Quantity: ");
		int temp = sc.nextInt();
		if(temp < 0) {
			System.out.println("Enter the positive value");
			quantity = sc.nextInt();
		}else {
			quantity = temp;
		}
		System.out.print("Enter the Price Per Item: ");
		double temp1 = sc.nextDouble();
		if(temp1 < 0) {
			System.out.println("Enter the positive value");
			price = sc.nextDouble(); 
		}else {
			price = temp1;
		}
		sc.close();
	}
	// getter	
	public String getPartNo() {
		return partNo;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	// setter
	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;
		}else {
			this.quantity = quantity;
		}
	}
	public void setPrice(double price) {
		if(price < 0) {
			this.price = 0;
		}else {
			this.price = price;
		}
	}
}
