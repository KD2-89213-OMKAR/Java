package com.assignment;

import java.util.Scanner;

public class AssignmentQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		String test = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			test = test + str.charAt(i); 
		}
		System.out.println("test: "+test);

	}

}
