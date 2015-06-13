package com.caco.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "loyality_card")
public class LoyalityCard implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_card")
	private long idCard;

	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Clients client;

	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores idStore;

	@Column(name = "n_total_points", nullable = false)
	private long totalPoints;

	public long getIdPoint() {
		return idCard;
	}

	public void setIdPoint(long idPoint) {
		this.idCard = idPoint;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}
	
	public Stores getIdStore() {
		return idStore;
	}

	public void setIdStore(Stores idStore) {
		this.idStore = idStore;
	}

	public long getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(long totalPoints) {
		this.totalPoints = totalPoints;
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