package com.softserve.webapp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserve.webapp.dao.generic.ScheduleDAO;
import com.softserve.webapp.domain.Schedule;
import com.softserve.webapp.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
    private ScheduleDAO schedules;
	
	@Override
	public void addSchedule(Schedule schedule) {
		schedules.add(schedule);
	}

	@Override
	public void updateSchedule(Schedule schedule) {
		schedules.update(schedule);
	}

	@Override
	public Schedule getScheduleById(Integer id) {
		return schedules.getById(id);
	}

	@Override
	public List<Schedule> getAllSchedule() {
		return schedules.getAllElements();
	}

	@Override
	public void deleteSchedule(Schedule schedule) {
		schedules.delete(schedule);
	}

	@Override
	public List<Object[]> findExcursions(Date dateStart, Date dateEnd) {
		return schedules.findExcursions(dateStart, dateEnd);
	}

	@Override
	public int countOfExcursions(Date dateStart, Date dateEnd) {
		return schedules.countOfExcursions(dateStart, dateEnd);
	}

	@Override
	public List<Object[]> showGuidesStatistic(Date dateStart, Date dateEnd) {
		return schedules.showGuidesStatistic(dateStart, dateEnd);
	}

}
