package recursion;

public class YoYo {
	
	public static void main (String[] args) {

		System.out.println(yoYo("thisisatest"));
		System.out.println(yoYo("thisyoisatest"));
		System.out.println(yoYo("thisyoisyoatest"));
		System.out.println(yoYo("yothisyoisyoatest"));
		System.out.println(yoYo("yothisyoisyoayotest"));
		System.out.println(yoYo("yothisyoisyoayotestyo"));

	}

	private static int yoYo(String str) {

		if (str.length() < 2) {
			return 0;
		}
		
		if (str.substring(0, 2).equals("yo")) {
			return 1 + yoYo(str.substring(1));
		} else {
			return yoYo(str.substring(1));
		}
	}
}