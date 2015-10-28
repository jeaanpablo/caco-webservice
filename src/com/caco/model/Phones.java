<<<<<<< HEAD
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
	
	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores idStore;

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

	public Stores getIdStore() {
		return idStore;
	}

	public void setIdStore(Stores idStore) {
		this.idStore = idStore;
	}


	
	

=======
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
	
	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores idStore;

	@Column(name = "n_phone_main", nullable = false)
	private long phoneMain;
	
	@Column(name = "n_phone_sec", nullable = true)
	private long phoneSec;
	
	@Column(name = "n_phone_land1", nullable = true)
	private long phoneland1;
	
	@Column(name = "n_phone_land2", nullable = true)
	private long phoneland2;


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
	
	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	public Stores getIdStore() {
		return idStore;
	}

	public void setIdStore(Stores idStore) {
		this.idStore = idStore;
	}

	public long getPhoneMain() {
		return phoneMain;
	}

	public void setPhoneMain(long phoneMain) {
		this.phoneMain = phoneMain;
	}

	public long getPhoneSec() {
		return phoneSec;
	}

	public void setPhoneSec(long phoneSec) {
		this.phoneSec = phoneSec;
	}

	public long getPhoneland1() {
		return phoneland1;
	}

	public void setPhoneland1(long phoneland1) {
		this.phoneland1 = phoneland1;
	}

	public long getPhoneland2() {
		return phoneland2;
	}

	public void setPhoneland2(long phoneland2) {
		this.phoneland2 = phoneland2;
	}


	
	

>>>>>>> origin/master
}