package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Book {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return String.format("%-10s%.2f%10s%10d", isbn, price, authorName, quantity);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Book)) {
			return false;
		}
		Book employee1 = (Book) obj;
		if (isbn != employee1.isbn) {
			return false;
		}
		return true;

	}
}

public class demo7 {

	public static List<Book> list = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);

	public static Book acceptBook() {
		Book b = new Book();
		System.out.print("Enter the isbn - ");
		b.setIsbn(scanner.next());

		System.out.print("Enter the price - ");
		b.setPrice(scanner.nextDouble());

		System.out.print("Enter the author name - ");
		b.setAuthorName(scanner.next());

		System.out.print("Enter the quantity - ");
		b.setQuantity(scanner.nextInt());

		return b;
	}

	public static int menuBook() {
		System.out.println("0. Exit ");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. delete a book at given index");
		System.out.print("Enter your choice - ");
		return scanner.nextInt();
	}

	public static void displayForwardOrder() {
		Iterator<Book> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}

	public static void displayReverseOrder() {
		ListIterator<Book> i = list.listIterator(list.size());

		while (i.hasPrevious()) {
			System.out.println(i.previous().toString());
		}

	}

	public static boolean deleteBookGivenIndex() {
		System.out.print("Enter the index - ");

		int index = scanner.nextInt();

		if (index > 0 && list.size() > index) {
			list.remove(index);
			return true;
		}
		return false;
	}

	public static Book[] demoBook() {
		Book[] book = new Book[5];
		book[0] = new Book("123", 500.00, "Happy", 2);
		book[1] = new Book("234", 700.00, "Go", 3);
		book[2] = new Book("345", 200.00, "Dear", 8);
		book[3] = new Book("456", 300.00, "Hello", 1);
		book[4] = new Book("567", 100.00, "Bye", 5);
		return book;
	}

	public static void getInstance(Book[] book) {
		for (Book b : book) {
			list.add(b);
		}
	}

	public static void main(String[] args) {

		demo7.getInstance(demo7.demoBook());
		int choice;
		while ((choice = menuBook()) != 0) {
			switch (choice) {
			case 1:
				Book b = demo7.acceptBook();
				list.add(b);
				break;

			case 2:
				demo7.displayForwardOrder();
				break;

			case 3:
				displayReverseOrder();
				break;

			case 4:
				boolean bool = demo7.deleteBookGivenIndex();
				if (bool) {
					System.out.println("Employee Removed");
				} else {
					System.out.println("Employee not found");
				}
				break;

			default:
				System.out.println("Wrong input..");
				break;

			}
		}
	}
}

public class Program {

}
