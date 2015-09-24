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
@Table(name = "contacts")
public class Contact implements GenericModel{
	
	@Id
	@GeneratedValue
	@Column(name = "id_contact")
	private long idContact;
	
		
	@Column(name = "s_name_contact", nullable = false)
	private String nomeContact;
	
	@Column(name = "s_email", nullable = false)
	private String email;
	
	@Column(name = "t_date_contact", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataContact;

	@Column(name = "s_subject", nullable = false)
	private String subject;
	
	@Column(name = "s_message", nullable = false)
	private String message;

	public long getIdContact() {
		return idContact;
	}

	public void setIdContact(long idContact) {
		this.idContact = idContact;
	}

	public String getNomeContact() {
		return nomeContact;
	}

	public void setNomeContact(String nomeContact) {
		this.nomeContact = nomeContact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataContact() {
		return dataContact;
	}

	public void setDataContact(Calendar dataContact) {
		this.dataContact = dataContact;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
