package com.topnotch.demo.adapters;

import java.io.Serializable;
import java.util.Objects;

public class Domain implements Serializable {

	private String domain;

	private String create_date;

	private String update_date;

	private String country;

	private boolean isDead;

	private String A;

	private String NS;

	private String CNAME;

	private String MX;

	private String TXT;

	public Domain() {
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

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
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

	@Override
	public int hashCode() {
		return Objects.hash(A, CNAME, MX, NS, TXT, country, create_date, domain, isDead, update_date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domain other = (Domain) obj;
		return Objects.equals(A, other.A) && Objects.equals(CNAME, other.CNAME) && Objects.equals(MX, other.MX)
				&& Objects.equals(NS, other.NS) && Objects.equals(TXT, other.TXT)
				&& Objects.equals(country, other.country) && Objects.equals(create_date, other.create_date)
				&& Objects.equals(domain, other.domain) && isDead == other.isDead
				&& Objects.equals(update_date, other.update_date);
	}

}
