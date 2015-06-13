package com.caco.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "history_indication")
public class HistoryIndication implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_indication")
	private long idIndication;

	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Clients client;

	@ManyToOne
	@JoinColumn(name = "id_client_indicated", referencedColumnName = "id_client")
	private Clients clientIndicated;

	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores idStore;

	@Column(name = "id_indicated_client", nullable = false)
	private long login;

	@Column(name = "n_indication_points", nullable = false)
	private long indicationPoints;

	@Column(name = "t_indication_date", nullable = false)
	private Timestamp indicationDate;
	

	public Stores getIdStore() {
		return idStore;
	}

	public void setIdStore(Stores idStore) {
		this.idStore = idStore;
	}

	public Clients getClientIndicated() {
		return clientIndicated;
	}

	public void setClientIndicated(Clients clientIndicated) {
		this.clientIndicated = clientIndicated;
	}

	public long getIdIndication() {
		return idIndication;
	}

	public void setIdIndication(long idIndication) {
		this.idIndication = idIndication;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public long getLogin() {
		return login;
	}

	public void setLogin(long login) {
		this.login = login;
	}

	public long getIndicationPoints() {
		return indicationPoints;
	}

	public void setIndicationPoints(long indicationPoints) {
		this.indicationPoints = indicationPoints;
	}

	public Timestamp getIndicationDate() {
		return indicationDate;
	}

	public void setIndicationDate(Timestamp indicationDate) {
		this.indicationDate = indicationDate;
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