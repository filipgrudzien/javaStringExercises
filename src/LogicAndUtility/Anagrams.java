package LogicAndUtility;

import java.util.Arrays;

public class Anagrams {
	public static boolean checkIfAnagrams(String word1, String word2) {

		if (word1.length() != word2.length()) {
			return false;
		}

		word1.toLowerCase();
		word2.toLowerCase();

		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (String.copyValueOf(arr1).equals(String.copyValueOf(arr2))) {
			return true;
		} else {
			return false;
		}
	}
}
