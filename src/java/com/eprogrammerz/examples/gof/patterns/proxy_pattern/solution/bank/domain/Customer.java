package com.eprogrammerz.examples.gof.patterns.proxy_pattern.solution.bank.domain;

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
