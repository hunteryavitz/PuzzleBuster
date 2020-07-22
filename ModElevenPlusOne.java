public class ModElevenPlusOne {

	/**
	We'll say a number is cool if it's a multiple of 11 or if it is one more than a multiple of 11. 
	Return true if the given non-negative number is cool.
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		isCool(22)   <b>---></b> true <br>
		isCool(23)    <b>---></b> true <br>
		isCool(24) <b>---></b> false <br>
	 */
		public static boolean isCool(int n) {
			
			return ((n % 11 == 0) || (n % 11 == 1));
			
		}
	
}