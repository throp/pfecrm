/**
 * Copyright - Property of PFE Corporation
 */
package com.pfecorp.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Ben Northrop
 */
@Entity
@Table(name = "CUSTOMER", uniqueConstraints = { @UniqueConstraint(columnNames = "NAME") })
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column(name = "name")
	public String name;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_id", nullable = true)
	public Address address;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "primary_contact_id", nullable = true)
	public Contact primaryContact;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "secondary_contact_id", nullable = true)
	public Contact secondaryContact;
}
