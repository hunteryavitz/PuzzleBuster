class BubbleSort {
	
	public static int[] mArray = new int[]{2, 6, 7, 3, 9, 5, 4, 0, 1, 8};
	
	public static void main(String[] args) {

		Display(mArray);
		
		Sort(mArray, 10);
		
		Display(mArray);
		
	}
	
	//
	public static void Sort(int[] a, int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1); j++) {
				if (a[j] > a[(j + 1)]) {
					int temp = a[j];
					a[j] = a[(j + 1)];
					a[(j + 1)] = temp;
				}
			}
		}
	}
	
	public static void Display(int[] a) {
		
		System.out.println();
		
		for (int e : a) {
			System.out.print(e + ", ");
		}
		
	}
	
}