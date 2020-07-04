
public class PaycheckCalculator {

	static double[] hour_set = {28, 33, 22, 45, 14, 50};
	
	static double wage_rate = 15.0;
	static double overtime_rate = 1.5;
	
	static double total_pay;
	static double overtime;
	
	static int i;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		i = 0;
		
		for (double hours : hour_set) {
			
			displayPaycheck(calculatePay(hours));
			i++;
			
		}
		
	}

	public static double calculatePay(double total_hours) {
		
		total_pay = 0;
		overtime = 0;
		
		if (total_hours > 40) { overtime = total_hours - 40;  }
		total_pay = ((total_hours - overtime) * wage_rate + (overtime * (wage_rate * overtime_rate)));
		
		return total_pay;
		
	}

	
	public static void displayPaycheck(double total_amount) {
		
		System.out.println();
		if (overtime > 0) {
			System.out.println("Regular Hours:" + (hour_set[i] - overtime));
			System.out.println("Overtime Hours: " + overtime);
		} else {
			System.out.println("Total Hours: " + hour_set[i]);
		}
		System.out.println("Paycheck: " + total_amount);
			
	}
		
}