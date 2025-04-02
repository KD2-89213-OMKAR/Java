package assignment;
import java.util.Scanner;
public class ReadString {
	public static Scanner sc = new Scanner(System.in);
	public static void getInput() throws ExceptionLineTooLong {
		System.out.print("Enter the string: ");
		String str = sc.next();
		if(str.length() >  80) {
			throw( new ExceptionLineTooLong("The String is too long", str.length())); 
		}
		System.out.println("String length is: "+str.length());
	}
	public static void main(String[] args) {		
		try {
			getInput();
		}
		catch(ExceptionLineTooLong e){
			System.out.println("Error: "+ e.getString());
		}
	}

}
