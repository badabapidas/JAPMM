package com.bada.escaping.references;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));

		// problem is user can clear the whole records by doing the below line
//		records.getCustomers().clear();

		// issue with the find method is that anybody can change the detail like below
//		records.find("John").setName("Jane");

		// we can stil cast and do some naughty stuf like below

		for (ReadOnlyCustomer next : records.getCustomers().values()) {
			System.out.println(next);
		}
		System.out.println(records.find("John"));

		// this is one solution; in performance this is exactly same as before; but here
		// also the records can be change though in a harder way compare to the earlier
		// approach as given below
//		for (Customer cust : records) {
//			System.out.println(cust.getName());
//		}
//
//		Iterator<Customer> it = records.iterator();
//		it.next();
//		it.remove();
//
//		for (Customer cust : records) {
//			System.out.println(cust.getName());
//		}

	}

}
