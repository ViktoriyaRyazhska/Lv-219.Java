package com.softserve.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.webapp.dao.generic.ExcursionDAO;
import com.softserve.webapp.domain.Excursion;
import com.softserve.webapp.service.ExcursionService;

@Service
public class ExcursionServiceImpl implements ExcursionService {

	@Autowired
    private ExcursionDAO excursions;
	
	@Override
	public void addExcursion(Excursion excursion) {
		excursions.add(excursion);		
	}

	@Override
	public void updateExcursion(Excursion excursion) {
		excursions.update(excursion);		
	}

	@Override
	public Excursion getExcursionById(Integer id) {
		return excursions.getById(id);
	}

	@Override
	public List<Excursion> getAllExcursion() {
		return excursions.getAllElements();
	}

	@Override
	public void deleteExcursion(Excursion excursion) {
		excursions.delete(excursion);		
	}

}
