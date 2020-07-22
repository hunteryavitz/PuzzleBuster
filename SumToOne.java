public class SumToOne {

	/**
	 * Given three ints, a b c, return true if it is possible to add two of 
	 * the ints to get the third. There should only be a single line of code in the method body.<br>
	 * <br> 
	 *
	 * <b>EXPECTATIONS:</b><br>
		twoSumOne(1, 2, 3)   <b>---></b> true <br>
		twoSumOne(3, 1, 2)    <b>---></b> true <br>
		twoSumOne(3, 2, 2) <b>---></b> false <br>
	 */
		public static boolean twoSumOne(int a, int b, int c) {
			
			if ((a + b) == c || (a + c) == b || (b + c) == a) { return true; }
			
			return false;

		}
		
}