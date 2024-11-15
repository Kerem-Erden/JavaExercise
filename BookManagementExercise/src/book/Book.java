package book;

import java.util.ArrayList;

public class Book {
	//create the attributes
	private String author;
	private String title;
	private String ISBN;
	
	//create the list
	private static ArrayList<Book> bookList = new ArrayList<Book>();
	
	
	//constructor
	public Book(String author, String title, String ISBN) {
		this.author = author;
		this.title = title;
		this.ISBN = ISBN;
	}
	
	//get and set methods
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	//add book method
	public static void addBook(Book book) {
		bookList.add(book);
	}
	
	//remove book method
	public static void removeBook(Book book) {
		bookList.remove(book);
	}
	
	//bookList get method
	public static ArrayList<Book> getBookList()	{
		return bookList;
	}
}
