/**
 * Swapping Variables
 * @author Daniel Gu
 * @param x X value
 * @param y Y value
 * @return Swapped X and Y values
 */

package old;

import java.util.Scanner;

public class variableSwap {
	Scanner in = new Scanner(System.in);
	
	int x, y, temp;
	
	System.out.println("Enter a value for X.");
	x = in.nextInt();
	
	System.out.println("Enter a value for Y.");
	y = in.nextInt();
	
	in.close();
	
	x = temp;
	x = y;
	y = temp;
	
	System.out.println("X is now " + x);
	System.out.println("Y is now " + y);
	}
}
