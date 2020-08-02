public class Palindrome2 {

	public static void main(String[] args) {

		System.out.println("mom: " + isPalindrome("mom")); // True
		System.out.println("hamburger: " + isPalindrome("hamburger")); // False
		System.out.println("level: " + isPalindrome("level")); // True
		System.out.println("goat: " + isPalindrome("goat")); // False

	}

	public static boolean isPalindrome(String word) {

		StringBuilder sb = new StringBuilder();
		char[] chars = word.toCharArray();

		for (int i = word.length() - 1; i>=0; i--) {

			sb.append(chars[i]);

		}

		String reversed = sb.toString();

		return word.equals(reversed);
	}

}