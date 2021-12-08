package exceptionHandling;

import java.util.*;
import java.util.Scanner;

public class NewAccount /* implements Comparable<NewAccount> */
{
	Scanner sc = new Scanner(System.in);
	private int accountId;
	private String accHolderName;
	private int balance;

	public long getaccountId() {
		return accountId;
	}
	public void setaccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	@Override
	public String toString() {
		return "NewAccount [accountId=" + getaccountId() + ", accHolderName=" + accHolderName + ", balance=" + balance
				+ "]";
	}

	public NewAccount(int accountId, String accHolderName, int balance) {
		super();
		this.setaccountId(accountId);
		this.accHolderName = accHolderName;
		this.balance = balance;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit() throws BadFormatException {
		
			System.out.println("enter the amount to be added: ");
			double amount=sc.nextInt();
//		
		if (amount < 0) {
			
			throw new BadFormatException("Amount can not in negative number: ");
		}
		
		balance += amount;
		
		
	}

	public int withDrawl() throws InsufficientBalance, BadFormatException {
		System.out.println("enter the amount to be with draw : ");
		double amount=sc.nextInt();
		if (amount < 0) {
			throw new BadFormatException("Amount can not in negative number: ");
		}
		if (amount > balance) {
			throw new InsufficientBalance("Available Balance : Rs " + balance + "requested for withdrawl :" + amount
					+ "so transistion can not be completed: ");
		}
		else {
		balance -= amount;
		
		return balance;}
	}

	public void printAccountDetails() {
		System.out.println(getaccountId() + " " + getAccHolderName() + " " + getBalance());
	}

//	Scanner sc = new Scanner(System.in);

//private Object getaccountId;
	public void searchAccount() {
		NewAccount n2 = new NewAccount(123, "sai",1000);
		System.out.println("enter the account id:");
		
//		int accountId1=sc.nextInt();
		try {
			int accountId1 = sc.nextInt();
		if (accountId==accountId1) {
			System.out.println("account matched: ");
		} else {
			System.out.println("not found: ");
		}}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage()+" please provide correct acc number: ");
		}
	}
//@Override
//public int compareTo(NewAccount o) {
//	// TODO Auto-generated method stub
//return 
}
