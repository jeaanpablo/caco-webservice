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
@Table(name = "permissions")
public class Permissions implements GenericModel{
	
	@Id
	@GeneratedValue
	@Column(name = "id_permission")
	private long idPermission;
	
	@ManyToOne
	@JoinColumn(name = "id_user", referencedColumnName = "id_user")
	private Users users;
	
	@Column(name = "s_name_permission", nullable = false)
	private String nomePermission;
	
	@Column(name = "n_type_permission", nullable = false)
	private long typePermission;
	
	@Column(name = "t_date_permission", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPermissao;

	public long getIdPermission() {
		return idPermission;
	}

	public void setIdPermission(long idPermission) {
		this.idPermission = idPermission;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getNomePermission() {
		return nomePermission;
	}

	public void setNomePermission(String nomePermission) {
		this.nomePermission = nomePermission;
	}

	public long getTypePermission() {
		return typePermission;
	}

	public void setTypePermission(long typePermission) {
		this.typePermission = typePermission;
	}

	public Calendar getDataPermissao() {
		return dataPermissao;
	}

	public void setDataPermissao(Calendar dataPermissao) {
		this.dataPermissao = dataPermissao;
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
