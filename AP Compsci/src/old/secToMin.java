package old;

/**
 * Seconds to Minute Converter Modified by Daniel Gu
 * previous seconds to minute converter was modified to include a conversion to time, and responding appropriately depending on the time given.
 * 
 * @param sec Seconds input
 * @return Time in minutes and seconds
 * @return "It is past your bedtime." if sec is equal to 0
 * @return "It is time to go to school" if sec is equal to 7 * 3600
 * @return "It is 7:57, please report to IGS." if time is equal to (7*3600+57*60) 
*/
import java.util.Scanner;

public class secToMin{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

	    System.out.println("Input the time in seconds.");
	    int sec = in.nextInt();
	    
	    in.close();
	    
	    int leftSec = sec % 60;
	    int min = (sec - leftSec) / 60;
	
	    if (sec == 0){
	        System.out.println("It is past your bedtime.");
	    }
	
	    else if (sec == 7 * 3600){
	        System.out.println("It is time to go to school.");
	    }
	
	    else if (sec == 7*3600 + 57*60){
	        System.out.println("It is 7:57, please report to IGS.");
	    }
	    else{
	        System.out.println("The time is " + min/60 + ":" + min + ":" + leftSec);
	    }
	}
}

