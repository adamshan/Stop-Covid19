package com.metier.entities;

public class Symtome {
	
	public Symtome(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	//attributes of class symptoms
	private int id;
	private String name;
	private String description;
	
	public Symtome() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Symtome(String name) {
		super();
		this.name = name;

	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	

}
