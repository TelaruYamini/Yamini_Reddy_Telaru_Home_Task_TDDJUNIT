package com.epam.Tdd_Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveCharA {
/* TODO list for my feature
 * 1. 4 chars with A in first character : "ABCD" => "BCD"
 * 2. 4 chars with A in first and second character : "AACD" => "CD"
 * 3. 4 chars with A in second character : "BACD" => "BCD"
 * 4. 4 chars with no A's in both first and second character : "BBAA" => "BBAA"
 * 5. 1 char with A as starting character : "A" => ""
 * 6.1 char with A as not a starting character : "B" => B"
 * 7. empty char : "" => ""
 * 8. n chars : "AABAA" => "BAA"
 */
	 
	RemoveFirst2Chars RemoveFirst2Chars;
	@BeforeEach
	void setup()
	{
		RemoveFirst2Chars=new RemoveFirst2Chars();
	}
	@Test
	void test4CharswithAinfirst() {
		assertEquals("BCD",RemoveFirst2Chars.removefirst2chars("ABCD"));
	}
	@Test
	void test4CharswithAinfirstandsecond() {
		assertEquals("CD",RemoveFirst2Chars.removefirst2chars("AACD"));
	}
	@Test
	void test4CharswithAinsecond() {
		assertEquals("BCD",RemoveFirst2Chars.removefirst2chars("BACD"));
	}
	@Test
	void test4CharswithnoAinfirstandsecond1() {
		assertEquals("BBAA",RemoveFirst2Chars.removefirst2chars("BBAA"));
	} 
	
	@Test
	void test1withnoA() {
		assertEquals("B",RemoveFirst2Chars.removefirst2chars("B"));
	}
	
   @Test
	void test1CharwithA() {
		assertEquals("",RemoveFirst2Chars.removefirst2chars("A"));
	}
   @Test
	void testemptyChars() {
		assertEquals("",RemoveFirst2Chars.removefirst2chars(""));
	}
	@Test
	void nChars() {
		assertEquals("BAA",RemoveFirst2Chars.removefirst2chars("AABAA"));
	}
	
	
	
} 
