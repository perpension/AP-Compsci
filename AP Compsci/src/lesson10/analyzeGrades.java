package lesson10;

import java.util.Scanner;

public class analyzeGrades{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double[] gradeBox = new double[100];
		double sum = 0, mean = 0, better = 0, worse = 0;
		int i = 0;
		
		System.out.println("Grade Analyzer: ");
		System.out.println("Enter each test grade one by one. \nEnter a negative integer when finished. \nMaximum of 100 test scores.");
		
		//takes input from user, adds each input number to the sum variable
		for(i=0; i<100; i++){
			gradeBox[i] = in.nextDouble();
			
			//if positive input keep summing, otherwise stop looping
			if (gradeBox[i] >= 0){
				sum += gradeBox[i];
				mean = sum/(i+1);
			}

			else{
				break;
			}
		}
		
		in.close();
		int j = i+1;
		//loops for the length of the array, comparing first if the value is larger than mean, 
		//then less than mean, adding a count whenever is logically true
		for(int x=0; x<j; x++){
			if(gradeBox[x] >= mean){
				better++;
			}
			else{
				worse++;
			}
		}
		
		System.out.println("There were " + better + " scores above or equal to the average, " + mean + ".\nThere were " + worse + " scores below the average.");
		
	}
}
