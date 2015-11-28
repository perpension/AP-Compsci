package old;

/** <h1> A Unit Converter by Daniel Gu </h1>
	<p> Uses the scanner class to take in user input in feet, then converts to meter by applying the conversion factor.<p>
 * @param feet Amount in feet
 * @return Number of meters
 */

import java.util.Scanner; //imports the scanner class

public class metricConvreter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unit Converter (feet to meters)\nEnter the number of feet you would like to convert"); //prompts user with introduction
		
		double feet = in.nextDouble(); //takes numeric input in feet
		double meter = feet*0.305; //converts the input to meters
		
		in.close(); //closes scanner

		System.out.println(feet + " feet converts to " + meter + " meters."); //outputs desired conversion
	}

}
