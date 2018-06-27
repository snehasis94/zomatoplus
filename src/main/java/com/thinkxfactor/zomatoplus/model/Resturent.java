package com.thinkxfactor.zomatoplus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_resturent")
public class Resturent {
	@Id
	@GeneratedValue
	@Column(name="returent_id")
	private long id;
	
	@Column(name="city")
	private String city;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="contact")
	private String contact;
	@Column(name="description")
	private String description;
	@Column(name="website")
	private String website;
	@Column(name="like_count")
	private Integer like_count;
	public Resturent() {
		super();
	}
	public Resturent(String city, String name, String address, String contact, String description,
			String website, Integer like_count) {
		super();
		//this.id = id;
		this.city = city;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.description = description;
		this.website = website;
		this.like_count = like_count;
	}
	public long getId() {
		return id;
	}
	public String getCity() {
		return city;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getContact() {
		return contact;
	}
	public String getDescription() {
		return description;
	}
	public String getWebsite() {
		return website;
	}
	public Integer getLike_count() {
		return like_count;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setLike_count(Integer like_count) {
		this.like_count = like_count;
	}
	

	
	
	
	
	


	

}
