package com.sunbeam;

import java.util.Scanner;

public class EmployeeTest {
		public static Employee getInstance() {
			Employee i = new Employee();
			Scanner sc = new Scanner(System.in);
			System.out.println("****************************************");
			System.out.print("Enter the first name: ");
			i.setFirstName(sc.next());
			sc.nextLine();
			System.out.println("Enter last name: ");
			i.setLastName(sc.nextLine());
			System.out.println("Enter salary: ");
			i.setMonthlySalary(sc.nextInt());
			System.out.println("****************************************");
			return i;
		}
		public static void displayDetails(Employee i) {
			System.out.println("****************************************");
			System.out.println("Printing the details- ");
			System.out.println("First Name: "+i.getFirstName());
			System.out.println("Last Name: "+i.getLastName());
			System.out.println("Salary: "+i.getMonthlySalary());
			System.out.println("****************************************");
		}
		public static double getYearlySalary(Employee i) {
			return i.getMonthlySalary()*12;
		}
		public static double getHike(Employee i) {
			return 12*(i.getMonthlySalary()*(1.10));
		}
		public static void setSalaryValue(Employee i,double salary) {
			if(salary < 0) {
				System.out.println("Please enter the positive value.");
			}else {
				i.setMonthlySalary(salary);
			}
		}

		public static void main(String[] args) {
			Employee emp1 = EmployeeTest.getInstance();
			System.out.println("Printing the Employee Details..................");
			EmployeeTest.displayDetails(emp1);

			System.out.println("Printing the first Employee yearly salary............................");
			System.out.println("First employee yearly salary: "+EmployeeTest.getYearlySalary(emp1));
						
			System.out.println("Printing the second Employee yearly salary............................");
			System.out.println("Second employee yearly salary: "+EmployeeTest.getYearlySalary(emp1));
			System.out.println("Printing the second Employee yearly salary with hike..................");
			System.out.println("Second employee yearly salary with hike: "+EmployeeTest.getHike(emp1));
			
			System.out.println("****************************************");
			Employee emp2 = EmployeeTest.getInstance();
			System.out.println("Printing the Employee Details..................");
			EmployeeTest.displayDetails(emp2);
			
			System.out.println("Printing the Second Employee yearly salary............................");
			System.out.println("Second employee yearly salary: "+EmployeeTest.getYearlySalary(emp2));
			
			System.out.println("Printing the second Employee yearly salary with hike..................");
			System.out.println("Second employee yearly salary with hike: "+EmployeeTest.getHike(emp2));
			System.out.println("****************************************");
//			sc.close();
			
		}

}
