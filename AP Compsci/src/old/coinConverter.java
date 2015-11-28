package old;

/**Coin Convert by Daniel Gu
 * 
 * Tool that converts any monetary value into its appropriate bill and coin denominations. 
 * 
 * Works by taking the remainder of the original value, then passing it through each "bill value" to get the appropriate number of denominations for the amount entered. 
 * 
 * Uses the scanner class to take in user input. 
 * @param dollars Amount of dollars without sign or comma
 * @return Number of each bill and coin denomination 
 */
import java.util.Scanner;

public class coinConverter {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Coin Converter:\nEnter your dollar amount without commas or dollar sign.");
		
		double deposit = in.nextDouble();
		
		double hundredR = deposit % 100; //takes the remainders of each bill, and passes it down for each appropriate bill/coin
		double fiftyR = hundredR % 50;
		double twentyR = fiftyR % 20;
		double tenR = twentyR % 10;
		double fiveR = tenR % 5;
		double oneR = fiveR % 1;
		double quarterR = oneR % .25;
		double dimeR = quarterR % .1;
		double nickelR = dimeR % .05;

		in.close(); //closes scanner
		
		double hundred = (deposit - deposit % 100) / 100; //subtracts the remainder received from the modulus of each bill from the remainders calculated previously 
		double fifty = (hundredR - hundredR % 50) / 50;
		double twenty = (fiftyR - fiftyR % 20) / 20;
		double ten = (twentyR - twentyR % 10) / 10;
		double five = (tenR - tenR % 5) / 5;
		double one = (fiveR - fiveR % 1) / 1;
		double quarter = (oneR - oneR % .25) / .25;
		double dime = (quarterR - quarterR % .1) / .1;
		double nickel = (dimeR - dimeR % .05) / .05;
		double penny = (nickelR - nickelR % .01) / .01;

		System.out.println("\n100s: " + hundred+ "\n50s: " + fifty + "\n20s: " + twenty + "\n10s: " + ten + "\n5s: " + five + "\n1s: " + one + "\nQuarters: " + quarter + "\nDimes: " + dime + "\nNickels: " + nickel + "\nPennies: " + penny); //outputs the number of each on separate lines
	}
}
