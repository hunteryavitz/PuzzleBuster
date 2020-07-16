public class Recursion {

	static String newString = "";
	static int i = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(stringSplice("hello", '*')); // h*e*l*l*o
		System.out.println(stringSplice("there", '#')); // t#h#e#r#e
		System.out.println(stringSplice("fancy", '$')); // f$a$n$c$y
	
	}

	
	public static String stringSplice(String word, char c) {

		if (word.length() <= 1) { return word; }
		
		return word.charAt(0) + String.valueOf(c) + stringSplice(word.substring(1), c);
	}

}
