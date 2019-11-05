package Practice;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RNGgame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loading...");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("\nType in 'start' to begin. ");
		String enter = input.next().toLowerCase();
		//String keyword = "start";
		
		if ("start".contentEquals(enter)) {
			
				System.out.println("\nHello there! Welcome to my number guessing game.");
				TimeUnit.SECONDS.sleep(2);
				while (true) {
				System.out.println("\nChoose your difficulty level: ");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("\nFor 1-5 (baby), type 5\nFor 1-10 (easy), type 10\nFor 1-25 (medium), type 25\nFor 1-50 (hard), type 50\nFor 1-100 (impossible), type 100 ");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("\nEnter here: ");
				int difficulty = input.nextInt();
				
				Random num = new Random();
				int randint = num.nextInt(difficulty);
				
				int tries = 0;
				boolean win = false;
				
				System.out.println("My number is between 1 and " + difficulty + ".");
				
				
				while (true) {
					
					System.out.println("What is your guess? ");
					int guess = input.nextInt();
					tries++;
					
					if (guess == randint) {
						win = true;
						break;
					
					} else {
						System.out.println("\nYour guess is wrong, try again.");
					
					}
				}
				System.out.println("Your guess is right, my number is " + randint + ".");
				System.out.println("You win!");
				
				if (tries == 1) {
					System.out.println("It took you " + tries + " try.");
				} 
				else if (tries >1) { 
					System.out.println("It took you " + tries + " tries.");
				}
				System.out.println("Type yes to play again, or type no to exit.");
				String back = input.next().toLowerCase();
				if (back.contentEquals("no")) {
					System.out.println("Ok sure, maybe next time.");
					System.exit(0);
				}
				else if (back.contentEquals("yes")) {
					
					break;
				}
			}
			
		}	
	}
}
	
	
