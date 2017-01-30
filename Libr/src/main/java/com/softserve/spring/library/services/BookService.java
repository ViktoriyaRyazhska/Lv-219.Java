package com.softserve.spring.library.services;

import java.util.List;

import com.softserve.spring.library.entity.Book;

public interface BookService {

	public boolean checkIfAvailableById(Integer bookId);
	
	public long getAvgReadingTimeById(Integer bookId);
	
	public long getTimesBookTakenById(Integer bookId);
	
	public boolean checkIfAvailable(Book book);
	
	public long getAvgReadingTime(Book book);
	
	public long getTimesBookTaken(Book book);

	 
	public List<Book> findBookByAuthor(int authorId);
	
	public List<Book> bookByCoAuthor(int coAuthorId);
	
	public List<Book> booksIndependanceInstances();
	
	public long countInstances(String bookName);
	
	public List<Object []> getNotPopular(String startDateString, String endDateString);
	
	public List<Object []> getPopular(String startDateString, String endDateString);
	
	public List<Book> getBookInfo(int BookId);
	
	public void addBook(Book book);
	
	public void updateBook(Book book);
	
	public Book getBookById(Integer id);
	
	public void deleteBook(Book book);
	
	public List<Book> getAllBooks();
}
