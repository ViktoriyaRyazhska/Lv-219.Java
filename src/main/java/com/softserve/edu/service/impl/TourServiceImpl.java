package com.softserve.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.edu.domain.Tour;
import com.softserve.edu.service.TourService;
@Service
public class TourServiceImpl implements TourService{

	@Autowired
	TourServiceImpl toutServiceImpl;
	
	@Override
	public void add(Tour tour) {
		toutServiceImpl.add(tour);
		
	}

	@Override
	public void update(Tour tour) {
		toutServiceImpl.add(tour);
		
	}

	@Override
	public Tour getById(Integer id) {
		return toutServiceImpl.getById(id);
	}

	@Override
	public List<Tour> getAllElements() {
	
		return toutServiceImpl.getAllElements();
	}

	@Override
	public void delete(Tour tour) {
		toutServiceImpl.delete(tour);
	}

}
