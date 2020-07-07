
public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(search(new int[] {2, 3, 4, 5, 6, 7}, 5)); // 3
		
		System.out.println(search(new int[] {2, 3, 4, 5, 6, 7}, 9)); // -1
	
	}

	public static int search(int[] nums, int target) {
		
		int i = 0;
		
		for (int number : nums) {
			
			if (number == target) { return i; }
		
			i++;
			
		}
		
		return -1;
	}
	
}
