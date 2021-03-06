package com.caco.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.caco.facade.AddressFacade;
import com.caco.facade.ClientFacade;
import com.caco.facade.EmployeeFacade;
import com.caco.facade.PhoneFacade;
import com.caco.facade.SalesFacade;
import com.caco.facade.SalesParameterFacade;
import com.caco.facade.StoresFacade;
import com.caco.facade.UserFacade;
import com.caco.model.Address;
import com.caco.model.Clients;
import com.caco.model.Contact;
import com.caco.model.Employees;
import com.caco.model.Sales;
import com.caco.model.SalesParameter;
import com.caco.model.Stores;
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
	
	@Autowired 
	StoresFacade storeFacade;
	
	@Autowired
	SalesParameterFacade salesFacade;
	
	@Autowired
	PhoneFacade phoneFacade;
	
	@Autowired 
	SalesFacade saleFacade;
	
	@RequestMapping(method = RequestMethod.POST, value = "/registerStore")
	public @ResponseBody Boolean registerStore(
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
			@RequestParam(value = "email") String email,
			@RequestParam(value = "cnpj") long cnpj,
			@RequestParam(value = "description") String description,
			@RequestParam(value = "fantasyname") String fantasy)
			

	{		
		
		Users userVerifyEmail = userFacade.findByEmail(email);
		
		if (userVerifyEmail != null) {
			
			
            Stores store = new Stores();            
            Users user = userFacade.findByLogin(login);

    		Clients client = new Clients();
    		client.setIdUser(user);
            
    		
    		
            store.setClient(client);
			store.setCnpj(cnpj);
			store.setDescription(description);
			store.setFantasyName(fantasy);	
			
			storeFacade.insert(store);
			
			Address address = new Address();
			
			client.setAddress(address);
			address.setStreet(street);
			address.setNumber(number);
			address.setDistrict(district);
			address.setCity(city);
			address.setState(state);
			address.setZipCode(zip_code);
			address.setCountry(country);
			
			addressFacade.insert(address);
			
			
		
		}
			
		else {	
			
			
		Users user = new Users();
			
		user.setLogin(login);
		user.setEmail(email);
		user.setPassword(password);	
			
		Users userInserted = userFacade.insert(user);	
		
		Clients register = new Clients();		
		
		register.setName(name);	
		register.setLastName(last_name);
		register.setCpf(cpf);
		register.setbDate(b_data);
		register.setGender(gender);
		register.setRg(rg);		
		
		Clients clientInserted = clientFacade.insert(register);
		
		
		
		Address address = new Address();
		
		address.setStreet(street);
		address.setNumber(number);
		address.setDistrict(district);
		address.setCity(city);
		address.setState(state);
		address.setZipCode(zip_code);
		address.setCountry(country);
		
		addressFacade.insert(address);
	
		}
		
		return null;

	}
	
	
	
	//Cadastra os funcionários relacionados a cada loja
	
	@RequestMapping(method = RequestMethod.POST, value = "/registerEmployee")
	public @ResponseBody Boolean registerEmployee(
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
			@RequestParam(value = "email") String email,
			@RequestParam(value = "cnpj") long cnpj,
			@RequestParam(value = "description") String description,
			@RequestParam(value = "fantasyname") String fantasy)
			

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
		
		empFacade.insert(emp);
		
		Address address = new Address();
		
		address.setStreet(street);
		address.setNumber(number);
		address.setDistrict(district);
		address.setCity(city);
		address.setState(state);
		address.setZipCode(zip_code);
		address.setCountry(country);
		
		addressFacade.insert(address);
		
		Users user = new Users();
		
		user.setLogin(login);
		user.setEmail(email);
		user.setPassword(password);	
		
		Users userInserted = userFacade.insert(user);
	
		
		
		return null;

	}
	
	//Cadastra os parametros de pontuação de cada loja
	@RequestMapping(method = RequestMethod.POST, value = "/registerSalesParameter")
	public @ResponseBody Boolean salesParameter(
			@RequestParam(value = "id_store") long idStore,
			@RequestParam(value = "pontuation") long pontuation,
			@RequestParam(value = "discount") long discount,
			@RequestParam(value = "type_pontuation") String typePontuation)
			

	{		
		
		SalesParameter sale = new SalesParameter();
		
		Stores store = new Stores();
		store.setId(idStore);
		
		sale.setIdStore(store);
		sale.setPontuation(pontuation);
		sale.setDiscount(discount);
		sale.setTypePontuation(typePontuation);
		
		salesFacade.insert(sale);
		
		
		return null;
		
	}

	
	//Cadastra as promocoes relacionadas a cada loja
		@RequestMapping(method = RequestMethod.POST, value = "/registerSales")
		public @ResponseBody Boolean registerSales(
				@RequestParam(value = "id_store") long idStore,
				@RequestParam(value = "id_client") long idClient,
				@RequestParam(value = "description") String description,
				@RequestParam(value = "trade_points") long tradePoints,
				@RequestParam(value = "expiration_date") Calendar expirationDate)
				

		{		
			
			Stores store = new Stores();
			store.setId(idStore);
			
			Clients clients = new Clients();
			clients.setIdClient(idClient);
			
			Sales sales = new Sales();
			
			sales.setIdStore(store);
			sales.setClient(clients);
			sales.setDescription(description);
			sales.setTradePoints(tradePoints);
			sales.setExpirationDate(expirationDate);
			
			saleFacade.insert(sales);
			
			
			return null;
			
		}

	
	
}
