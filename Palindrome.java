public class Palindrome {

	public static void main(String[] args) {

		System.out.println("racecar: " + isPalindrome("racecar")); // True
		System.out.println("forest: " + isPalindrome("forest")); // False
		System.out.println("civic: " + isPalindrome("civic")); // True
		System.out.println("bookshelf: " + isPalindrome("bookshelf")); // False
		System.out.println("rotator: " + isPalindrome("rotator")); // True

	}

	public static boolean isPalindrome(String word) {

		if (word == null) { return false; }

		String reversed = reverse(word);

		return word.equals(reversed);

	}

	public static String reverse(String str) {

		if (str == null) { return null; }

		// Base Case
		if (str.length() <= 1) { return str; }

		// Recursion
		return reverse(str.substring(1)) + str.charAt(0);

	}

}