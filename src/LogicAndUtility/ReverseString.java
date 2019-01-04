package LogicAndUtility;

public class ReverseString {

	public static String reverseIterative(String toFlip) {

		char[] array = toFlip.toCharArray();
		StringBuilder strBld = new StringBuilder();

		for (int i = array.length - 1; i >= 0; i--) {
			strBld.append(array[i]);
		}

		return strBld.toString();
	}

	public static String reverseIterative2(String toFlip) {
		
		//StringBuffer tmpBuff = new StringBuffer(toFlip).reverse();
		return (new StringBuffer(toFlip).reverse().toString());
	}
	
	public static String reverseRecursive(String toFlip) {

		if (toFlip.length() < 2) {
			return toFlip;
		}

		return (reverseRecursive(toFlip.substring(1)) + toFlip.charAt(0));

	}

}
