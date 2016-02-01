package lesson10; 
public class listingRandom{ 
	public static void main(String[] args){ 
		int[] numberBox = new int[100]; int i=0; 
		//setting counters to 0 
		int zero = 0; 
		int one = 0; 
		int two = 0; 
		int three = 0; 
		int four = 0; 
		int five = 0; 
		int six = 0; 
		int seven = 0; 
		int eight = 0; 
		int nine = 0; 
		
		System.out.println("Random Number Counter: \nThis program will generate 100 random numbers from 0-9, and display the count for each integer."); 
		for (i=0; i<100; i++){ 
			numberBox[i] = (int)(Math.random()*10); 
			if (numberBox[i] == 0){ 
				zero++; 
				} 
			else if(numberBox[i] == 1){ 
				one++; 
				} 
			else if(numberBox[i] == 2){ 
				two++; 
				} 
			else if(numberBox[i] == 3){ 
				three++; 
				} 
			else if(numberBox[i] == 4){ 
				four++; 
				} 
			else if(numberBox[i] == 5){ 
				five++; 
				} 
			else if(numberBox[i] == 6){ 
				six++; 
				} 
			else if(numberBox[i] == 7){ 
				seven++; 
				} 
			else if(numberBox[i] == 8){ 
				eight++; 
				} 
			else if(numberBox[i] == 9){ 
				nine++; 
				} 
			} 
		System.out.println("Zero: " + zero); 
		System.out.println("One: " + one); 
		System.out.println("Two: " + two); 
		System.out.println("Three: " + three); 
		System.out.println("Four: " + four); 
		System.out.println("Five: " + five); 
		System.out.println("Six: " + six); 
		System.out.println("Seven: " + seven); 
		System.out.println("Eight: " + eight); 
		System.out.println("Nine: " + nine); 
		} 
	}
