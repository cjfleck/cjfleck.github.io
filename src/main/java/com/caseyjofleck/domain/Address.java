package com.caseyjofleck.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Holds details for Addresses.  
 *
 */
@Entity
// Add table annotation for Address
@Table(name="address")
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id") private int id;
	@Column(name="street") private String street;
	@Column(name="city") private String city;
	@Column(name="zip") private String zip;
    @Column(name="country") private String country;
	
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}