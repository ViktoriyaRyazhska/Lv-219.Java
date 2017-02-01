package com.softserve.webapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Author")
public class Author {
	
	@Id
	@Column(name = "id_author")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private String nationality;
	
	public Author() {
		
	}
	
	public Author(String first_name, String last_name, String nationality) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.nationality = nationality;
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
	
	public void setNationality(String nationality) {
	    this.nationality = nationality;
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
	
	public String getNationality() {
	    return nationality;
	}

}
