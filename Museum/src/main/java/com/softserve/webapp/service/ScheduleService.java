package com.softserve.webapp.service;

import java.util.Date;
import java.util.List;

import com.softserve.webapp.domain.Schedule;

public interface ScheduleService {
	
	public void addSchedule(Schedule schedule);
	
	public void updateSchedule(Schedule schedule);
	
	public Schedule getScheduleById(Integer id);
	
	public List<Schedule> getAllSchedule();
	
	public void deleteSchedule(Schedule schedule);
	
	public List<Object[]> findExcursions(Date dateStart, Date dateEnd);
	
	public int countOfExcursions(Date dateStart, Date dateEnd);
	
	public List<Object[]> showGuidesStatistic(Date dateStart, Date dateEnd);

}
