public class FizzyWizzy {

	/**
	Given an int n, return the string form of the number followed by "!". 
	So if the int is for example 13 this method should return "13!". 
	However the catch is that if the number is divisible by 3 the method should return "Fizz!" 
	instead of the number, and if the number is divisible by 5 it should return "Buzz!", 
	and if divisible by both 3 and 5, use "FizzBuzz!". You'll need to use the % "mod" 
	for computing the remainder after division, so 23 % 10 yields 3. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		fizzyWizzy(1)   <b>---></b> "1!" <br>
		fizzyWizzy(2)    <b>---></b> "2!" <br>
		fizzyWizzy(3) <b>---></b> "Fizz!" <br>
	 */

	public static String fizzyWizzy(int n) {
		
		String word = n + "!";
		
		boolean fizz = (n % 3 == 0);
		boolean buzz = (n % 5 == 0);
		    
		if (fizz && buzz) { return "FizzBuzz!"; }
		if (fizz) { return "Fizz!"; }
		if (buzz) { return "Buzz!"; }
		
		return word;

		}

}