package old;

/** Marginal Tax Calculator by Daniel Gu
 * Takes your income and filing status, and outputs the appropriate marginal tax. 
 * @param income Amount of dollars earned
 * @param filingStatus Which filing status the person falls under, in numeric form
 * @return Total tax of income
 */

import java.util.Scanner;

public class marginalTax {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input your total income, without commas or dollar sign:");
		double income = in.nextDouble(); //stores income in a double to account for cent values
		
		System.out.println("Input your appropriate filing status with the appropriate number:\n\t0: Single\n\t1: Married Filing Jointly or Qualified Widow(er)\n\t2: Married Filing Separately\n\t3: Head of Household");
		int filingStatus = in.nextInt(); //stores the filing status as an integer for the 5 cases 
		
		if (filingStatus == 0){
			double tenPerR = .1 * 8350; //tax for 10% tax rate
			double fifteenPerR = .15 * 24699; //tax for 15% tax rate
			double twentyFiveP = .25 * 48299; //tax for 25% tax rate
			double twentyEightP = .28 * 89299; //tax for 28% tax rate
			double thirtyThreeP = .33 * 201399; //tax for 33% tax rate
			
			double totalTax;
			double totalBottom = tenPerR + fifteenPerR + twentyFiveP + twentyEightP + thirtyThreeP; //total bottom taxes minus 35%
		
			if (income <= 0 ){ //accounting for negative or zero incomes 
				System.out.println("Tax: $0.00");
			}
			
			else if (income > 0 && income <= 8350){ //if income is in the first bracket, the total tax will equal .1 * income
				totalTax = income * .1;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 8351 && income <= 33050){ //if income is "in" second bracket, the total tax will amount to 10% applied to the first bracket range, then 15% applied to the leftover
				totalTax = (income - 8350)* .15 + tenPerR;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 33951 && income <= 82250){ //if income is "in" the third bracket, total tax will amount to taxes applied for the first two brackets, in addition any "extra" in the third bracket with a 25% tax
				totalTax = (income - 33050) * .25 + tenPerR + fifteenPerR;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 82251 && income <= 171550){ //process repeats
				totalTax = (income - 82550) * .28 + tenPerR + fifteenPerR + twentyFiveP; 
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 171551 && income <= 372950){ //repeat
				totalTax = (income - 171550)* .33 + tenPerR + fifteenPerR + twentyFiveP + twentyEightP; 
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (372951 <= income){ //if income is over the largest number - take all of the lower brackets, tax them appropriately, and apply 35% to all leftover income
				double overflow = income - 37290; //subtracts the upper range from income
				double upperRate = overflow * .35; //finds the tax for the overflow amount (all income over $37291)
				
				totalTax = upperRate + totalBottom;
				
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else{ //if none of the above cases are met
				System.out.println("There's been an error - please report!");
			}
		}		
		
		else if (filingStatus == 1){ //case number 2
			double tenPerR = .1 * 16700; //tax for 10% tax rate
			double fifteenPerR = .15 * 51199; //tax for 15% tax rate
			double twentyFiveP = .25 * 69149; //tax for 25% tax rate
			double twentyEightP = .28 * 71799; //tax for 28% tax rate
			double thirtyThreeP = .33 * 164099; //tax for 33% tax rate
			
			double totalTax;
			double totalBottom = tenPerR + fifteenPerR + twentyFiveP + twentyEightP + thirtyThreeP; //total bottom taxes minus 35%
		
			if (income <= 0 ){ //accounting for negative or zero incomes 
				System.out.println("Tax: $0.00");
			}
			
			else if (income > 0 && income <= 16700){ //if income is in the first bracket, the total tax will equal .1 * income
				totalTax = income * .1;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 16701 && income <= 51199){ //if income is "in" second bracket, the total tax will amount to 10% applied to the first bracket range, then 15% applied to the leftover
				totalTax = (income - 16700)* .15 + tenPerR;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 51200 && income <= 69149){ //if income is "in" the third bracket, total tax will amount to taxes applied for the first two brackets, in addition any "extra" in the third bracket with a 25% tax
				totalTax = (income - 51199) * .25 + tenPerR + fifteenPerR;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 69150 && income <= 71799){ //process repeats
				totalTax = (income - 69149) * .28 + tenPerR + fifteenPerR + twentyFiveP; 
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 71800 && income <= 164099){ //repeat
				totalTax = (income - 71799)* .33 + tenPerR + fifteenPerR + twentyFiveP + twentyEightP; 
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (164100 <= income){ //if income is over the largest number - take all of the lower brackets, tax them appropriately, and apply 35% to all leftover income
				double overflow = income - 164099; //subtracts the upper range from income
				double upperRate = overflow * .35; //finds the tax for the overflow amount (all income over $37291)
				
				totalTax = upperRate + totalBottom;
				
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else{ //if none of the above cases are met
				System.out.println("There's been an error - please report!");
			}
		}
		
		else if (filingStatus == 2){
			double tenPerR = .1 * 8350; //tax for 10% tax rate
			double fifteenPerR = .15 * 25597; //tax for 15% tax rate
			double twentyFiveP = .25 * 34574; //tax for 25% tax rate
			double twentyEightP = .28 * 35899; //tax for 28% tax rate
			double thirtyThreeP = .33 * 82049; //tax for 33% tax rate
			
			double totalTax;
			double totalBottom = tenPerR + fifteenPerR + twentyFiveP + twentyEightP + thirtyThreeP; //total bottom taxes minus 35%
		
			if (income <= 0 ){ //accounting for negative or zero incomes 
				System.out.println("Tax: $0.00");
			}
			
			else if (income > 0 && income <= 8350){ //if income is in the first bracket, the total tax will equal .1 * income
				totalTax = income * .1;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 8351 && income <= 25597){ //if income is "in" second bracket, the total tax will amount to 10% applied to the first bracket range, then 15% applied to the leftover
				totalTax = (income - 8350)* .15 + tenPerR;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 25598 && income <= 34574){ //if income is "in" the third bracket, total tax will amount to taxes applied for the first two brackets, in addition any "extra" in the third bracket with a 25% tax
				totalTax = (income - 25597) * .25 + tenPerR + fifteenPerR;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 34575 && income <= 35899){ //process repeats
				totalTax = (income - 34574) * .28 + tenPerR + fifteenPerR + twentyFiveP; 
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 35900 && income <= 82049){ //repeat
				totalTax = (income - 35899)* .33 + tenPerR + fifteenPerR + twentyFiveP + twentyEightP; 
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (82050 <= income){ //if income is over the largest number - take all of the lower brackets, tax them appropriately, and apply 35% to all leftover income
				double overflow = income - 82049; //subtracts the upper range from income
				double upperRate = overflow * .35; //finds the tax for the overflow amount (all income over $37291)
				
				totalTax = upperRate + totalBottom;
				
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else{ //if none of the above cases are met
				System.out.println("There's been an error - please report!");
			}
		}
		
		else if (filingStatus == 3){
			double tenPerR = .1 * 11950; //tax for 10% tax rate
			double fifteenPerR = .15 * 33549; //tax for 15% tax rate
			double twentyFiveP = .25 * 71949; //tax for 25% tax rate
			double twentyEightP = .28 * 72749; //tax for 28% tax rate
			double thirtyThreeP = .33 * 182749; //tax for 33% tax rate
			
			double totalTax;
			double totalBottom = tenPerR + fifteenPerR + twentyFiveP + twentyEightP + thirtyThreeP; //total bottom taxes minus 35%
		
			if (income <= 0 ){ //accounting for negative or zero incomes 
				System.out.println("Tax: $0.00");
			}
			
			else if (income > 0 && income <= 11950){ //if income is in the first bracket, the total tax will equal .1 * income
				totalTax = income * .1;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 11951 && income <= 33549){ //if income is "in" second bracket, the total tax will amount to 10% applied to the first bracket range, then 15% applied to the leftover
				totalTax = (income - 11950)* .15 + tenPerR;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 33550 && income <= 71949){ //if income is "in" the third bracket, total tax will amount to taxes applied for the first two brackets, in addition any "extra" in the third bracket with a 25% tax
				totalTax = (income - 33549) * .25 + tenPerR + fifteenPerR;
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 71950 && income <= 72749){ //process repeats
				totalTax = (income - 71949) * .28 + tenPerR + fifteenPerR + twentyFiveP; 
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (income >= 72750 && income <= 182749){ //repeat
				totalTax = (income - 72749)* .33 + tenPerR + fifteenPerR + twentyFiveP + twentyEightP; 
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else if (182750 <= income){ //if income is over the largest number - take all of the lower brackets, tax them appropriately, and apply 35% to all leftover income
				double overflow = income - 182749; //subtracts the upper range from income
				double upperRate = overflow * .35; //finds the tax for the overflow amount (all income over $37291)
				
				totalTax = upperRate + totalBottom;
				
				System.out.printf("Tax: $%,.2f", totalTax);
			}
			
			else{ //if none of the above cases are met
				System.out.println("There's been an error - please report!");
			}
			
			in.close(); //closes scanner
		}
			
		else {
			System.out.println("That is not an appropriate input. Please restart the program and select an option 0-3.");		
		}
	}

}
