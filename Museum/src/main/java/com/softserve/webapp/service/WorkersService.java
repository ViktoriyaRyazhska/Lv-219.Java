package com.softserve.webapp.service;

import java.util.List;

import com.softserve.webapp.domain.Workers;

public interface WorkersService {
	
	public void addWorkers(Workers workers);
	
	public void updateWorkers(Workers workers);
	
	public Workers getWorkersById(Integer id);
	
	public List<Workers> getAllWorkers();
	
	public void deleteWorkers(Workers workers);
	
	public List<Object[]> findWorkersByPost(String post);

}
