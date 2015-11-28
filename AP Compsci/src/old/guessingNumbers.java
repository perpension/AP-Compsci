package old;

/**
 * Guessing number game
 * 
 * @author Daniel Gu
 * @param guess The number guess each time. 
 * @return Try again!
 * @return Aim lower!
 * @return Aim higher!
 * @return Nice job!
 */

import java.util.Scanner;

public class guessingNumbers {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Guess what number I'm thinking!");
		int guess = in.nextInt();
		
		int number = (int)(Math.random() * 101);
		
		while(guess != number){
			System.out.println("Try again!");

			if (guess > number){
				System.out.println("Aim lower!");
			}
			else {
				System.out.println("Aim higher!");
			}
			
			guess = in.nextInt();
		}
		
		in.close();
		
		System.out.println("Nice job!");
		}
	}

