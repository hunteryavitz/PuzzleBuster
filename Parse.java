public class Parse {

	public static void main(String[] args) {
		
		String text01 = "At the department store there are many items including category:electronics and " +
						"category:pharmaceuticals as well as others like category:apperal and category:toys " +
						"also many more such as category:housewares or category:groceries or category:office " +
						"and finally things like category:garden and category:jewelry ...";
		
		parseString(text01);
		
	}

	public static void parseString(String str) {
		
		System.out.println();
		
		while (str.indexOf("category") != -1) {
			
			str = str.substring(str.indexOf("category"));
			System.out.println(str.substring(str.indexOf("category") + 9, str.indexOf(" ")));
			str = str.substring(str.indexOf(" "));
			
		}

		System.out.println();
		
	}
	
}