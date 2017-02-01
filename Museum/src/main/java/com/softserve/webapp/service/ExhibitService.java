package com.softserve.webapp.service;

import java.util.List;

import com.softserve.webapp.domain.Exhibit;

public interface ExhibitService {
	
	public void addExhibit(Exhibit exhibit);
	
	public void updateExhibit(Exhibit exhibit);
	
	public Exhibit getExhibitById(Integer id);
	
	public List<Exhibit> getAllExhibit();
	
	public void deleteExhibit(Exhibit exhibit);
	
	public List<Object[]> findExhibitsByAuthor(String name);
	
	public List<Object[]> findExhibitsByWorker(String worker);
	
	public List<Object[]> findExhibitsByHall();
	
	public List<Object[]> showExhibitStatistic();
	
	public List<Object[]> showExhibit();

}
