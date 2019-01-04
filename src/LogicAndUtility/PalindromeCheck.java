package LogicAndUtility;

public class PalindromeCheck {
	
	public static boolean checking(String palindromeWord) {
		
		if(palindromeWord == null || palindromeWord.isEmpty()) {
			return false;
		}

		String reversedWord = new StringBuffer(palindromeWord).reverse().toString();
		
		if (palindromeWord.equals(reversedWord)) {
			return true;
		} else {
			return false;
		}
	}
}
