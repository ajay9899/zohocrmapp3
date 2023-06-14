package com.zohocrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name",nullable = false,length=45)
	private String firstName;
	
	@Column(name = "last_name",nullable = false,length=45)
	private String lastName;
	
	private String source;
	
	@Column(name = "email",nullable = false,length=128,unique =true )
	private String Email;
	
	@Column(nullable = false,length=10,unique =true )
	private long Mobile;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		this.Mobile = mobile;
	}
	
	
	
	

}
