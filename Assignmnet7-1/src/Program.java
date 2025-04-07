
	package package1;
	import java.util.Scanner;
	import java.util.Arrays;
	import java.util.Collections;

	public class Program {
		
		public static<T extends Number> void min(T[] arr) {
			T min = arr[0];
			for(T t: arr) {
				if(min.doubleValue() > t.doubleValue()) {
					min = t;
				}
			}
			System.out.println("Minimum element is:- "+min);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array:- ");
			Integer [] arr = new Integer[sc.nextInt()];
			System.out.println("Enter the elements:- ");
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = sc.nextInt();
			}
			
			Program.min(arr);
		}

	}



