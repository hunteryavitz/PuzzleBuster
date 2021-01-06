package recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	static Map<Integer, Long> memo = new HashMap<>();
	
	public static void main(String[] args) {

		System.out.println(fib(3)); //--> 2
		System.out.println(fib(4)); //--> 3
		System.out.println(fib(5)); //--> 5
		System.out.println(fib(6)); //--> 8
		System.out.println(fib(7)); //--> 13
		System.out.println(fib(50)); //--> 12586269025
	}

	public static Long fib(int n) {
		
		if(!(memo.containsKey(n))) {
			if (n <= 2) {
				memo.put(n, 1L);
			} else {
				memo.put(n, fib(n - 1) + fib(n - 2));
			}
		}
		return memo.get(n);
		
		
		
	}
	


}
