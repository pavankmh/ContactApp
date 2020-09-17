package com.contact.persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="CONTACT_DETAILS")
public  class ContactDetailsEntity {


	@Id
	@Column(name="CONTACT_ID")
	@GeneratedValue
	private Integer cid;
	@Column(name="CONTACT_NAME")
	private String cname;
	@Column(name="CONTACT_PHONENUMBER")
	private String cphoneNo;
	@Column(name="CONATCT_EMAIL")
	private String email;

}
