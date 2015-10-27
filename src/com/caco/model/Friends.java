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
@Table(name = "friends")
public class Friends implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_friend")
	private long idFriend;
	
	@Column(name = "id_client", nullable = false)
	private long idClient;

	@Column(name = "id_client_friend", nullable = false)
	private long idClientFriend;

	public long getIdFriend() {
		return idFriend;
	}

	public void setIdFriend(long idFriend) {
		this.idFriend = idFriend;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public long getIdClientFriend() {
		return idClientFriend;
	}

	public void setIdClientFriend(long idClientFriend) {
		this.idClientFriend = idClientFriend;
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