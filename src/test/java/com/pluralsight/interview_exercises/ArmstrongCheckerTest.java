package com.pluralsight.interview_exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArmstrongCheckerTest {
	private ArmstrongChecker armstrongChecker;

	@Before
	public void init(){
		armstrongChecker = new ArmstrongChecker();
	}
	
	@Test
	public void testGetIsArmstrongNumberShouldReturnNullWhenParamNull(){
		Map<Integer, Boolean> result = armstrongChecker.getIsArmstrongNumbersTo(null);
		Assert.assertNull(result);
	}
	
	@Test
	public void testGetIsArmstrongNumberShouldReturnEmptyMapWhenParamZero(){
		Map<Integer, Boolean> result = armstrongChecker.getIsArmstrongNumbersTo(0);
		Assert.assertEquals(new HashMap<Integer, Boolean>(), result);
	}
	
	@Test
	public void testGetIsArmstrongNumbersReturnTrueForAllElemWhenParamLowerThanTen(){
		Map<Integer, Boolean> expected = new HashMap<>();
		for (int i=1; i<10; i++){
			expected.put(i,true);
		}
		Map<Integer, Boolean> result = armstrongChecker.getIsArmstrongNumbersTo(9);
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void testGetIsArmstrongNumbersReturnValidResultWhenParamGreaterThanTen(){
		List<Integer> armstrongNumbers = new ArrayList<>();
		armstrongNumbers.add(1);
		armstrongNumbers.add(2);
		armstrongNumbers.add(3);
		armstrongNumbers.add(4);
		armstrongNumbers.add(5);
		armstrongNumbers.add(6);
		armstrongNumbers.add(7);
		armstrongNumbers.add(8);
		armstrongNumbers.add(9);
		armstrongNumbers.add(153);
		armstrongNumbers.add(370);
		armstrongNumbers.add(371);
		armstrongNumbers.add(407);
		
		Map<Integer, Boolean> expected = new HashMap<>();
		for (Integer i=1; i<=1000; i++){
			Boolean isArmstrong = false;
			if (armstrongNumbers.contains(i)){
				isArmstrong = true;
			}
			expected.put(i, isArmstrong);
		}
		
		Map<Integer, Boolean> result = armstrongChecker.getIsArmstrongNumbersTo(1000);
		Assert.assertEquals(expected, result);
	}
}
