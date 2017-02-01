package com.softserve.webapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Excursion")
public class Excursion {
	
	@Id
	@Column(name = "id_excursion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "id_hall")
	private Hall hall;
	
	@ManyToOne
    @JoinColumn(name = "id_worker")
	private Workers guide;
	
	@Column
	private String name;
	
	@Column
	private double price;
	
	@Column
	private int duration_hours;
	
	@Column
	private Boolean done;
	
	public Excursion() {
		
	}
	
	public Excursion(Hall hall, Workers guide, String name, double price, int duration_hours, Boolean done) {
		super();
		this.hall = hall;
		this.guide = guide;
		this.name = name;
		this.price = price;
		this.duration_hours = duration_hours;
		this.done = done;		
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public void setHall(Hall hall) {
	    this.hall = hall;
	}
	
	public void setGuide(Workers guide) {
	    this.guide = guide;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public void setPrice(double price) {
	    this.price = price;
	}
	
	public void setDuration_hours(Integer duration_hours) {
	    this.duration_hours = duration_hours;
	}
	
	public void setDone(Boolean done) {
	    this.done = done;
	}
	
	public int getId() {
	    return id;
	}
	
	public Hall getHall() {
	    return hall;
	}
	
	public Workers getHuide() {
	    return guide;
	}
	
	public String getName() {
	    return name;
	}
	
	public double getPrice() {
	    return price;
	}
	
	public Integer getDuration_hours() {
	    return duration_hours;
	}
	
	public Boolean getDone() {
	    return done;
	}

}
