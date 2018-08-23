package com.soccerpiece.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iduser;

	private String username;
	private String password;
	private String email;
	private String name;
	private String surname;
	private String lastname;
	private String typeuser;
	private String condition;
	private String activate;
	private String dateregister;

	/**
	 * @return the iduser
	 */
	public Long getIduser() {
		return iduser;
	}

	/**
	 * @param iduser
	 *            the iduser to set
	 */
	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the typeuser
	 */
	public String getTypeuser() {
		return typeuser;
	}

	/**
	 * @param typeuser
	 *            the typeuser to set
	 */
	public void setTypeuser(String typeuser) {
		this.typeuser = typeuser;
	}

	/**
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition
	 *            the condition to set
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * @return the activate
	 */
	public String getActivate() {
		return activate;
	}

	/**
	 * @param activate
	 *            the activate to set
	 */
	public void setActivate(String activate) {
		this.activate = activate;
	}

	/**
	 * @return the dateregister
	 */
	public String getDateregister() {
		return dateregister;
	}

	/**
	 * @param dateregister
	 *            the dateregister to set
	 */
	public void setDateregister(String dateregister) {
		this.dateregister = dateregister;
	}

}
