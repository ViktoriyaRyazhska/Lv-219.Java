package com.softserve.edu.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.edu.dao.impl.VisaDaoImpl;
import com.softserve.edu.domain.Visa;
import com.softserve.edu.service.VisaService;

@Service
public class VisaServiceImpl implements VisaService {

	@Autowired
	VisaDaoImpl visaDaoImpl;

	@Override
	public void add(Visa visa) {
		visaDaoImpl.add(visa);
	}

	@Override
	public void update(Visa visa) {
		visaDaoImpl.update(visa);

	}

	@Override
	public Visa getById(Integer id) {

		return visaDaoImpl.getById(id);
	}

	@Override
	public List<Visa> getAllElements() {

		return visaDaoImpl.getAllElements();
	}

	@Override
	public void delete(Visa visa) {
		visaDaoImpl.delete(visa);

	}

	@Override
	public Set<Visa> find(String firstName, String lastName) {
		return visaDaoImpl.find(firstName, lastName);
	}

	@Override
	public int countOfVisas(String country) {

		return visaDaoImpl.countOfVisas(country);
	}

	@Override
	public List<Visa> findValid(String firstName, String lastName, String country) {

		return visaDaoImpl.findValid(firstName, lastName, country);
	}

}
