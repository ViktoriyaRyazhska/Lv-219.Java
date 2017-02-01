package com.softserve.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.webapp.dao.generic.ExhibitDAO;
import com.softserve.webapp.domain.Exhibit;
import com.softserve.webapp.service.ExhibitService;

@Service
public class ExhibitServiceImpl implements ExhibitService {

	@Autowired
    private ExhibitDAO exhibits;
	
	@Override
	public void addExhibit(Exhibit exhibit) {
		exhibits.add(exhibit);		
	}

	@Override
	public void updateExhibit(Exhibit exhibit) {
		exhibits.update(exhibit);		
	}

	@Override
	public Exhibit getExhibitById(Integer id) {
		return exhibits.getById(id);
	}

	@Override
	public List<Exhibit> getAllExhibit() {
		return exhibits.getAllElements();
	}

	@Override
	public void deleteExhibit(Exhibit exhibit) {
		exhibits.delete(exhibit);		
	}

	@Override
	public List<Object[]> findExhibitsByAuthor(String name) {
		return exhibits.findExhibitsByAuthor(name);
	}
	
	@Override
	public List<Object[]> findExhibitsByWorker(String worker) {
		return exhibits.findExhibitsByWorker(worker);
	}

	@Override
	public List<Object[]> findExhibitsByHall() {
		return exhibits.findExhibitsByHall();
	}

	@Override
	public List<Object[]> showExhibitStatistic() {
		return exhibits.showExhibitStatistic();
	}
	
	@Override
	public List<Object[]> showExhibit() {
		return exhibits.showExhibit();
	}

}
