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
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column(name = "address_1")
	public String address1;

	@Column(name = "address_2")
	public String address2;

	@Column(name = "address_3")
	public String address3;

	@Column(name = "city")
	public String city;

	@Column(name = "state")
	public String state;

	@Column(name = "zip")
	public String zip;

}
