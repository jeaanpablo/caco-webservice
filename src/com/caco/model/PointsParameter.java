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
@Table(name = "points_parameter")
public class PointsParameter implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_points")
	private long idPoints;
	
	@ManyToOne
	@JoinColumn(name = "id_store", referencedColumnName = "id_store")
	private Stores idStore;
	
	@Column(name = "n_qtd_reais", nullable = false)
	private long qtdReais;
	
	@Column(name = "n_qtd_points", nullable = false)
	private long qtdPoints;
	
	@Column(name = "s_comentaries", nullable = false)
	private long Comentaries;

	public long getIdPoints() {
		return idPoints;
	}

	public void setIdPoints(long idPoints) {
		this.idPoints = idPoints;
	}

	public Stores getIdStore() {
		return idStore;
	}

	public void setIdStore(Stores idStore) {
		this.idStore = idStore;
	}

	public long getQtdReais() {
		return qtdReais;
	}

	public void setQtdReais(long qtdReais) {
		this.qtdReais = qtdReais;
	}

	public long getQtdPoints() {
		return qtdPoints;
	}

	public void setQtdPoints(long qtdPoints) {
		this.qtdPoints = qtdPoints;
	}

	public long getComentaries() {
		return Comentaries;
	}

	public void setComentaries(long comentaries) {
		Comentaries = comentaries;
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