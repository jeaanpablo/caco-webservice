package com.caco.model;

import java.io.Serializable;
import java.sql.Timestamp;
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

import com.caco.generic.model.GenericModel;

@Entity
@Table(name = "employees")
public class Employees implements GenericModel {

	@Id
	@GeneratedValue
	@Column(name = "id_employee")
	private long IdEmployee;

	@ManyToOne
	@JoinColumn(name = "id_client", referencedColumnName = "id_client")
	private Clients client;

	@Column(name = "n_salary", nullable = false)
	private String Salary;

	@Column(name = "t_hire_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar HireDate;

	@Column(name = "n_doc", nullable = false)
	private long Doc;

	public long getIdEmployee() {
		return IdEmployee;
	}

	public void setIdEmployee(long idEmployee) {
		IdEmployee = idEmployee;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public long getDoc() {
		return Doc;
	}

	public void setDoc(long doc) {
		Doc = doc;
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

	public Calendar getHireDate() {
		return HireDate;
	}

	public void setHireDate(Calendar hireDate) {
		HireDate = hireDate;
	}
	
	

}