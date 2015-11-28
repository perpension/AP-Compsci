/**100 Pentagonal Numbers
 * @author Daniel Gu
 * @param n Incrementing number (1 to 100)
 * @return The final pentagonal number for each n
 * 
 */

package old;

public class pentagonal {	
	public static int getPentagonalNumber(int n){
		int pent = n*(3*n - 1)/2;
		return pent;
	}


	public static void main(String[] args){
		int count = 0;
		for (int i = 1; i <= 100; i++){
			pentagonal p1 = new pentagonal();
			
			System.out.printf("%-7d", p1.getPentagonalNumber(i));
			count++;
			
			if (count == 10){
				System.out.println();
				count = 0;
			}
		}
	}
}
