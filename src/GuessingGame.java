import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Guess a number?");
		int number = input.nextInt();
		
		if (number == 7) {
			System.out.println("you won!");
		}
		else {
			System.out.println("you lose!");
		}
		input.close();
			
		
	}

}
