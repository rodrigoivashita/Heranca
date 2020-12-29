package application;

import entities.Account;
import entities.BusinnessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinnessAccount bacc = new BusinnessAccount(1002, "maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinnessAccount(1003, "Marcos", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Ro", 0.0, 1000.0);
		
		//DOWNCASTING
		
		BusinnessAccount acc4 = (BusinnessAccount) acc2;
		acc4.loan(100.0);
		
		//BusinnessAccount acc5 = (BusinnessAccount) acc3;
		
		if(acc3 instanceof BusinnessAccount) {
			BusinnessAccount acc5 = (BusinnessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}  
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		

	}

}
