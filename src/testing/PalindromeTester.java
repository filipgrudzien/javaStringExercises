package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import LogicAndUtility.PalindromeCheck;

public class PalindromeTester {

	@Test
	public void test1() {
		assertEquals(true, PalindromeCheck.checking("kayak"));
	}
	
	@Test
	public void test2() {
		assertEquals(false, PalindromeCheck.checking("kayakk"));
	}
	
	@Test
	public void test3() {
		assertEquals(false, PalindromeCheck.checking(""));
	}
	
	@Test
	public void test4() {
		String example = null;
		assertEquals(false, PalindromeCheck.checking(example));
	}
}
