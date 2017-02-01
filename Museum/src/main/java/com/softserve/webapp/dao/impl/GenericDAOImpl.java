package com.softserve.webapp.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softserve.webapp.dao.generic.GenericDAO;

@Repository
@Transactional
public class GenericDAOImpl<E> implements GenericDAO<E> {
	
	@Autowired
    protected SessionFactory sessionFactory;
	
	private Class<E> genericClass;
	
	public GenericDAOImpl() {
        
    }

    public GenericDAOImpl(Class<E> genericClass) {
        this.genericClass = genericClass;
    }
    
    @Override
    public void add(E element) {    	
    	sessionFactory.getCurrentSession().save(element);    	
    }

    @Override
    public void update(E element) {
    	sessionFactory.getCurrentSession().update(element);
    }

    @SuppressWarnings("unchecked")
    @Override
    public E getById(Integer id) {
    	return (E) sessionFactory.getCurrentSession().get(genericClass, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<E> getAllElements() {
    	return sessionFactory.getCurrentSession().createCriteria(genericClass).list();
    }

    @Override
    public void delete(E element) {
    	sessionFactory.getCurrentSession().delete(element);
    }

}
