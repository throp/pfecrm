/**
 * Copyright - Property of PFE Corportation
 */
package com.pfecorp.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ben Northrop
 */
@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column(name = "first_name")
	public String firstName;

	@Column(name = "last_name")
	public String lastName;

	@Column(name = "email_address", nullable = true)
	public String emailAddress;

	@Column(name = "phone_number")
	public String phoneNumber;

	@Column(name = "phone_ext")
	public String phoneExt;

	@Column(name = "title")
	public String title;
}
