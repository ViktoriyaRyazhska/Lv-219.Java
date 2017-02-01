package com.softserve.webapp.dao.generic;

import java.util.List;

public interface GenericDAO<E> {
	
	public void add(E element);

    public void update(E element);

    public E getById(Integer id);

    public List<E> getAllElements();

    public void delete(E element);

}
