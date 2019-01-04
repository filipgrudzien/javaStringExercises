package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import LogicAndUtility.DeleteCharFromString;

public class DeletionTester {

	@Test
	public void test1() {
		assertEquals("kruk", DeleteCharFromString.deletion("kruk", 'o'));
	}
	
	@Test
	public void test2() {
		assertEquals("ru", DeleteCharFromString.deletion("kruk", 'k'));
	}
	
	@Test
	public void test3() {
		assertEquals("takjest", DeleteCharFromString.deletion("tak jest", ' '));
	}
	
	@Test
	public void test4() {
		assertEquals(" ", DeleteCharFromString.deletion(" ", 'x'));
	}
	
	@Test
	public void test5() {
		String nullString = null;
		assertEquals(null, DeleteCharFromString.deletion(nullString, 'x'));
	}
	
	@Test
	public void test6() {
		assertEquals("kruk", DeleteCharFromString.recursiveDeletion("kruk", 'o'));
	}
	
	@Test
	public void test7() {
		assertEquals("ru", DeleteCharFromString.recursiveDeletion("kruk", 'k'));
	}
}
