package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import LogicAndUtility.ReverseString;

public class ReverseStringTester {

	@Test
	public void test1() {
		assertEquals("ynocorwdo", ReverseString.reverseIterative("odwrocony"));
	}
	
	@Test
	public void test2() {
		assertEquals("ynocorwdo", ReverseString.reverseIterative2("odwrocony"));
	}

	@Test
	public void test3() {
		assertEquals("ynocorwdo", ReverseString.reverseRecursive("odwrocony"));
	}
	

}
