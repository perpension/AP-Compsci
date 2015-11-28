/** Bank Account by Daniel Gu
 * 
 * Bank account emulator 
 * 
 * @param balance Remaining balance in account
 * @param id Account number
 * @param name Name of person
 * @param accountType Type of account
 * 
 * @return Account type, Account number, Name of person, Amount withdrawn, remaining balance, amount deposited
 */

package old;

import java.util.Scanner;

class bankAccount{
	String name, accountType;
	int id;
	double balance, withdrawing, depositing;
	
	balance = 2000;
	
	public bankAccount(double balance, double withdrawing, double depositing){
		this.balance = balance;
		this.withdrawing = withdrawing;
		this.depositing = depositing;
	}
	
	public bankAccount(String name, String accountType, int id){
		this.name = name;
		this.accountType = accountType;
		this.id = id;
	}
	
	public String name(String name){
		return name;
	}
	
	public double deposit(double depositing){
		balance += depositing;
		return balance;
		System.out.println("Successfully deposited " + depositing);

	}
	
	public double withdraw(double withdrawing){
		if (balance < withdrawing){
			System.out.println("Insufficient funds.");
			return balance;
		}
		else {
			System.out.println("Successfully withdrew " + withdrawing);
			return balance -= withdrawing;
		}
	}
	
	public String toString(){
		System.out.print("Name: " + name + "\nAccount Type: " + accountType + "\nAccount Number: " + id);
	}
}

class AccountTest {
	public static void main(String[] args){
		bankAccount a1 = new bankAccount("Gu", "Checking", 1324);
		
		a1.withdraw(100);
		a1.deposit(100);
				
		System.out.println(a1);
	}
}
