package executor;

import LogicAndUtility.EveryStringPermutation;

public class ProjectStarter {

	public static void main(String[] args) {
		TestRunner.reverseRun();
		TestRunner.palindromeRun();
		TestRunner.deletionRun();
		//EveryStringPermutation.permutation("123");
		TestRunner.longestPalindromeRun();
		TestRunner.anagramsRun();
	}

}
