package com.softserve.webapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.webapp.dao.generic.WorkersDAO;
import com.softserve.webapp.domain.Workers;
import com.softserve.webapp.service.WorkersService;

@Service
public class WorkersServiceImpl implements WorkersService {

	@Autowired
    private WorkersDAO worker;
	
	@Override
	public void addWorkers(Workers workers) {
		worker.add(workers);
	}

	@Override
	public void updateWorkers(Workers workers) {
		worker.update(workers);
	}

	@Override
	public Workers getWorkersById(Integer id) {
		return worker.getById(id);
	}

	@Override
	public List<Workers> getAllWorkers() {
		return worker.getAllElements();
	}

	@Override
	public void deleteWorkers(Workers workers) {
		worker.delete(workers);
	}

	@Override
	public List<Object[]> findWorkersByPost(String post) {
		return worker.findWorkersByPost(post);
	}

}
