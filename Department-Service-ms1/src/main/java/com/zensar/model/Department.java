package com.zensar.model;

public class Department {

	private String Id;
	private String name;

	public Department() {

	}

	public Department(String id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
