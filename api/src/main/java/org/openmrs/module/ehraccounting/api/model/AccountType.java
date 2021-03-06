package org.openmrs.module.ehraccounting.api.model;

public enum AccountType {
	INCOME("INCOME"),EXPENSE("EXPENSE");
	
	private String name;
	
	AccountType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
