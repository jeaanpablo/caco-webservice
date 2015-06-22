package com.caco.controller;

import java.io.Serializable;
import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.caco.dao.PermissionsDAO;
import com.caco.facade.ClientFacade;
import com.caco.facade.PhoneFacade;
import com.caco.facade.TokenFacade;
import com.caco.facade.UserFacade;
import com.caco.model.Clients;
import com.caco.model.Permissions;
import com.caco.model.Phones;
import com.caco.model.Token;
import com.caco.model.Users;
import com.caco.model.json.LoginVerified;
import com.caco.model.json.UserAppInserted;

@RestController
public class AccessControlController {

	@Autowired
	UserFacade userFacade;

	@Autowired
	ClientFacade clientFacade;
	
	@Autowired
	PhoneFacade phoneFacade;

	@Autowired
	TokenFacade tokenFacade;

	@Autowired
	PermissionsDAO permissionsFacade;

	// This method receive user data and add in the database
	@RequestMapping(method = RequestMethod.POST, value = "/addUser")
	public @ResponseBody UserAppInserted addUser(
			@RequestParam(value = "first_name") String firstName,
			@RequestParam(value = "last_name") String lastName,
			@RequestParam(value = "cpf") long cpf,
			@RequestParam(value = "birth_date") String birthDate,
			@RequestParam(value = "gender") String gender,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "login") String login,
			@RequestParam(value = "password") String password,
			@RequestParam(value="cellphone") long cellphone) {

		Users userVerifyEmail = userFacade.findByEmail(email);
		Users userVerifyLogin = userFacade.findByLogin(login);

		if ((userVerifyEmail == null) && (userVerifyLogin == null)) {

			Users user = new Users();
			user.setEmail(email);
			user.setLogin(login);
			user.setPassword(password);

			Users userInserted = userFacade.insert(user);

			Clients client = new Clients();

			client.setName(firstName);
			client.setLastName(lastName);
			client.setCpf(cpf);

			Calendar birthDateCal = Calendar.getInstance();
			birthDateCal.setTimeInMillis(Long.parseLong(birthDate));
			client.setbDate(birthDateCal);
			client.setGender(gender);
			client.setIdUser(userInserted);

			Clients clientInserted = clientFacade.insert(client);
			
			Phones phone = new Phones();
			
			phone.setPhone(cellphone);
			phone.setClient(clientInserted);
			phone.setPhoneType("Cellphone");
			
			phoneFacade.insert(phone);

			Token token = new Token();

			Calendar tokenGenerate = Calendar.getInstance();
			token.setToken(tokenFacade.generateToken(userInserted.getIdUser()));
			token.setGenerateDate(tokenGenerate);
			token.setUser(userInserted);

			Token tokenInserted = tokenFacade.insert(token);

			UserAppInserted userAppInserted = new UserAppInserted();

			Permissions permission = new Permissions();
			permission.setUsers(userInserted);
			permission.setNomePermission("USER_APP");
			permission.setDataPermissao(tokenGenerate);

			permissionsFacade.saveOrUpdate(permission);

			userAppInserted.setIdUser(userInserted.getIdUser());
			userAppInserted.setToken(tokenInserted.getToken());
			userAppInserted.setPermission(permission.getNomePermission());

			return userAppInserted;
		}
		
		return null;
	}

	// This method receive user data and add in the database
	@RequestMapping(method = RequestMethod.POST, value = "/userLogin")
	public @ResponseBody LoginVerified userAppAuthentication(
			@RequestParam(value = "email") String email,
			@RequestParam(value = "login") String login,
			@RequestParam(value = "password") String password) {

		if ((!email.isEmpty()) && (login.isEmpty())) {
			Users user = userFacade.findByEmail(email); // find user

			if ((password != null) && (user != null)) {

				if (userFacade.validatePassword(password, user)) {
					Token token = tokenFacade.findByUserId(user.getIdUser());
					Calendar cal = Calendar.getInstance();
					LoginVerified loginVerified = new LoginVerified();
					if (token != null) {
						DateTime lastGenDate = new DateTime(token
								.getGenerateDate().get(Calendar.YEAR), (token
								.getGenerateDate().get(Calendar.MONTH) + 1),
								token.getGenerateDate().get(
										Calendar.DAY_OF_MONTH), token
										.getGenerateDate().get(
												Calendar.HOUR_OF_DAY),
								token.getGenerateDate().get(Calendar.MINUTE),
								token.getGenerateDate().get(Calendar.SECOND));
						DateTime now = new DateTime(cal.get(Calendar.YEAR),
								(cal.get(Calendar.MONTH) + 1),
								cal.get(Calendar.DAY_OF_MONTH),
								cal.get(Calendar.HOUR_OF_DAY),
								cal.get(Calendar.MINUTE),
								cal.get(Calendar.SECOND));

						int intervalHours = Hours
								.hoursBetween(lastGenDate, now).getHours();

						if (intervalHours > 24) {
							token.setToken(tokenFacade.generateToken(user
									.getIdUser()));
							token.setGenerateDate(cal);

							tokenFacade.update(token);
						}
						loginVerified.setToken(token.getToken());

						return loginVerified;

					} else {
						token = new Token();

						token.setGenerateDate(cal);
						token.setToken(tokenFacade.generateToken(user
								.getIdUser()));
						token.setUser(user);

						loginVerified.setToken(token.getToken());

						return loginVerified;
					}

				}
			}
		}

		if ((email.isEmpty()) && (!login.isEmpty())) {
			Users user = userFacade.findByLogin(login);

			if ((password != null) && (user != null)) {

				if (userFacade.validatePassword(password, user)) {
					Token token = tokenFacade.findByUserId(user.getIdUser());
					Calendar cal = Calendar.getInstance();
					LoginVerified loginVerified = new LoginVerified();

					if (token != null) {
						DateTime lastGenDate = new DateTime(token
								.getGenerateDate().get(Calendar.YEAR), (token
								.getGenerateDate().get(Calendar.MONTH) + 1),
								token.getGenerateDate().get(
										Calendar.DAY_OF_MONTH), token
										.getGenerateDate().get(
												Calendar.HOUR_OF_DAY),
								token.getGenerateDate().get(Calendar.MINUTE),
								token.getGenerateDate().get(Calendar.SECOND));
						DateTime now = new DateTime(cal.get(Calendar.YEAR),
								(cal.get(Calendar.MONTH) + 1),
								cal.get(Calendar.DAY_OF_MONTH),
								cal.get(Calendar.HOUR_OF_DAY),
								cal.get(Calendar.MINUTE),
								cal.get(Calendar.SECOND));

						int intervalHours = Hours
								.hoursBetween(lastGenDate, now).getHours();

						if (intervalHours > 24) {
							token.setToken(tokenFacade.generateToken(user
									.getIdUser()));
							token.setGenerateDate(cal);

							tokenFacade.update(token);
						}

						loginVerified.setToken(token.getToken());

						return loginVerified;

					} else {
						token = new Token();

						token.setGenerateDate(cal);
						token.setToken(tokenFacade.generateToken(user
								.getIdUser()));
						token.setUser(user);

						tokenFacade.insert(token);

						loginVerified.setToken(token.getToken());
						//loginVerified.setPermission(permission);

						return loginVerified;
					}

				}
			}
		}

		return null;

	}

}
