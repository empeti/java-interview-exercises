package com.pluralsight.interview_exercises;

import java.util.HashMap;
import java.util.Map;

public class ArmstrongChecker {
	public Map<Integer, Boolean> getIsArmstrongNumbersTo(Integer nr){
		Map<Integer, Boolean> result = new HashMap<Integer, Boolean>();
		if (nr == null){
			return null;
		}
		if (nr == 0){
			return result;
		}
		return generateIsArmstrongNumbers(nr);
	}

	private Map<Integer, Boolean> generateIsArmstrongNumbers(Integer nr) {
		Map<Integer, Boolean> armstrongMap = new HashMap<>();
		for (Integer i = 1; i <= nr; i++){
			armstrongMap.put(i, isArmstrongNumber(i));
		}
		
		return armstrongMap;
	}

	private Boolean isArmstrongNumber(Integer i) {
		if (i < 10){
			return true;
		}
		if (i == getArmstrongValue(i)){
			return true;
		}
		return false;
	}

	private Integer getArmstrongValue(Integer nr) {
		Double result = 0.0;
		char[] nrChars = nr.toString().toCharArray();
		Integer powNr = nrChars.length;
		for (int i=1; i<nrChars.length; i++){
			System.out.println(nrChars);
			String charStringValue = String.valueOf(nrChars[i]);
			Integer charValue = Integer.getInteger(charStringValue);
			System.out.println(charValue);
			if (charValue > 0){
				result += Math.pow(charValue.doubleValue(), powNr.doubleValue());
			}
		}
		System.out.println(nr + " : " + result);
		return result.intValue();
	}
	
	
	
}
