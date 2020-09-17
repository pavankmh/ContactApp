package com.contact.dto;

import org.springframework.stereotype.Component;

@Component
public class ContactDTO {

	private Integer cid;
	private String cname;
	private String cphoneNo;
	private String email;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphoneNo() {
		return cphoneNo;
	}

	public void setCphoneNo(String cphoneNo) {
		this.cphoneNo = cphoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
