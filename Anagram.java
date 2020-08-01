public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram1("abcde", "cedba")); //True
		System.out.println(isAnagram1("abcdefg", "cedba")); //False - Inequal length
		System.out.println(isAnagram1("xyz", "zxy")); //True
		System.out.println(isAnagram1("pqrs", "tuvw")); //False - Different characters

	}

	public static boolean isAnagram1(String word_a, String word_b) {

		// Check both words are same length
		if(word_a.length() != word_b.length()) { return false; }

		// Build character array from word_a
		char[] chars = word_a.toCharArray();

		// Iterate through array to check character by character in word_b
		for(char c : chars) {

			int index = word_b.indexOf(c);

			// If any character is not present in both words, return false
			if(index != -1) {

				// Splice found character from word_b
				word_b = word_b.substring(0, index) + word_b.substring(index + 1);

			} else {
				return false;
			}
		}

		// If we can empty word_b, both words are anagrams
		return word_b.isEmpty();
	}
}