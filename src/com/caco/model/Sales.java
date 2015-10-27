package com.caco.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "sales")
public class Sales implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_sale")
	private long idSale;

	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Clients client;

	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores idStore;

	@OneToMany(mappedBy = "idSale", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ArchievedTransactions> archievedTransactionCollection;

	@Column(name = "s_description", nullable = true)
	private String description;

	@Column(name = "n_trade_points", nullable = false)
	private long tradePoints;

	@Column(name = "t_expiration_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar expirationDate;
	
	public List<ArchievedTransactions> getArchievedTransactionCollection() {
		return archievedTransactionCollection;
	}

	public void setArchievedTransactionCollection(
			List<ArchievedTransactions> archievedTransactionCollection) {
		this.archievedTransactionCollection = archievedTransactionCollection;
	}

	public long getIdSale() {
		return idSale;
	}

	public void setIdSale(long idSale) {
		this.idSale = idSale;
	}

	public Stores getIdStore() {
		return idStore;
	}

	public void setIdStore(Stores idStore) {
		this.idStore = idStore;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getTradePoints() {
		return tradePoints;
	}

	public void setTradePoints(long tradePoints) {
		this.tradePoints = tradePoints;
	}


	public Calendar getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Calendar expirationDate) {
		this.expirationDate = expirationDate;
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