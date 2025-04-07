
public class Program1 {
	package package2;
	import java.util.Scanner;
	import java.util.Arrays;
	import java.util.Comparator;

	class SortByCityDesc implements Comparator<Student>{
		@Override
		public int compare(Student x , Student y) {
			int diff = y.getCity().compareTo(x.getCity());
			return diff;
		}
	}

	class SortByMarks implements Comparator<Student>{
		public int compare(Student x , Student y) {
			int diff = (int)(y.getMarks()-x.getMarks());
			return diff;
		}
	}

	class SortByName implements Comparator<Student>{
		public int compare(Student x , Student y) {
			int diff = x.getName().compareTo(y.getName());
			return diff;
		}
	}

	public class Program {
		public static Student[] getInstance() {
			Student[] arr = {
					new Student(1,"Aman","Meerut",70.22),
					new Student(2,"Rahul","Delhi",89.22),
					new Student(3,"Bakul","Mumbai",85.22),
					new Student(4,"Chirag","Patna",50.22)
			};
			return arr;
		}
		
		public static void print(Student[] arr , Comparator<Student> comparator) {
			Arrays.sort(arr, comparator);
			
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.println(arr[i]);
			}
		}
		
		public static int menuList() {
			Scanner sc = new Scanner(System.in);
			int choice;
			System.out.println("0. EXIT!!!!");
			System.out.println("1. Search By City(Desc)");
			System.out.println("2. Search by Marks(Desc)");
			System.out.println("3. Search by Name(Asc)");
			System.out.println("Enter choice:- ");
			choice = sc.nextInt();
			return choice;
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int choice;
			Student[] arr=Program.getInstance();
			Comparator<Student> comparator = null;
			while((choice = menuList())!=0) {
				switch(choice) {
				case 1:
					comparator = new SortByCityDesc();
					break;
				case 2:
					comparator = new SortByMarks();
					break;
				case 3:
					comparator = new SortByName();
					break;
				default:
					System.out.println("Wrong choice!!!!Please Enter the Correct Choice!!!");
					break;
				}
				Program.print(arr, comparator);
			}
			
		}

	}

}
