package com.JFS.oopsconcepts;

public class LibraryBookManagementSystem {
	String title;
	String author;
	boolean isAvailable;
	public LibraryBookManagementSystem(String title,String author) {
		this.title=title;
		this.author=author;
		this.isAvailable=true;
		}
	public void barrowBook() {
		if(isAvailable) {
			isAvailable=false;
			System.out.println("Book borrowed successfully");
		}else {
			System.out.println("Book is already borrowed");
			
		}
	}
	public void returnBook() {
		if(!isAvailable) {
			isAvailable=true;
			System.out.println("Book returned successfully");
			}else {
				System.out.println("Book is not borrowed");
			}
	}
	public void displayInfo() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Availability:"+isAvailable);
	}

}
