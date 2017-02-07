package com.pluralsight.interview_exercises;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringModifierTest{
	private StringModifier stringModifier;
	
	@Before
	public void init(){
		stringModifier = new StringModifier();
	}
	
	@Test
	public void testReplaceCharShouldReturnNullWhenOriginalStringIsNull(){
		String result = stringModifier.replaceChar(null, 'a', 'b');
		Assert.assertNull(result);
	}
	
	@Test
	public void testReplaceCharShouldReturnEmptyStringWhenOriginalStringIsEmpty(){
		String result = stringModifier.replaceChar("", 'a', 'b');
		Assert.assertEquals("",result);
	} 
	
	@Test
	public void testReplaceCharShouldReturnValidValueWhenOriginalStringNotEmpty(){
		String result = stringModifier.replaceChar("a", 'a', 'a');
		Assert.assertEquals("a",result);
		
		result = stringModifier.replaceChar("a", 'a', 'b');
		Assert.assertEquals("b", result);
		
		result = stringModifier.replaceChar("aa", 'a', 'b');
		Assert.assertEquals("bb", result);
		
		result = stringModifier.replaceChar("aabbbaa", 'b', 'c');
		Assert.assertEquals("aacccaa", result);
	}
	
	@Test
	public void testReverseStringReturnNullWhenParamStringNull(){
		String result = stringModifier.reverseString(null);
		Assert.assertNull(result);
	}
	
	@Test
	public void testReverseStringReturnEmptyStringWhenParamStringEmpty(){
		String result = stringModifier.reverseString("");
		Assert.assertEquals("",result);
	}
	
	@Test
	public void testReverseStringReturnParamStringWhenStringIsOneCharacterLong(){
		String result = stringModifier.reverseString("a");
		Assert.assertEquals("a",result);
	}
	
	@Test 
	public void testReverseStringReturnValidStringWhenParamStringLongerThanOne(){
		String result = stringModifier.reverseString("abcd");
		Assert.assertEquals("dcba",result);
	}
}
