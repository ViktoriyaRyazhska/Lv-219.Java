package com.softserve.webapp.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.softserve.webapp.dao.generic.ExhibitDAO;
import com.softserve.webapp.domain.Exhibit;

@Repository
@Transactional
public class ExhibitDAOimpl extends GenericDAOImpl<Exhibit> implements ExhibitDAO {
    public ExhibitDAOimpl() {
        super(Exhibit.class);
    }
    
    public ExhibitDAOimpl(Class<Exhibit> genericClass) {
        super(genericClass);
    }
    
    @SuppressWarnings({ "unchecked", "unused" })
    @Override
    public List<Object[]> findExhibitsByAuthor(String author) {    	
    	List<Object[]> list = null;
    	Query query = sessionFactory.getCurrentSession()
    			.createQuery("select e.name, e.hall from " 
    			+ "Exhibit e inner join e.author where first_name =:author");
    	query.setParameter("author", author);
    	list = query.list();
    	return query.list();    	
    }
    
    @SuppressWarnings({ "unchecked", "unused" })
    @Override
    public List<Object[]> findExhibitsByWorker(String worker) {    	
    	List<Object[]> list = null;
    	Query query = sessionFactory.getCurrentSession()
    			.createQuery("select e.name, h.name from Exhibit as e "
                        + "inner join e.hall as h "
                        + "inner join h.worker as w "
                		+ "where w.first_name =:worker");
    	query.setParameter("worker", worker);
    	list = query.list();
    	return query.list();    	
    }
    
    @SuppressWarnings({ "unchecked", "unused" })
    @Override
    public List<Object[]> findExhibitsByHall() {    	
    	List<Object[]> list = null;
    	Query query = sessionFactory.getCurrentSession()
    			.createQuery("select e.name, h.name from Exhibit as e "
                        + "inner join e.hall as h");
    	list = query.list();
    	return query.list();    	
    }
    
    @SuppressWarnings({ "unchecked", "unused" })
    @Override
    public List<Object[]> showExhibitStatistic() {    	
    	List<Object[]> list = null;
    	Query query = sessionFactory.getCurrentSession()
    			.createQuery("select e.name, e.material, e.technique, h.name, a.first_name, a.last_name from Exhibit as e "
                        + "inner join e.hall as h "
                		+ "inner join e.author as a");
    	list = query.list();
    	return query.list();    	
    }
    
    @SuppressWarnings({ "unchecked", "unused" })
    @Override
    public List<Object[]> showExhibit() {    	
    	List<Object[]> list = null;
    	Query query = sessionFactory.getCurrentSession()
    			.createQuery("select e.name, e.material, e.technique, h.name, a.first_name, a.last_name from Exhibit as e "
                        + "inner join e.hall as h "
                		+ "inner join e.author as a");
    	list = query.list();
    	return query.list();    	
    }
    
}
