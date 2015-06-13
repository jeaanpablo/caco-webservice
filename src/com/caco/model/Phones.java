package com.caco.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "phones")
public class Phones implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_phone")
	private long idPhone;

	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Clients client;

	@Column(name = "n_phone", nullable = false)
	private long phone;

	@Column(name = "s_phone_type", nullable = false)
	private String phoneType;

	public long getIdPhone() {
		return idPhone;
	}

	public void setIdPhone(long idPhone) {
		this.idPhone = idPhone;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
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

}