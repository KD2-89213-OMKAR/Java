import java.util.Scanner;
public class CheckDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		if(!sc.hasNextInt()) {
			if(sc.hasNextDouble()) {
				a = sc.nextDouble();
				System.out.print("Enter the Second number: ");
				if(!sc.hasNextInt()) {
					if(sc.hasNextDouble()) {
						b = sc.nextDouble();
						System.out.print("Avg of num1 & num2 is: "+(a+b)/2);
					}else {
						System.out.println("Invalid number!!");
						System.exit(0);
					}
				}else {
					System.out.println("you enter the integer value.!! which is not double");
					System.exit(1);
				}
			}else {
				System.out.println("Invalid number!!");
				System.exit(0);
			}
		}else {
			System.out.println("you enter the integer value.!! which is not double");
			System.exit(1);
		}
		
		sc.close();
	}

}
