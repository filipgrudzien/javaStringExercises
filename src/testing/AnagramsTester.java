package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import LogicAndUtility.Anagrams;
import LogicAndUtility.PalindromeCheck;

public class AnagramsTester {

	@Test
	public void test1() {
		assertEquals(true, Anagrams.checkIfAnagrams("ayay", "yaya"));
	}
	
	@Test
	public void test2() {
		assertEquals(false, Anagrams.checkIfAnagrams("arrr", "tttt"));
	}
	
	@Test
	public void test3() {
		assertEquals(false, Anagrams.checkIfAnagrams("aaa", "abcd"));
	}

}
