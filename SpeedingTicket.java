public class SpeedingTicket {
	
		public static int speedingFine(int speed, boolean isHoliday) {
			
			int minSpeed = 60;
			int maxSpeed = 80;
			int fine = 0;
			
			if (isHoliday) {
				
				minSpeed += 5;
				maxSpeed += 5;
				
			}
			
			if (speed >= maxSpeed) { fine = 200; }
			if (speed > minSpeed && speed <= maxSpeed) { fine = 100; }
			
			return fine;

		}
	
}