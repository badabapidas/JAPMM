package com.bada.benchmarking;

/**
 * 
 * This program is to check the micro benchmarking for a method is prime. There
 * are 2 versions of this method isPrime1 and isPrime2.
 * 
 * isPrime2 is the improved version where type of the number changed from
 * Integer to int and the logic of prime no check is changed
 * 
 * Run with -XX:+PrintCompilation // use this flag to see if the warm up code
 * put already the isPrime method in a native compilation
 * 
 * Change method isPrime1 <-> isPrime2 to verify the performance
 * 
 * @author bada
 *
 */

public class Main {

	public static void main(String[] args) throws InterruptedException {
		NumberChecker nc = new NumberChecker();

		// warm up period
		for (int i = 1; i < 10000; i++)
			nc.isPrime2(i);

		Thread.sleep(2000);

		System.out.println("warmup finished, now measuring");

		long start = System.currentTimeMillis();

		for (int i = 1; i < 50000; i++)
			nc.isPrime2(i);

		long end = System.currentTimeMillis();
		System.out.println("Time taken " + (end - start) + " ms");

	}

}
