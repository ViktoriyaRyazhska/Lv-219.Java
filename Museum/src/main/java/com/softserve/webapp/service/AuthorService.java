package com.softserve.webapp.service;

import java.util.List;

import com.softserve.webapp.domain.Author;

public interface AuthorService {
	
	public void addAuthor(Author author);
	
	public void updateAuthor(Author author);
	
	public Author getAuthorById(Integer id);
	
	public List<Author> getAllAuthor();
	
	public void deleteAuthor(Author author);

}
