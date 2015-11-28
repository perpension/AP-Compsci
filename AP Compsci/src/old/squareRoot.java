/**
 * Square Root Table
 * @author Daniel Gu
 * @return Table of 20 numbers and their square roots, formatted nicely in a table
 */
package old;

public class squareRoot {
	public static void main(String[] args){
		
		int number = 0;
		
		System.out.printf("%-10s %-10s\n", "Number", "Square Root");
		for (int i = 0; i <= 20; i++){
			System.out.printf("%-10d %-10.4f\n", number, Math.sqrt(number));
			number++;
		}
	}
}
