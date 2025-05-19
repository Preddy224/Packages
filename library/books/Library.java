package com.library.books;

public class Library {

	private String libraryName;
	private int totalBooks; 
	
	public void setLibraryName(String libraryName) {
		this.libraryName=libraryName;
	}
	public void setTotalBooks(int totalBooks) {
		this.totalBooks=totalBooks;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public int getTitleBooks() {
		return totalBooks;
	}
	
	public void showLibraryDetails() {
		System.out.println("library name is :-" +  libraryName);
		System.out.println("No of books :- "+totalBooks);
	}
}
