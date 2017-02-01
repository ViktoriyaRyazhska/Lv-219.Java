package com.softserve.webapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Workers")
public class Workers {
	
	@Id
	@Column(name = "id_worker")
	@GeneratedValue(strategy = GenerationType.IDENTITY)         
	private int id;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private String post;
	
	public Workers() {
		
	}
	
	public Workers(String first_name, String last_name, String post) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.post = post;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public void setFirst_name(String first_name) {
	    this.first_name = first_name;
	}
	
	public void setLast_name(String last_name) {
	    this.last_name = last_name;
	}
	
	public void setPost(String post) {
	    this.post = post;
	}
	
	public int getId() {
	    return id;
	}
	
	public String getFirst_name() {
	    return first_name;
	}
	
	public String getLast_name() {
	    return last_name;
	}
	
	public String getPost() {
	    return post;
	}

}
