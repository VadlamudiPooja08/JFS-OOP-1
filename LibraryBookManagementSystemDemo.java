package com.JFS.oopsconcepts;

public class LibraryBookManagementSystemDemo {

	public static void main(String[] args) {
		LibraryBookManagementSystem b1=new LibraryBookManagementSystem("Java","James Gosling");
		LibraryBookManagementSystem b2=new LibraryBookManagementSystem("c","Dennis Ritchie");
		System.out.println("Initial book information:");
		b1.displayInfo();
		b2.displayInfo();
		System.out.println("Borrowing Book1:");
		b1.barrowBook();
		b1.displayInfo();
		System.out.println("Trying to borrow Book1 again:");
		b1.barrowBook();
		System.out.println("Returning Book1:");
		b1.returnBook();
		b1.displayInfo();
		System.out.println("Trying to return Book1 again:");
		b1.returnBook();
	}
}
