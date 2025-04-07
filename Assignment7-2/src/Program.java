
public class Program {
	package package2;
	import java.util.Scanner;
	import java.util.Arrays;
	public class Student implements Comparable<Student>{
		private int roll;
		private String name;
		private String city;
		private double marks;
		
		public Student() {
			
		}
		
		public Student(int roll , String name , String city , double marks) {
			this.roll = roll;
			this.name = name;
			this.city = city;
			this.marks = marks;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public double getMarks() {
			return marks;
		}

		public void setMarks(double marks) {
			this.marks = marks;
		}
		
		public String toString() {
			return String.format("%-10d%-15s%-15s%-20f",this.roll,this.name,this.city,this.marks);
		}
		
		@Override
		public int compareTo(Student other) {
			return this.roll - other.roll;
		}
	}

}
