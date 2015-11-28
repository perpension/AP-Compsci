package old;
/**
 * Smallest Factor Finder
 * @author Daniel Gu
 * @param num User inputed number (for finding the smallest factor)
 * @returns The smallest factor that is not 1 of num
 */
import java.util.Scanner;

public class smallestFactor {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a number");
		int num = in.nextInt();
		int factor = 2;
		
		in.close();
		
		while(num % factor != 0){
			factor++;
			if(num % factor == 0){
				break;
			}
		}
		System.out.println(factor);
		
//		alternative method
//		for(; num % factor != 0; ++factor){
//		}
//		System.out.println(factor);
	}
}
