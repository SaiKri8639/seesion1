package exceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BankMain
{
  public static void main(String[] args) throws BadFormatException,InsufficientBalance
  {
	  Scanner sc = new Scanner(System.in);
	NewAccount n2 = new NewAccount(123,"Sai Krishna",500);
	n2.searchAccount();
	try {
//		System.out.println("enter the amount to be added: ");
//		double amount=sc.nextDouble();
//	n2.deposit(1000);
     n2.printAccountDetails();
	n2.deposit();
    n2.printAccountDetails();

	}
	catch(BadFormatException ex1)
	{  
	System.err.println(ex1.getMessage());	
	}
	try {
	n2.withDrawl();
	n2.printAccountDetails();
//	n2.withDrawl();
	}
	catch(InsufficientBalance ex)
	{
		System.err.println(ex.getMessage());
	}
	n2.printAccountDetails();
		
  }
}
//}
	