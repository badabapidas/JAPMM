package com.bada.misc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		StringExplorationExample();
		getStringPoolTableStatistics();

	}

	private static void StringExplorationExample() {
		String one = "hello";
		String two = "hello";

		System.out.println(one.equals(two));
		System.out.println(one == two);

		Integer i = 76;
		String three = i.toString().intern();
		String four = "76";

		System.out.println(three.equals(four));
		System.out.println(three == four);
	}

	/**
	 * Run with this vm argument
	 * 
	 *  -XX:+PrintStringTableStatistics //the size and density of the string pool
	 *  -XX:StringTableSize=120121 // Tuning the size of the String Pool (this is the next prime number after the default one which is 60013)
	 *  -XX:MaxHeapSize=600m // to set the size of heap memory
	 *  -XX:InitialHeapSize=1g // to set the size of initial heap size
	 *  
	 *  So in this program if we reduce the size of heap we will get outOfMemory Exception as the string pool size needs more heap (800mb) then we have (600mb);Try this out
	 */
	private static void getStringPoolTableStatistics() {
		Date start = new Date();
		List<String> strings = new ArrayList<String>();
		for (Integer i = 1; i < 100000; i++) {
			String s = i.toString().intern();
			strings.add(s);
		}

		Date end = new Date();
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");
	}

}
