package com.softserve.webapp.service;

import java.util.List;

import com.softserve.webapp.domain.Excursion;

public interface ExcursionService {
	
	public void addExcursion(Excursion excursion);
	
	public void updateExcursion(Excursion excursion);
	
	public Excursion getExcursionById(Integer id);
	
	public List<Excursion> getAllExcursion();
	
	public void deleteExcursion(Excursion excursion);

}
