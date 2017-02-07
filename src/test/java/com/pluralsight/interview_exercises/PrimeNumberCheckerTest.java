package com.pluralsight.interview_exercises;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberCheckerTest {
	private PrimeNumberChecker primeNumberChecker;
	
	@Before
	public void init(){
		primeNumberChecker = new PrimeNumberChecker();
	}
	
	@Test
	public void testIsPrimeReturnFalseWhenNumberNull(){
		boolean result = primeNumberChecker.isPrime(null);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testIsPrimeReturnFalseWhenNumberZero(){
		boolean result = primeNumberChecker.isPrime(null);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testIsPrimeReturnTrueWhenNumberIsOne(){
		boolean result = primeNumberChecker.isPrime(1);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testIsPrimeReturnTrueWhenNumberIsTwo(){
		boolean result = primeNumberChecker.isPrime(2);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testIsPrimeReturnTrueWhenNumberIsPrim(){
		boolean result = primeNumberChecker.isPrime(17);
		Assert.assertTrue(result);
		
		result = primeNumberChecker.isPrime(19);
		Assert.assertTrue(result);
		
		result = primeNumberChecker.isPrime(31);
		Assert.assertTrue(result);
	}
	
	public void testIsPrimeReturnFalseWhenNumberIsNotPrim(){
		boolean result = primeNumberChecker.isPrime(6);
		Assert.assertFalse(result);
		
		result = primeNumberChecker.isPrime(9);
		Assert.assertFalse(result);
		
		result = primeNumberChecker.isPrime(21);
		Assert.assertFalse(result);
	}
}
