package com.caco.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.caco.facade.AddressFacade;
import com.caco.facade.ClientFacade;
import com.caco.facade.EmployeeFacade;
import com.caco.facade.UserFacade;
import com.caco.model.Address;
import com.caco.model.Clients;
import com.caco.model.Contact;
import com.caco.model.Employees;
import com.caco.model.Users;

@RestController
public class RegisterController {
	
	
	@Autowired
	ClientFacade clientFacade;
	
	@Autowired
	UserFacade userFacade;
	
	@Autowired
	AddressFacade addressFacade;
	
	@Autowired
	EmployeeFacade empFacade;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/registerEmployee")
	public @ResponseBody Boolean sendMessage(
			@RequestParam(value = "name") String name,
			@RequestParam(value = "last_name") String last_name,
			@RequestParam(value = "cpf") long cpf,
			@RequestParam(value = "b_data") Calendar b_data,
			@RequestParam(value = "gender") String gender,
			@RequestParam(value = "rg") String rg,
			@RequestParam(value = "salary") String salary,
			@RequestParam(value = "hire_date") Calendar hire_date,
			@RequestParam(value = "doc") long doc,
			@RequestParam(value = "street") String street,
			@RequestParam(value = "number") long number,
			@RequestParam(value = "district") String district,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "state") String state,
			@RequestParam(value = "zip_code") long zip_code,
			@RequestParam(value = "country") String country,
			@RequestParam(value = "login") String login,
			@RequestParam(value = "password") String password,
			@RequestParam(value = "email") String email)
			

	{		
		
		Clients register = new Clients();		
		
		register.setName(name);	
		register.setLastName(last_name);
		register.setCpf(cpf);
		register.setbDate(b_data);
		register.setGender(gender);
		register.setRg(rg);		
		
		Clients clientInserted = clientFacade.insert(register);
		
		Employees emp = new Employees();
		
		emp.setSalary(salary);
		emp.setHireDate(hire_date);
		emp.setDoc(doc);
		
		Employees empInserted = empFacade.insert(emp);
		
		Address address = new Address();
		
		address.setStreet(street);
		address.setNumber(number);
		address.setDistrict(district);
		address.setCity(city);
		address.setState(state);
		address.setZipCode(zip_code);
		address.setCountry(country);
		
		Address addressInserted = addressFacade.insert(address);
		
		Users user = new Users();
		
		user.setLogin(login);
		user.setEmail(email);
		user.setPassword(password);	
		
		Users userInserted = userFacade.insert(user);
	
		
		
		return false;

	}

}
