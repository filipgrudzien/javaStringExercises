package LogicAndUtility;

public class DeleteCharFromString {
	
	public static String deletion(String word, char toDelete) {
		
		if(word == null || word.isEmpty()) {
			return word;
		}

		StringBuilder afterDeletion = new StringBuilder();
		
		char [] separetedWord = word.toCharArray();
		
		for (char sign : separetedWord) {
			
			if (sign != toDelete) {
				afterDeletion.append(sign);
			}
		}
		
		return afterDeletion.toString();
	}
	
	public static String recursiveDeletion(String word, char toDelete) {
		
		if(word == null || word.isEmpty()) {
			return word;
		}
		
		int indexOfChar = word.indexOf(toDelete);
		
		if (indexOfChar == -1) {
			return word;
		}
		
		return recursiveDeletion((word.substring(0, indexOfChar)+word.substring(indexOfChar+1)),toDelete);
	}
}
