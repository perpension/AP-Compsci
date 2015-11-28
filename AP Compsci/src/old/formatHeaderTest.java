/**
 * Formatting Inputed Numbers
 * @author Daniel Gu
 * @param number The number being formatted
 * @param width The total width of the formatted number
 * @return Formatted number dependent on width specified
 */
package old;

import java.util.Scanner;

public class formatHeaderTest {
	
	public static String format(int number, int width){
		int numLength = String.valueOf(number).length();	
		if (numLength >= width){
			return String.valueOf(number);
		}
		else {
			String formatted = String.format("%%0%dd", width);
			String result = String.format(formatted,  number);
			return result;
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Formatting Integers\n");
		System.out.println("Enter the number to be formatted.");
		int number = in.nextInt();
		
		System.out.println("Enter the total number of digits you would like your number to have.");
		int width = in.nextInt();
		
		in.close();
		
		System.out.println("Your new number is: " + format(number, width));
	}
}
