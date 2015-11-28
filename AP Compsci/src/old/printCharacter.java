/**
 * Printing character headers
 * @author Daniel Gu
 * 
 * @param ch1 First inputed character
 * @param ch2 Second inputed character
 * @param numberPerLine
 * @return Formatted grid of characters based upon previous parameters
 */
package old;

import java.util.Scanner;

public class printCharacter {
	public static void printChars(char ch1, char ch2, int numberPerLine){
		int line=0;
		for(char i = ch1; i < ch2; i++){
			System.out.print(i + " ");
			line++;
			if(line==numberPerLine){
				line=0;
				System.out.println("\n");
			}
		}
	}
	
	public static void main(String[] args) {
		char ch1;
		char ch2;
		int numberPerLine;
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input your starting letter.");
		ch1 = in.next().charAt(0);		
		
		System.out.println("Please input your ending letter.");
		ch2 = in.next().charAt(0);		
		
		System.out.println("How many letters per row?");
		numberPerLine = in.nextInt();
	
		printChars(ch1, ch2, numberPerLine);
	}
}