package com.caco.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "tokens")
public class Token implements GenericModel{
	
	@Id
	@GeneratedValue
	@Column(name = "id_token")
	private long idToken;
	
	@Column(name = "s_token", nullable = false)
	private String token;
	
	@Column(name = "generate_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar generateDate;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_user", referencedColumnName = "id_user")
	private Users user;

	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	public long getIdToken() {
		return idToken;
	}

	public void setIdToken(long idToken) {
		this.idToken = idToken;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Calendar getGenerateDate() {
		return generateDate;
	}

	public void setGenerateDate(Calendar generateDate) {
		this.generateDate = generateDate;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
	

}
