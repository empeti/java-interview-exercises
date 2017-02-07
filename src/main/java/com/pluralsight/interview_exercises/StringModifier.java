package com.pluralsight.interview_exercises;

public class StringModifier {
	public String replaceChar(String originalText, char charToFind, char charToReplace){
		if (originalText == null){
			return null;
		}
		if (originalText.length() == 0){
			return originalText;
		}
		String result = getReplacedText(originalText, charToFind, charToReplace);
		return result;
	}

	private String getReplacedText(String originalText, char charToFind, char charToReplace) {
		StringBuilder resultText = new StringBuilder("");
		char[] textArray = originalText.toCharArray();
		for (char currentChar : textArray){
			resultText.append(getReplacedChar(currentChar, charToFind, charToReplace));
		}
		return resultText.toString();
	}
	
	private char getReplacedChar(char currentChar, char charToFind, char charToReplace){
		return currentChar == charToFind ? charToReplace : currentChar;
	}
	
	public String reverseString(String stringToReverse){
		if (stringToReverse == null){
			return null;
		}
		if (stringToReverse.equals("")){
			return stringToReverse;
		}
		if (stringToReverse.length() == 1){
			return stringToReverse;
		}
		return getReverseString(stringToReverse);
	}
	
	private String getReverseString(String stringToReverse){
		StringBuilder reversedString = new StringBuilder();
		char[] originalStringArray = stringToReverse.toCharArray();
		for (int i=originalStringArray.length-1; i>=0; i--){
			reversedString.append(originalStringArray[i]);
		}
		return reversedString.toString();
	}
}
