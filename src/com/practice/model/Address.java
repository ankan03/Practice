package com.practice.model;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	
	@Column(name = "STREET",length = 100)
	private String street;
	
	@Column(name = "CITY",length = 10)
	private String city;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Transient
	private Double x;
	
	@Lob
	private byte[] image;
	
	public Address() {
		super();
	}
	public Address(String street, String city, boolean isOpen, Date date, Double x, byte[] image) {
		super();
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.date = date;
		this.x = x;
		this.image = image;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", date=" + date + ", x=" + x + ", image=" + image.toString() + "]";
	}
	
	
	
	
}
