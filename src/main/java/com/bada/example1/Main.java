package com.bada.example1;

import java.util.Date;

/**
 * To run this program pass program arg as any number say 10 and vm args aas
 * given below one by one
 * 
 * -XX:+PrintCompilation // to find out what kind of compilation is happening
 * when the JVM is running our code
 * 
 * -XX:+UnlockDiagnosticVMOptions -XX:+LogCompilation: to store the output in a
 * log
 * 
 * -XX:+PrintCodeCache //to get the default size of the cache code
 * 
 * -XX:ReservedCodeCacheSize=28m // to set a new cache size
 * 
 * -XX:-TieredCompilation // allowed to you to turned off tiered compilation
 * 
 * 
 * @author bada
 *
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(120000);
		Date start = new Date();
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
		Date end = new Date();
		System.out.println("Total time taken: " + (end.getTime() - start.getTime()) + "ms.");
	}

}
