import java.util.Scanner;

public class NumberSystemConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Enter the number : ");
		number = sc.nextInt();
		System.out.println("Given Number : "+ number);
		String binary = Integer.toBinaryString(number);
		String octal = Integer.toOctalString(number);
		String hexa = Integer.toHexString(number);
		System.out.println("Binary Equivalent : "+binary);
		System.out.println("Octal Equivalent : "+octal);
		System.out.println("HexaDecimal Equivalent : "+hexa);
		sc.close();
	}

}
