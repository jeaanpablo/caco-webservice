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
@Table(name = "buying_history")
public class BuyingHistory implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_history")
	private long IdHistory;

	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Clients client;

	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores stores;

	@ManyToOne
	@JoinColumn(name = "id_product", referencedColumnName = "id_product")
	private Products product;

	@Column(name = "n_quantity", nullable = true)
	private long Quantity;

	@Column(name = "t_buying_date", nullable = false)
	private Timestamp BuyingDate;

	@Column(name = "s_comentaries", nullable = true)
	private String Comentaries;

	@Column(name = "n_buy_points", nullable = false)
	private long BuyPoints;

	public long getIdHistory() {
		return IdHistory;
	}

	public void setIdHistory(long idHistory) {
		IdHistory = idHistory;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Stores getIdStore() {
		return stores;
	}

	public void setIdStore(Stores stores) {
		this.stores = stores;
	}

	public Products getIdProduct() {
		return product;
	}

	public void setIdProduct(Products product) {
		this.product = product;
	}

	public long getQuantity() {
		return Quantity;
	}

	public void setQuantity(long quantity) {
		Quantity = quantity;
	}

	public Timestamp getBuyingDate() {
		return BuyingDate;
	}

	public void setBuyingDate(Timestamp buyingDate) {
		BuyingDate = buyingDate;
	}

	public String getComentaries() {
		return Comentaries;
	}

	public void setComentaries(String comentaries) {
		Comentaries = comentaries;
	}

	public long getBuyPoints() {
		return BuyPoints;
	}

	public void setBuyPoints(long buyPoints) {
		BuyPoints = buyPoints;
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