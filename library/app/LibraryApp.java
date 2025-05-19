package com.library.app;

import com.library.staff.Librarian;
import com.library.books.Library;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library library= new Library();
		library.setLibraryName("reddys");
		library.setTotalBooks(10000);
		
		Librarian librarian =new Librarian();
		librarian.setLibrarianName("sinu");
		librarian.setYearsOfExperience(10);
		
		
		library.showLibraryDetails();
		librarian.showLibrarianInfo();
	}

}
