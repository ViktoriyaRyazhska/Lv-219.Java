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
@Table(name = "Exhibit")
public class Exhibit {
	
	@Id
	@Column(name = "id_exhibit")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "id_hall")
	private Hall hall;
	
	@ManyToOne
    @JoinColumn(name = "id_author")
	private Author author;
	
	@Column
	private String name;
	
	@Column
	private String material;
	
	@Column
	private String technique;
	
	public Exhibit() {
		
	}
	
	public Exhibit(Hall hall, Author author, String name, String material, String technique) {
		super();
		this.hall = hall;
		this.author = author;
		this.name = name;
		this.material = material;
		this.technique = technique;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public void setHall(Hall hall) {
	    this.hall = hall;
	}
	
	public void setAuthor(Author author) {
	    this.author = author;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public void setMaterial(String material) {
	    this.material = material;
	}
	
	public void setTechnique(String technique) {
	    this.technique = technique;
	}
	
	public int getId() {
	    return id;
	}
	
	public Hall getHall() {
	    return hall;
	}
	
	public Author getAuthor() {
	    return author;
	}
	
	public String getName() {
	    return name;
	}
	
	public String getMaterial() {
	    return material;
	}
	
	public String getTechnique() {
	    return technique;
	}

}
