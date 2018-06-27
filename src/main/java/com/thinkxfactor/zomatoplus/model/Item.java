package com.thinkxfactor.zomatoplus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_item")
public class Item {
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private long id;
	
	@Column(name="resturent_id")
	private long resturentid;
	
	@Column(name="name")
	private String name;
	@Column(name="price")
	private Double price;
	@Column(name="description")
	private String description;
	public Item() {
		super();
	}
	public Item(long resturentid, String name, Double price, String description) {
		super();
		this.resturentid = resturentid;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public long getResturentid() {
		return resturentid;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setResturentid(long resturentid) {
		this.resturentid = resturentid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	
	
	
}
