package com.caco.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "users")
public class Users implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_user")
	private Integer idUser;

	@Column(name = "s_email", nullable = false)
	private String email;

	@Column(name = "s_login", nullable = false)
	private String login;

	@Column(name = "s_password", nullable = false)
	private String password;

	@Column(name = "n_access_try", nullable = true)
	private long nAccessTry;

	@OneToMany(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Clients> clientsCollection;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Token> tokenCollection;
	
	@OneToMany(mappedBy = "users", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Permissions> permissionsCollection;

	public List<Token> getTokenCollection() {
		return tokenCollection;
	}

	public void setTokenCollection(List<Token> tokenCollection) {
		this.tokenCollection = tokenCollection;
	}

	public List<Permissions> getPermissionsCollection() {
		return permissionsCollection;
	}

	public void setPermissionsCollection(List<Permissions> permissionsCollection) {
		this.permissionsCollection = permissionsCollection;
	}

	public List<Clients> getClientsCollection() {
		return clientsCollection;
	}

	public void setClientsCollection(List<Clients> clientsCollection) {
		this.clientsCollection = clientsCollection;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getnAccessTry() {
		return nAccessTry;
	}

	public void setnAccessTry(long nAccessTry) {
		this.nAccessTry = nAccessTry;
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