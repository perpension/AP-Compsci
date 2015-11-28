package old;

 /**
 * Monte Carlo simulation
 * 
 * @author Daniel Gu
 * @return An approximation of pi using a monte carlo simulation.
 */

public class monteCarlo {
	public static void main(String[] args){
		
		int totalPoints = 1000000;
		int counter = 0;
		
		for (int i = 0; i < totalPoints; i++){
			double x = (double)((Math.random() * 2) - 1);
			double y = (double)((Math.random() * 2) - 1);
			
			if ((Math.pow(x, 2) + Math.pow(y, 2) < 1)){
				counter++;
			}
			
		}
		System.out.printf("There are %,d points out of 1,000,000 within the circle x^2 + y^2 = 1.", counter);
	}
}
