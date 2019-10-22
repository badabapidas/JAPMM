package com.bada.benchmarking.fibbonacci;

public class NumberChecker {

	public Boolean isPrime(int testNumber) {
		for (Integer i = 2; i < testNumber; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}
	
	
}
