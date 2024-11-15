package book;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//create the book objects
		Book book1 = new Book("Dostoyevski", "Crime and Punishment", "9788412664867");
		Book book2 = new Book("Machiavelli", "Prince", "1111112664867");
		
		//add book
		Book.addBook(book1);
		Book.addBook(book2);
		
		ArrayList<Book> bookList = Book.getBookList();
		
		System.out.println("List of books: ");
		
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " by "+ book.getAuthor() + ", ISBN: "+ book.getISBN());
		}
		
		//removing
		Book.removeBook(book2);
		
		System.out.println("After Removing List of books: ");
		
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " by "+ book.getAuthor() + ", ISBN: "+ book.getISBN());
		}
		
	}
}
