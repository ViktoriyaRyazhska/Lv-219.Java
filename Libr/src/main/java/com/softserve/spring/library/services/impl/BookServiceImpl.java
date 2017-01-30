package com.softserve.spring.library.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.spring.library.dao.interfaces.BookDAO;
import com.softserve.spring.library.entity.Book;
import com.softserve.spring.library.services.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookDAO bookDAO;
	
	/**
	 * 
	 * @param book
	 * @return <code>true</code> if there are available instances for this book, otherwise - <code>false</code>
	 */
	public boolean checkIfAvailableById(Integer bookId){
		boolean result= false;
		Long available = bookDAO.countAvailableInstances(bookId);
		if (available>0) {
			result = true;
		}
		return result;
	}
	
	public long getAvgReadingTimeById(Integer bookId) {
		Double avgReadingTime = bookDAO.getAvgReadingTime(bookId);
		return Math.round(avgReadingTime);
	}
	
	public long getTimesBookTakenById(Integer bookId) {
		Long timesTaken = bookDAO.timesWasTaken(bookId);
		return timesTaken;
	}
	
	public boolean checkIfAvailable(Book book){
		boolean result= false;
		Long available = bookDAO.countAvailableInstances(book.getId());
		if (available>0) {
			result = true;
		}
		return result;
	}
	
	public long getAvgReadingTime(Book book) {
		Double avgReadingTime = bookDAO.getAvgReadingTime(book.getId());
		return Math.round(avgReadingTime);
	}
	
	public long getTimesBookTaken(Book book) {
		Long timesTaken = bookDAO.timesWasTaken(book.getId());
		return timesTaken;
	}

	 
	public List<Book> findBookByAuthor(int authorId){
		List<Book> findedBook= bookDAO.bookByAuthor(authorId);
		return findedBook;
	}
	
	public List<Book> bookByCoAuthor(int coAuthorId){
		List<Book> findedBook = bookDAO.bookByCoAuthor(coAuthorId);
		return findedBook;
	}
	
	public List<Book> booksIndependanceInstances() {
		List<Book> independentBook = bookDAO.booksIndependanceInstances();
		return independentBook;
	}
	
	public long countInstances(String bookName){
		Long countInst=bookDAO.countInstances(bookName);
		return countInst;
	}
	
	public List<Object []> getNotPopular(String startDateString, String endDateString){
		List<Object []> notPopularList = bookDAO.getNotPopular(startDateString, endDateString);
		return notPopularList;
	}
	
	public List<Object []> getPopular(String startDateString, String endDateString){
		List<Object []> popularList = bookDAO.getPopular(startDateString, endDateString);
		return popularList;
	}
	
	public List<Book> getBookInfo(int bookId){
		List<Book> bookInfo =bookDAO.getBookInfo(bookId);
		return bookInfo;
	}
	
	public void addBook(Book book){
		bookDAO.addElement(book);
	}
	
	public void updateBook(Book book){
		bookDAO.updateElement(book);
	}
	
	public Book getBookById(Integer id){
		return bookDAO.getElementByID(id);
	}
	
	public void deleteBook(Book book){
		bookDAO.deleteElement(book);
	}
	
	public List<Book> getAllBooks() {
		return bookDAO.getAllElements();
	}
}
