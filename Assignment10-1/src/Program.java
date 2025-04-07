
public class Program {
	import java.util.Scanner;
	import java.util.stream.IntStream;
	import java.util.stream.Stream;

	public class Q1 {

		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.print("Enter the number of factiorials :");
		    int number = sc.nextInt();
		    
		    int value = IntStream.rangeClosed(1, number)
	        .reduce(1, (a, b) -> a * b);
		    System.out.println(value);
		}

	}


}
