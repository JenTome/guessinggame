import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Guess a number between 1 and 10?");
		int number = input.nextInt();
		
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
		input.close();
			
		
	}

}
