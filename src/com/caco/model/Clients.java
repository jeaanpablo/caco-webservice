package com.caco.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
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
@Table(name = "clients")
public class Clients implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_client")
	private long idClient;

	@ManyToOne
	@JoinColumn(name = "id_user", referencedColumnName = "id_user")
	private Users users;

	@Column(name = "s_name", nullable = false)
	private String name;

	@Column(name = "s_last_name", nullable = false)
	private String lastName;

	@Column(name = "n_cpf", nullable = false)
	private long cpf;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar bDate;

	@Column(name = "t_gender", nullable = false)
	private String gender;

	@Column(name = "s_rg", nullable = true)
	private String rg;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Phones> phonesCollection;
	

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Address> addressCollection;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<LoyalityCard> clientpointsCollection;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<HistoryIndication> historyIndicationCollection;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Sales> salesCollection;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Employees> employeesCollection;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ArchievedTransactions> archievedCollection;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<BuyingHistory> buyingHistoryCollection;

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Stores> storesCollection;

	@OneToMany(mappedBy = "clientIndicated", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<HistoryIndication> historyIndicatedCollection;

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public Users getIdUser() {
		return users;
	}

	public void setIdUser(Users users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public Calendar getbDate() {
		return bDate;
	}

	public void setbDate(Calendar bDate) {
		this.bDate = bDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public List<Stores> getStoresCollection() {
		return storesCollection;
	}

	public void setStoresCollection(List<Stores> storesCollection) {
		this.storesCollection = storesCollection;
	}

	public List<HistoryIndication> getHistoryCollection() {
		return historyIndicationCollection;
	}

	public void setHistoryCollection(
			List<HistoryIndication> historyIndicationCollection) {
		this.historyIndicationCollection = historyIndicationCollection;
	}

	public List<Sales> getSalesCollection() {
		return salesCollection;
	}

	public void setSalesCollection(List<Sales> salesCollection) {
		this.salesCollection = salesCollection;
	}

	public List<Employees> getEmployeesCollection() {
		return employeesCollection;
	}

	public void setEmployeesCollection(List<Employees> employeesCollection) {
		this.employeesCollection = employeesCollection;
	}

	public List<ArchievedTransactions> getArchievedCollection() {
		return archievedCollection;
	}

	public void setArchievedCollection(
			List<ArchievedTransactions> archievedCollection) {
		this.archievedCollection = archievedCollection;
	}

	public List<BuyingHistory> getBuyingHistoryCollection() {
		return buyingHistoryCollection;
	}

	public void setBuyingHistoryCollection(
			List<BuyingHistory> buyingHistoryCollection) {
		this.buyingHistoryCollection = buyingHistoryCollection;
	}

	/* Getters and Setters da tabelas Phones */

	public List<Phones> getPhonesCollection() {
		return phonesCollection;
	}

	public void setPhonesCollection(List<Phones> phonesCollection) {
		this.phonesCollection = phonesCollection;
	}

	public void addPhonesCollection(Phones phone) {
		if (this.getPhonesCollection() == null) {

			this.setPhonesCollection(new ArrayList<Phones>());
		}

		this.getPhonesCollection().add(phone);

	}

	public void removePhonesCollection(Phones phone) {
		if (this.getPhonesCollection() != null) {

			if (this.getPhonesCollection().contains(phone)) {
				this.getPhonesCollection().remove(phone);
			}
		}
	}

	/* Getters and Setters da tabelas Address */

	public List<Address> getAddressCollection() {
		return addressCollection;
	}

	public void setAddressCollection(List<Address> addressCollection) {
		this.addressCollection = addressCollection;
	}

	public void addAddressCollection(Address address) {
		if (this.getAddressCollection() == null) {

			this.setAddressCollection(new ArrayList<Address>());
		}

		this.getAddressCollection().add(address);

	}

	public void removeAddressCollection(Address address) {
		if (this.getAddressCollection() != null) {

			if (this.getAddressCollection().contains(address)) {
				this.getAddressCollection().remove(address);
			}
		}
	}

	/* Getters and Setters da tabela ClientPoints */

	public List<LoyalityCard> getClientpointsCollection() {
		return clientpointsCollection;
	}

	public void setClientpointsCollection(
			List<LoyalityCard> clientpointsCollection) {
		this.clientpointsCollection = clientpointsCollection;
	}

	public void addClientpointsCollection(LoyalityCard clientpoints) {
		if (this.getClientpointsCollection() == null) {

			this.setClientpointsCollection(new ArrayList<LoyalityCard>());
		}

		this.getClientpointsCollection().add(clientpoints);

	}

	public void removeclientpointsCollection(LoyalityCard clientpoints) {
		if (this.getClientpointsCollection() != null) {

			if (this.getClientpointsCollection().contains(clientpoints)) {
				this.getClientpointsCollection().remove(clientpoints);
			}
		}
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

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<HistoryIndication> getHistoryIndicationCollection() {
		return historyIndicationCollection;
	}

	public void setHistoryIndicationCollection(
			List<HistoryIndication> historyIndicationCollection) {
		this.historyIndicationCollection = historyIndicationCollection;
	}

	public List<HistoryIndication> getHistoryIndicatedCollection() {
		return historyIndicatedCollection;
	}

	public void setHistoryIndicatedCollection(
			List<HistoryIndication> historyIndicatedCollection) {
		this.historyIndicatedCollection = historyIndicatedCollection;
	}
	

}