package com.softserve.webapp.service;

import java.util.List;

import com.softserve.webapp.domain.Hall;

public interface HallService {
	
	public void addHall(Hall hall);
	
	public void updateHall(Hall hall);
	
	public Hall getHallById(Integer id);
	
	public List<Hall> getAllHall();
	
	public void deleteHall(Hall hall);

}
