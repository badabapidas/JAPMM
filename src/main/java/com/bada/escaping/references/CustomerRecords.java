package com.bada.escaping.references;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
	private Map<String, Customer> records;

	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}

	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}

	public Map<String, Customer> getCustomers() {
		// send ac copy of collection not the original one; this will have a little
		// performance impact though that is not that
//		return new HashMap<>(this.records);

		// this will return a map object of unmodifiable, so any body try to modify
		// anything it will through unsupported exception
		return Collections.unmodifiableMap(records);
	}

	@Override
	public Iterator<Customer> iterator() {
		return this.records.values().iterator();
	}

	// changing the return type to read only interface object we are now able to
	// give compile time error rather then rutnime as before
	public ReadOnlyCustomer find(String name) {
		// this problem with this approach is that any body can change the customer
		// details as this is not escaped;
//		return records.get(name);

		// the solution of the above problem
		return new Customer(records.get(name));
	}
}
