package com.softserve.webapp.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.softserve.webapp.dao.generic.WorkersDAO;
import com.softserve.webapp.domain.Workers;

@Repository
@Transactional
public class WorkersDAOimpl extends GenericDAOImpl<Workers> implements WorkersDAO {
    public WorkersDAOimpl() {
        super(Workers.class);
    }
    
    public WorkersDAOimpl(Class<Workers> genericClass) {
        super(genericClass);
    }
    
    @SuppressWarnings({ "unchecked", "unused" })
    @Override
    public List<Object[]> findWorkersByPost(String post) {
    	List<Object[]> list = null;
    	Query query = sessionFactory.getCurrentSession()
    			.createQuery("select w.first_name, w.last_name from Workers w "
                    + "where post =:post "
    				+ "group by w.last_name");
    	query.setParameter("post", post);
    	list = query.list();
    	return query.list();
    }
    
}
