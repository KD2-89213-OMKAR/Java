package com.assignment;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		System.out.println("Str: "+ str);
		String[] test = str.trim().split(" ");
		System.out.println("Word count is: "+test.length); // this method to find number of word count is not efficient and have problems
		// this is correct method
		boolean check = true;
		int word = 0;
		for(int i = 0; i < str.length(); i++){
		    if(str.charAt(i) != ' ' && check == true){
		        word++;
		        check = false;
		    }
		    if(str.charAt(i) == ' ' && check == false){
		        check = true;
		    }
		}
		System.out.println("Word count: "+ word);
		
		
	}

}
