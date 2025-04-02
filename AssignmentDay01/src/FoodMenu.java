import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalBill = 0;
		Scanner sc = new Scanner(System.in);
		int choice;
		int quantity;
		do {
			System.out.println("1. Dosa");
			System.out.println("2. Samosa");
			System.out.println("3. Idli");
			System.out.println("4. Vada");
			System.out.println("5. Masala Dosa");
			System.out.println("6. Rice");
			System.out.println("7. Dal");
			System.out.println("8. Rice1");
			System.out.println("9. Burger");
			System.out.println("10. Generate Bill");
			System.out.print("Choice:");
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.print("Price of Dosa is 40.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*40;
				break;
			case 2:
				System.out.println("Price of Samosa is 10.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*10;
				break;
			case 3:
				System.out.println("Price of Idli is 30.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*30;
				break;
			case 4:
				System.out.println("Price of Vada is 20.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*20;
				break;
			case 5:
				System.out.println("Price of Masala Dosa is 50.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*50;
				break;
			case 6:
				System.out.println("Price of Rice is 10.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*10;
				break;
			case 7:
				System.out.println("Price of Dal is 80.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*80;
				break;
			case 8:
				System.out.println("Price of Rice1 is 30.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*30;
				break;
			case 9:
				System.out.println("Price of Burger is 30.");
				System.out.print("Enter the Quantity: ");
				quantity = sc.nextInt();
				totalBill += quantity*30;
				break;
			case 10:
				System.out.println("Your Total Bill is: "+totalBill);
				break;
			}
		}while(choice != 10);
	
		sc.close();
	}

}
