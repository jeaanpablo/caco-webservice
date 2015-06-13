package com.caco.model;

import java.io.Serializable;
import java.sql.Timestamp;
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
@Table(name = "archieved_transactions")
public class ArchievedTransactions implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_transaction")
	private long idTransaction;

	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Clients client;

	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores idStore;

	@Column(name = "t_transaction_date", nullable = false)
	private Timestamp transactionDate;

	@Column(name = "n_used_points", nullable = false)
	private long usedPoints;

	@ManyToOne
	@JoinColumn(name = "id_sale", referencedColumnName = "id_sale")
	private Sales idSale;

	public Sales getIdSale() {
		return idSale;
	}

	public void setIdSale(Sales idSale) {
		this.idSale = idSale;
	}

	public long getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(long idTransaction) {
		this.idTransaction = idTransaction;
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

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public long getUsedPoints() {
		return usedPoints;
	}

	public void setUsedPoints(long usedPoints) {
		this.usedPoints = usedPoints;
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