package LogicAndUtility;

public class LongestPalindromeSubstring {

	public static String findingLongestPalindrome(String word) {

		String currentLongest = "";

		for (int i = 0; i < word.length() - 1; i++) {
			for (int j = i + 1; j < word.length(); j++) {
				
				String possiblePalindrome = word.substring(i, j + 1);
				
				if (PalindromeCheck.checking(possiblePalindrome)
						&& (possiblePalindrome.length() > currentLongest.length()) && possiblePalindrome.length()>=2) {
					currentLongest = possiblePalindrome;
				}
			}
		}

		return currentLongest;
	}
}
