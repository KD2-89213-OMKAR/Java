package com.sunbeam.creditlimit;

public class CreditLimitCalculator {
	public static int newBalance(Customer c1) {
		int newBalance = Math.abs(c1.getStartBal()+c1.getTotalCharged()-c1.getTotalCredit());
		return newBalance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.acceptDisplay();
		c1.printDisplay();
		System.out.println("your new balance "+newBalance(c1));
		if(c1.getAllowedCredit() < newBalance(c1)) {
			System.out.printf("Your are exceeding your limit.\n"+" your limit is:  "+c1.getAllowedCredit()+"\nyour new balance "+newBalance(c1));
		}else {
			c1.setStartBal(newBalance(c1));
		}
		c1.printDisplay();
	}

}
