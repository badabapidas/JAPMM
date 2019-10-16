package com.bada.escaping.references;

public class Customer implements ReadOnlyCustomer {
	private String name;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name) {
		this.name = name;
	}

	public Customer(ReadOnlyCustomer c) {
		this.name = c.getName();
	}

	@Override
	public String toString() {
		return name;
	}

}
