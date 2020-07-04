public class StringSplitter {
	
	public static void splitString() {

		String[] words = {"aardvark", "butterfly", "centipede", "dolphin", "elephant", "ferret", "giraffe", "hippo", "iguana"};

		String result;

		for (String word : words) {
			
			result = "";

			if (word.length() < 4) {

				System.out.println(word + " is " + word.length() + " characters long.");

			} else {

				int x1 = word.length();

				if ((x1 % 2) == 0) {

					System.out.println(word + " length is even.");

				} else { 

					int x2 = x1 - 3;
					int x3 = x2 / 2;
					int x4 = x1 - x3;

					result = word.substring(x3, x4);

					System.out.println(result);
				}
			}
		}
	}

	public static void main(String args[]){

		splitString();

	}
}