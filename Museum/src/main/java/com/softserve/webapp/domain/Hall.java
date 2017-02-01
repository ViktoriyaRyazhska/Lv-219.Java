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
@Table(name = "Hall")
public class Hall {
	
	@Id
	@Column(name = "id_hall")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "id_worker")
	private Workers worker;
	
	@Column
	private String name;
	
	public Hall() {
		
	}
	
	public Hall(Workers worker, String name) {
		super();
		this.worker = worker;
		this.name = name;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public void setWorker(Workers worker) {
	    this.worker = worker;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public int getId() {
	    return id;
	}
	
	public Workers getWorker() {
	    return worker;
	}
	
	public String getName() {
	    return name;
	}
	
	public String toString(){
		return name;
	}

}
