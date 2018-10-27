package com.eprogrammerz.examples.gof.patterns.dependency_injection.BankProject.domain;

public class Customer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
