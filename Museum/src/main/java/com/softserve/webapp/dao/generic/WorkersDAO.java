package com.softserve.webapp.dao.generic;

import java.util.List;

import com.softserve.webapp.domain.Workers;

public interface WorkersDAO extends GenericDAO<Workers> {
	
	public abstract List<Object[]> findWorkersByPost(String post);

}
