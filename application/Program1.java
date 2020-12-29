package application;

import entities.Account;
import entities.BusinnessAccount;
import entities.SavingAccount;

public class Program1 {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "alex", 1000.00);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());

		Account acc3 = new BusinnessAccount(1003, "bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
