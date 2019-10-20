package com.bada.softleaks;

import java.util.ArrayList;
import java.util.List;

public class VerboseGC {
	/**
	 * Run this program with flag
	 * 
	 * -Xmx1m -verbose:gc
	 * 
	 * @author bada
	 *
	 */
//	public static void main(String[] args) throws InterruptedException {
//		List<Customer> customers = new ArrayList<Customer>();
//		while (true) {
//			Customer c = new Customer("Bapi");
//			customers.add(c);
//			if (customers.size() > 100)
//				for (int i = 0; i < 2; i++)
//					customers.remove(0);
//
////			Thread.sleep(1000);
//		}
//
//	}

	/**
	 * Run this program with flag
	 * 
	 * -Xmx20m // setting the heap size 20mb
	 * -XX:NewRatio=1 // to divide equally young and old gen sizes; by default the size is 2 that means old gen size is twice then young gen
	 * 
	 * @author bada
	 *
	 */
	public static void main(String[] args) throws InterruptedException {
		List<Customer> customers = new ArrayList<Customer>();
		while (true) {
			Customer c = new Customer("Bapi");
			customers.add(c);
			if (customers.size() > 10000)
				for (int i = 0; i < 5000; i++)
					customers.remove(0);

//			Thread.sleep(1000);
		}

	}
}
