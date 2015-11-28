/**
 * Table of Sines and Cosines
 * @author Daniel Gu
 * @return Sin and Cosine Table, from 0 degrees to 360, incrementing by 10 degrees each row
 */
package old;

public class degreeTable {
	public static void main(String[] args){
		
		int deg = 0;
		double sin = 0;
		double cos = 0;
				
		System.out.printf("%-10s %-10s %-10s\n", "Degree", "Sine", "Cosine");	//formatting for title
		for (int i=0; i<=36; i++){
			sin = Math.sin(Math.toRadians(deg));
			cos = Math.cos(Math.toRadians(deg));
			
			System.out.printf("%-10d %-10.4f %-10.4f\n", deg, sin, cos);
			
			deg += 10;
		}
	}
}
