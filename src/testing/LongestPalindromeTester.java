package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import LogicAndUtility.LongestPalindromeSubstring;
import LogicAndUtility.PalindromeCheck;

public class LongestPalindromeTester {

	@Test
	public void test1() {
		assertEquals("geeksskeeg", LongestPalindromeSubstring.findingLongestPalindrome("forgeeksskeegfor"));
	}
	
	@Test
	public void test2() {
		assertEquals("kayak", LongestPalindromeSubstring.findingLongestPalindrome("atkayakas"));
	}

	@Test
	public void test3() {
		assertEquals("", LongestPalindromeSubstring.findingLongestPalindrome("abc"));
	}
}
