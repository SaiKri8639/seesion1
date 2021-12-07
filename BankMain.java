package exceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BankMain
{
  public static void main(String[] args) throws BadFormatException,InsufficientBalance
  {
	NewAccount n2 = new NewAccount(123456,"Sai Krishna",500);
	n2.searchAccount();
	try {
	n2.deposit(1000);
	n2.printAccountDetails();
	n2.deposit(-1000);
	}
	catch(BadFormatException ex1)
	{  
	System.out.println(ex1.getMessage());	
	}
	try {
	n2.withDrawl(1000);
	n2.printAccountDetails();
	n2.withDrawl(2000);
	}
	catch(InsufficientBalance ex)
	{
		System.err.println(ex.getMessage());
	}
	
  }
}

	