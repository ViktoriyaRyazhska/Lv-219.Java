package com.softserve.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.webapp.dao.generic.HallDAO;
import com.softserve.webapp.domain.Hall;
import com.softserve.webapp.service.HallService;

@Service
public class HallServiceImpl implements HallService {

	@Autowired
    private HallDAO halls;
	
	@Override
	public void addHall(Hall hall) {
		halls.add(hall);
	}

	@Override
	public void updateHall(Hall hall) {
		halls.update(hall);
	}

	@Override
	public Hall getHallById(Integer id) {
		return halls.getById(id);
	}

	@Override
	public List<Hall> getAllHall() {
		return halls.getAllElements();
	}

	@Override
	public void deleteHall(Hall hall) {
		halls.delete(hall);
	}

}
