package executor;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testing.ReverseStringTester;
import testing.AnagramsTester;
import testing.DeletionTester;
import testing.LongestPalindromeTester;
import testing.PalindromeTester;

public class TestRunner {

	public static void reverseRun() {

		Result result = JUnitCore.runClasses(ReverseStringTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}

	public static void palindromeRun() {

		Result result = JUnitCore.runClasses(PalindromeTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}
	
	public static void deletionRun() {

		Result result = JUnitCore.runClasses(DeletionTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}
	
	public static void longestPalindromeRun() {

		Result result = JUnitCore.runClasses(LongestPalindromeTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}
	
	public static void anagramsRun() {

		Result result = JUnitCore.runClasses(AnagramsTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}
}
