package com.caco.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "address")
public class Address implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_address")
	private long idAddress;
	
	@OneToMany(mappedBy = "idAddress", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Address> addressCollection;

	@Column(name = "s_street", nullable = false)
	private String street;

	@Column(name = "n_number", nullable = false)
	private long number;

	@Column(name = "s_district", nullable = false)
	private String district;

	@Column(name = "s_city", nullable = false)
	private String city;

	@Column(name = "s_state", nullable = false)
	private String state;

	@Column(name = "n_zip_code", nullable = false)
	private long zipCode;

	@Column(name = "s_country", nullable = false)
	private String country;
	
	public List<Address> getAddressCollection() {
		return addressCollection;
	}

	public void setAddressCollection(List<Address> addressCollection) {
		this.addressCollection = addressCollection;
	}
	
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Clients> clientsCollection;

	public long getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(long idAddress) {
		this.idAddress = idAddress;
	}

	public List<Clients> getClientsCollection() {
		return clientsCollection;
	}

	public void setClientsCollection(List<Clients> clientsCollection) {
		this.clientsCollection = clientsCollection;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	public Address insert(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

}