package com.assignment;

import java.util.Scanner;

public class AssignmentQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		String test = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			test = test + str.charAt(i); 
		}
		
		if(str.equals(test)) {
			System.out.println("The string is palindrome.");
		}else {
			System.out.println("Not a palindrome.");
		}
		System.out.println("test: "+test);
		System.out.println("test: "+str);
		sc.close();
	}

}
