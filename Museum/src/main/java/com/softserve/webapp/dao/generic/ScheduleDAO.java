package com.softserve.webapp.dao.generic;

import java.util.Date;
import java.util.List;

import com.softserve.webapp.domain.Schedule;

public interface ScheduleDAO extends GenericDAO<Schedule> {
	
	public abstract List<Object[]> findExcursions(Date dateStart, Date dateEnd);
	
	public abstract int countOfExcursions(Date dateStart, Date dateEnd);
	
	public abstract List<Object[]> showGuidesStatistic(Date dateStart, Date dateEnd);

}
