package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinates of first point: ");

		System.out.print("Enter the first point: ");
		double x1 = sc.nextDouble();
		System.out.print("Enter the second point: ");			
		double y1 = sc.nextDouble();
		Point2D p1 = new Point2D(x1,y1);
		
		System.out.println("**********************");
		
		System.out.println("Enter the co-ordinates of second point: ");
		System.out.print("Enter the first point: ");
		double x2 = sc.nextDouble();
		System.out.print("Enter the second point: ");			
		double y2 = sc.nextDouble();
		Point2D p2 = new Point2D(x2,y2);
		System.out.println("***********************");
	
		System.out.println("Printing the Two co-ordinates: ");
		System.out.println("p1's details "+p1.getDetails());
		System.out.println("p2's details "+p2.getDetails());
		
		System.out.println("Invoke the isEqual method  ");
		if(p1.isEqual(p2)) {
			System.out.println("p1 & p2 are located at the same position.");
		}else{
			System.out.println("p1 & p2 are not located at the same position.");
			System.out.println("Distance between p1 & p2 is: "+p1.calculateDistance(p2));
		}
	}

}
