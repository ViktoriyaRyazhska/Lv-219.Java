package com.softserve.webapp.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Schedule")
public class Schedule {
	
	@Id
	@Column(name = "id_schedule")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "id_excursion")
	private Excursion excursion;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date date_start;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date date_end;
	
	public Schedule() {
		
	}
	
	public Schedule(Excursion excursion, Date date_start, Date date_end) {
		super();
		this.excursion = excursion;
		this.date_start = date_start;
		this.date_end = date_end;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public void setExursion(Excursion exursion) {
	    this.excursion = exursion;
	}
	
	public void setDate_start(Date date_start) {
	    this.date_start = date_start;
	}
	
	public void setDate_end(Date date_end) {
	    this.date_end = date_end;
	}
	
	public int getId() {
	    return id;
	}
	
	public Excursion getExursion() {
	    return excursion;
	}
	
	public Date getDate_start() {
	    return date_start;
	}
	
	public Date getDate_end() {
	    return date_end;
	}

}
