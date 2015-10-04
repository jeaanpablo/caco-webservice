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
@Table(name = "stores")
public class Stores implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_store")
	private long idStore;

	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Clients client;

	@Column(name = "s_fantasy_name", nullable = false)
	private String fantasyName;

	@Column(name = "n_cnpj", nullable = false)
	private long cnpj;

	@Column(name = "s_description", nullable = true)
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "id_address", referencedColumnName = "id_address")
	private Address idAdress;

	@OneToMany(mappedBy = "idStore", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SalesParameter> salesParameterCollection;
	
	@OneToMany(mappedBy = "idStore", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<PointsParameter> pointsParameterCollection;

	public List<PointsParameter> getPointsParameterCollection() {
		return pointsParameterCollection;
	}

	public void setPointsParameterCollection(
			List<PointsParameter> pointsParameterCollection) {
		this.pointsParameterCollection = pointsParameterCollection;
	}
	
	@OneToMany(mappedBy = "id_store", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Phones> phonesCollection;
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Phones> getPhonesCollection() {
		return phonesCollection;
	}

	public void setPhonesCollection(List<Phones> phonesCollection) {
		this.phonesCollection = phonesCollection;
	}

	@OneToMany(mappedBy = "idStore", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Sales> salesCollection;

	@OneToMany(mappedBy = "stores", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<BuyingHistory> buyingHistoryCollection;

	@OneToMany(mappedBy = "idStore", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<HistoryIndication> historyIndicationCollection;

	@OneToMany(mappedBy = "stores", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Products> productsCollection;

	@OneToMany(mappedBy = "idStore", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ArchievedTransactions> archievedTransactionsCollection;
	
	@OneToMany(mappedBy = "idStore", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<LoyalityCard> clientPointsCollection;

	public List<LoyalityCard> getClientPointsCollection() {
		return clientPointsCollection;
	}

	public void setClientPointsCollection(List<LoyalityCard> clientPointsCollection) {
		this.clientPointsCollection = clientPointsCollection;
	}

	public List<ArchievedTransactions> getArchievedTransactionsCollection() {
		return archievedTransactionsCollection;
	}

	public void setArchievedTransactionsCollection(
			List<ArchievedTransactions> archievedTransactionsCollection) {
		this.archievedTransactionsCollection = archievedTransactionsCollection;
	}

	public List<HistoryIndication> getHistoryIndicationCollection() {
		return historyIndicationCollection;
	}

	public void setHistoryIndicationCollection(
			List<HistoryIndication> historyIndicationCollection) {
		this.historyIndicationCollection = historyIndicationCollection;
	}

	public List<BuyingHistory> getBuyingHistoryCollection() {
		return buyingHistoryCollection;
	}

	public void setBuyingHistoryCollection(
			List<BuyingHistory> buyingHistoryCollection) {
		this.buyingHistoryCollection = buyingHistoryCollection;
	}

	public List<Sales> getSalesCollection() {
		return salesCollection;
	}

	public void setSalesCollection(List<Sales> salesCollection) {
		this.salesCollection = salesCollection;
	}

	public List<SalesParameter> getSalesParameterCollection() {
		return salesParameterCollection;
	}

	public void setSalesParameterCollection(
			List<SalesParameter> salesParameterCollection) {
		this.salesParameterCollection = salesParameterCollection;
	}

	public List<Products> getProductsCollection() {
		return productsCollection;
	}

	public void setProductsCollection(List<Products> productsCollection) {
		this.productsCollection = productsCollection;
	}

	public long getIdStore() {
		return idStore;
	}

	public void setIdStore(long idStore) {
		this.idStore = idStore;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public Address getIdAdress() {
		return idAdress;
	}

	public void setIdAdress(Address idAdress) {
		this.idAdress = idAdress;
	}

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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