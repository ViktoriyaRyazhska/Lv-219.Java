package com.softserve.webapp.dao.generic;

import java.util.List;

import com.softserve.webapp.domain.Exhibit;

public interface ExhibitDAO extends GenericDAO<Exhibit> {
	
	public abstract List<Object[]> findExhibitsByAuthor(String author);
	
	public abstract List<Object[]> findExhibitsByWorker(String worker);

	public abstract List<Object[]> findExhibitsByHall();
	
	public abstract List<Object[]> showExhibitStatistic();
	
	public abstract List<Object[]> showExhibit();

}
