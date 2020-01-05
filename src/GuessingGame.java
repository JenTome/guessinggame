import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		

		System.out.println("Guess a number between 1 and 10?");
		int number = input.nextInt();
		int targetNumber = ThreadLocalRandom.current().nextInt(1 ,11);
		int numAttempts = 0;
		
		do {
			if (number == targetNumber) {
				System.out.println("Yay! That is correct!  You win!");	
			} else if (number == 0) {
				System.out.println("Sorry that is no good.  Pick a number between 1 and 10");
				number = input.nextInt();
			} else if (number == -1) {
				System.exit(0);
			} else if (number > 7)	{
				System.out.println("Sorry too high!  Guess again!"); 
			} else if (number < 7) {
				System.out.println("Sorry too low!  Guess again!");		
			}
			
			while (numAttempts <3) System.out.println();
		
					input.close();
					
		}
		
	}
	
}
	
	
	/*  commented out
	}
		if (number == 7) {
			System.out.println("you won!");
			System.exit(0);
		}
		
		else if (number == 0 ) {
			System.out.println("Guess a number between 1 and 10?");
		}
		
		else {
			System.out.println("you lose but try again!");
			System.out.println("Guess a number between 1 and 10?");
		}
		
		number = input.nextInt();
		
		if (number == 7) {
			System.out.println("you won!");
			System.exit(0);
		}
		
		else if (number != 7 ) {
			System.out.println("Guess a number between 1 and 10?");
		}
		
		else {
			System.out.println("you lose!");
		}
*/
			
		
	


