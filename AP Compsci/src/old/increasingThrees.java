/**
 * Sorting Three Numbers in Increasing Order
 * @author Daniel Gu
 * @param num1 First inputed number
 * @param num2 Second inputed number
 * @param num3 Third inputed number
 * @return The three numbers in increasing order
 */
package old;

import java.util.Scanner;

public class increasingThrees {
	
	public static void displaySortedNumbers(double num1, double num2, double num3){ //goes through case by case to determine which order the numbers should be sorted in
		if (num1>=num2){
			if(num2>=num3){
				System.out.println(num3 + ", " + num2 + ", " + num1);
			}
			else {
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}
		}
		
		else if (num2>=num3){
			System.out.println(num1 + ", " + num3 + ", " + num2);
		}
		
		else {
			System.out.println(num1 + ", " + num2 + ", " + num3);
		}
	}
	
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Increasing Number Sorter");

		System.out.println("Please input your first number."); //prompts user for first number
		double num1 = in.nextDouble();
		System.out.println("Please input your second number."); //prompts user for second number
		double num2 = in.nextDouble();
		System.out.println("Please input your third number."); //prompts user for third number
		double num3 = in.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
	}
}
