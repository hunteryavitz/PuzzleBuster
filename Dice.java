import java.util.Random;
import java.util.Scanner;

class Dice {
	
	static int dice_sides;
	static int dice_count;
	
	static Random r = new Random();
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {

		getDice();
		
	}

	static void getDice() {
		
		System.out.print("\nHow many dice? ");
		dice_count = in.nextInt();

		System.out.print("\nHow many sides? ");
		dice_sides = in.nextInt();

		System.out.println();
		rollDice(dice_count, dice_sides);

	}

	static void rollDice(int d_sides, int d_count) {
	
		int roll_total = 0;
		int dice_roll;

		while (d_count > 0) {
		
			d_count--;
		
			dice_roll = r.nextInt(dice_sides) + 1;
			
			System.out.print("[" + dice_roll + "] ");
			
			roll_total = roll_total + dice_roll;
				
		}
		
		System.out.println("\nRoll Total: " + roll_total);
	
		getDice();

	}
	
}