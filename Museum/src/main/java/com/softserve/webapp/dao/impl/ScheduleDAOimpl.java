package com.softserve.webapp.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import java.util.Date;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.softserve.webapp.dao.generic.ScheduleDAO;
import com.softserve.webapp.domain.Schedule;

@Repository
@Transactional
public class ScheduleDAOimpl extends GenericDAOImpl<Schedule> implements ScheduleDAO {
    public ScheduleDAOimpl() {
        super(Schedule.class);
    }
    
    public ScheduleDAOimpl(Class<Schedule> genericClass) {
        super(genericClass);
    }
    
    @SuppressWarnings({ "unchecked", "unused" })
    @Override
    public List<Object[]> findExcursions(Date dateStart, Date dateEnd) {
		List<Object[]> list = null;
    	Query query = sessionFactory.getCurrentSession()
    			.createQuery("select excursion.name, excursion.price from Schedule schedule "
            		+ "inner join  schedule.excursion excursion "
            		+ "where schedule.date_start >:date1 and schedule.date_end <:date2");
    	query.setParameter("date1", dateStart);
    	query.setParameter("date2", dateEnd);
    	list = query.list();
    	return query.list();    	
    }
    
    @SuppressWarnings("rawtypes")
    @Override
    public int countOfExcursions(Date dateStart, Date dateEnd) {    	
    	int count = 0;
    	Query query = sessionFactory.getCurrentSession()
                .createQuery("select count(e.id) from Schedule as s "
            		+ "inner join s.excursion as e "
            		+ "where s.date_start >:date1 and s.date_end <:date2");
    	query.setParameter("date1", dateStart);
    	query.setParameter("date2", dateEnd);
    	List list = query.list();
        count = ((Number) list.get(0)).intValue();
        return count;        
    }
    
    @SuppressWarnings({ "unchecked", "unused" })
    @Override
    public List<Object[]> showGuidesStatistic(Date dateStart, Date dateEnd) {    	
    	List<Object[]> list = null;
    	Query query = sessionFactory.getCurrentSession()
    			.createQuery("select distinct g.first_name, g.last_name, sum(e.duration_hours), count(e.id) from Schedule as s "
            		+ "inner join s.excursion as e "
            		+ "inner join e.guide as g "
            		+ "where e.done = true "
            		+ "and s.date_start >:date1 and s.date_end <:date2 "
            		+ "group by g.last_name");
    	query.setParameter("date1", dateStart);
    	query.setParameter("date2", dateEnd);
    	list = query.list();
    	return query.list();    	
    }
    
}
