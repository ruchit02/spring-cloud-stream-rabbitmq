package com.topnotch.demo.adapters;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DomainList implements Serializable{

	private List<Domain> domains ;

	public DomainList() {
		
	}
	
	public DomainList(List<Domain> domains) {
		super();
		this.domains = domains;
	}

	public List<Domain> getDomains() {
		return domains;
	}

	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}

	@Override
	public int hashCode() {
		return Objects.hash(domains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DomainList other = (DomainList) obj;
		return Objects.equals(domains, other.domains);
	}
}
