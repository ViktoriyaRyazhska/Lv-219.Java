package com.softserve.webapp.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.softserve.webapp.dao.generic.AuthorDAO;
import com.softserve.webapp.domain.Author;

@Repository
@Transactional
public class AuthorDAOimpl extends GenericDAOImpl<Author> implements AuthorDAO {
    public AuthorDAOimpl() {
        super(Author.class);
    }
    
    public AuthorDAOimpl(Class<Author> genericClass) {
        super(genericClass);
    }
}
