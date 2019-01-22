package com.chandu.db.dbFundmentals.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = { @NamedQuery(name = "retrive_ALL_User", query = " from User ") })
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	@Column(name="birth_date")
	private Date dob;
	
	
	public User()
	{
		
	}
	
	
	
	public User(int id, String name, String location, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dob = dob;
	}



	public User( String name, String location, Date dob) {
		this.name = name;
		this.location = location;
		this.dob = dob;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
