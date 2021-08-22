package com.topnotch.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domain")
public class DBDomain {

	@Id
	@Column(name="domain")
	private String domain;

	@Column(name="create_date")
	private String create_date;

	@Column(name="update_date")
	private String update_date;

	@Column(name="country")
	private String country;

	@Column(name="is_dead")
	private boolean is_dead;

	@Column(name="A")
	private String A;

	@Column(name="NS")
	private String NS;

	@Column(name="CNAME")
	private String CNAME;

	@Column(name="MX")
	private String MX;

	@Column(name="TXT")
	private String TXT;
	
	
	public DBDomain() {
		super();
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isIs_dead() {
		return is_dead;
	}

	public void setIs_dead(boolean is_dead) {
		this.is_dead = is_dead;
	}

	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getNS() {
		return NS;
	}

	public void setNS(String nS) {
		NS = nS;
	}

	public String getCNAME() {
		return CNAME;
	}

	public void setCNAME(String cNAME) {
		CNAME = cNAME;
	}

	public String getMX() {
		return MX;
	}

	public void setMX(String mX) {
		MX = mX;
	}

	public String getTXT() {
		return TXT;
	}

	public void setTXT(String tXT) {
		TXT = tXT;
	}
}
