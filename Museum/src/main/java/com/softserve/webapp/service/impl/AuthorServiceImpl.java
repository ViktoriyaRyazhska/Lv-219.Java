package com.softserve.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.webapp.dao.generic.AuthorDAO;
import com.softserve.webapp.domain.Author;
import com.softserve.webapp.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
    private AuthorDAO authors;
	
	@Override
	public void addAuthor(Author author) {
		authors.add(author);		
	}

	@Override
	public void updateAuthor(Author author) {
		authors.update(author);		
	}

	@Override
	public Author getAuthorById(Integer id) {
		return authors.getById(id);
	}

	@Override
	public List<Author> getAllAuthor() {
		return authors.getAllElements();
	}

	@Override
	public void deleteAuthor(Author author) {
		authors.delete(author);		
	}

}
