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
@Table(name = "sales_parameter")
public class SalesParameter implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_parameter")
	private long idParameter;

	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores idStore;

	@Column(name = "n_pontuation", nullable = false)
	private long pontuation;

	@Column(name = "n_discount", nullable = true)
	private long discount;

	@Column(name = "s_type_pontuation", nullable = false)
	private String typePontuation;

	public long getIdParameter() {
		return idParameter;
	}

	public void setIdParameter(long idParameter) {
		this.idParameter = idParameter;
	}

	public Stores getIdStore() {
		return idStore;
	}

	public void setIdStore(Stores idStore) {
		this.idStore = idStore;
	}

	public long getPontuation() {
		return pontuation;
	}

	public void setPontuation(long pontuation) {
		this.pontuation = pontuation;
	}

	public long getDiscount() {
		return discount;
	}

	public void setDiscount(long discount) {
		this.discount = discount;
	}

	public String getTypePontuation() {
		return typePontuation;
	}

	public void setTypePontuation(String typePontuation) {
		this.typePontuation = typePontuation;
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