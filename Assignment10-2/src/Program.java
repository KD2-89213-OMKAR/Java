
public class Program {
	import java.util.Scanner;
	import java.util.stream.IntStream;
	import java.util.stream.Stream;

	public class Q2 {
		
		public static int add(int a , int b) {
			return IntStream.range(a, b).sum();
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the two number of factiorials :");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("The Addition value is : "+add(num1,num2));

		}

	}

}
