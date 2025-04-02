package com.sunbeam;

import java.util.Scanner;

public class InvoiceTest {
	public static Invoice getInstance() {
		Invoice i = new Invoice();
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************");
		System.out.print("Enter the Part no.- ");
		i.setPartNo(sc.next());
		sc.nextLine();
		System.out.println("Enter Part Description: ");
		i.setPartDesc(sc.nextLine());
		System.out.println("Enter Part Quantity: ");
		i.setQuantity(sc.nextInt());
		System.out.println("Enter the Price Per Item: ");
		i.setPrice(sc.nextDouble());
		System.out.println("****************************************");
		sc.close();
		return i;
	}
	public static void displayDetails(Invoice i) {
		System.out.println("****************************************");
		System.out.println("Printing the details- ");
		System.out.println("Part Number: "+i.getPartNo());
		System.out.println("Part Description: "+i.getPartDesc());
		System.out.println("Part Quantity: "+i.getQuantity());
		System.out.println("Enter the Price Per Item: "+i.getPrice());
		System.out.println("****************************************");
	}
	public static double calcAmount(Invoice i) {
		return i.getPrice()*i.getQuantity();
	}
	public static void setPriceValue(Invoice i,double price) {
		if(price < 0) {
			System.out.println("Please enter the positive value.");
			i.setPrice(0.0);
		}else {
			i.setPrice(price);
		}
	}
	public static void setQuantityValue(Invoice i,int Quantity) {
		if(Quantity < 0) {
			System.out.println("Please enter the positive value.");
			i.setQuantity(0);
		}else {
			i.setQuantity(Quantity);
		}
	}

	public static void main(String[] args) {
		Invoice i = InvoiceTest.getInstance();
		InvoiceTest.displayDetails(i);
		System.out.println("Total bill:"+InvoiceTest.calcAmount(i));
		InvoiceTest.setPriceValue(i,100);
		InvoiceTest.setQuantityValue(i,10);
		System.out.println("Total bill:"+InvoiceTest.calcAmount(i));
		InvoiceTest.setPriceValue(i,-10);
		System.out.println();
		System.out.println("After Setting the negative value-");
		InvoiceTest.displayDetails(i);
		System.out.println("Total bill:"+InvoiceTest.calcAmount(i));
		
		
	}

}
