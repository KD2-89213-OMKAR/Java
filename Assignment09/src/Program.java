

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Objects;
	import java.util.Scanner;
	
	public class Program {
		package demo;

	class Student {
		private int rollno;
		private String name;
		private int marks;

		public Student() {

		}

		public Student(int rollno, String name, int marks) {
			this.rollno = rollno;
			this.name = name;
			this.marks = marks;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		@Override
		public String toString() {
			return String.format("%-15d%-20s%-15d", rollno, name, marks);
		}

		@Override
		public int hashCode() {
			return Objects.hash(rollno);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return rollno == other.rollno;
		}

	}

	class StudentRollNoComparator implements Comparator<Student> {

		@Override
		public int compare(Student x, Student y) {
			return x.getRollno() - y.getRollno();
		}

	}

	class StudentNameComparator implements Comparator<Student> {

		@Override
		public int compare(Student x, Student y) {
			return x.getName().compareTo(y.getName());
		}

	}

	class StudentMarksComparator implements Comparator<Student> {

		@Override
		public int compare(Student x, Student y) {
			return x.getMarks() - y.getMarks();
		}

	}

	public class Assignment09_1 {

		public static List<Student> list = new ArrayList<Student>();
		public static Scanner sc = new Scanner(System.in);

		public static Student[] dummyList() {
			Student[] arr = new Student[5];
			arr[0] = new Student(13, "MNH", 90);
			arr[1] = new Student(24, "DEF", 80);
			arr[2] = new Student(43, "FGH", 70);
			arr[3] = new Student(23, "IJK", 78);
			arr[4] = new Student(83, "ABC", 85);
			return arr;
		}

		public static void insertDummyList(Student[] arr) {
			for (Student student : arr) {
				list.add(student);
			}
		}

		public static int menuList() {
			System.out.println("1. Add Student - ");
			System.out.println("2. Display all Student - ");
			System.out.println("3. Search Student - ");
			System.out.println("4. sort student on rollno - ");
			System.out.println("5. sort student on name - ");
			System.out.println("6. sort student on marks - ");
			System.out.print("Enter your choice - ");
			return sc.nextInt();
		}

		public static Student acceptStudent() {
			Student student = new Student();
			System.out.print("Enter the rollno - ");
			student.setRollno(sc.nextInt());

			sc.nextLine();

			System.out.print("Enter the name - ");
			student.setName(sc.nextLine());
			System.out.print("Enter the marks - ");
			student.setMarks(sc.nextInt());

			return student;

		}

		public static void addStudent(Student student) {
			list.add(student);
			System.out.println("Student Added..");
		}

		public static void displayStudentsUsingIterator() {
			Iterator<Student> i = list.iterator();

			while (i.hasNext()) {
				Student student = i.next();
				System.out.println(student.toString());
			}
		}

		public static Student SearchStudentByRollno(int rollno) {
			Student student = new Student();
			student.setRollno(rollno);
			int index = list.indexOf(student);
			if (index != -1) {
				Student element = list.get(index);
				return element;
			}
			return null;
		}

		public static void acceptStudentRollno(int[] arr) {
			System.out.print("Enter the Rollno - ");
			arr[0] = sc.nextInt();
		}

		public static void printStudentDetails(Student student) {
			if (student != null) {
				System.out.println(student.toString());
			} else {
				System.out.println("Student not found..");
			}
		}

		public static void printComparator(List<Student> list, Comparator<Student> student) {

			Student[] arr = new Student[list.size()];
			int i = 0;
			for (Student student2 : list) {
				arr[i] = student2;
				i++;
			}

			Arrays.sort(arr, student);

			for (Student s : arr) {
				System.out.println(s.toString());
			}

		}

		public static void main(String[] args) {
			int[] arr = new int[1];

			insertDummyList(dummyList());

			int choice;
			while ((choice = menuList()) != 0) {

				Comparator<Student> comparator = null;
				switch (choice) {
				case 1:
					addStudent(acceptStudent());
					break;

				case 2:
					displayStudentsUsingIterator();
					break;

				case 3:
					acceptStudentRollno(arr);
					printStudentDetails(SearchStudentByRollno(arr[0]));
					break;

				case 4:
					comparator = new StudentRollNoComparator();
					printComparator(list, comparator);
					break;

				case 5:
					comparator = new StudentNameComparator();
					printComparator(list, comparator);
					break;

				case 6:
					comparator = new StudentMarksComparator();
					printComparator(list, comparator);
					break;

				default:
					System.out.println("Invalid Input..");
					break;
				}
			}
		}
	}


}
