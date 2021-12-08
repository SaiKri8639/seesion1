package exceptionHandling;

import java.util.*;

public class NewAccount /* implements Comparable<NewAccount> */
{
//	NewAccount A1 = new NewAccount();
	Scanner sc = new Scanner(System.in);
	 int accountId;
	 String accHolderName;
	 int password;
	 int balance;

//		super();
		
	

//	NewAccount A1 = new NewAccount();
//	public long getaccountId() {
//		return accountId;
//	}
//	public void setaccountId(int accountId) {
//		this.accountId = accountId;
//	}
//
//	public String getAccHolderName() {
//		return accHolderName;
//	}
//
	@Override
	public String toString() {
		return "NewAccount [accountId=" + accountId + ", accHolderName=" + accHolderName +"Password "+password+ ", balance=" + balance
				+ "]";
	}

	public NewAccount() {
//		super();
		this.accountId=(accountId);
		this.accHolderName = accHolderName;
		this.password = password;
		this.balance = balance;
		
	}

//	public void setAccHolderName(String accHolderName) {
//		this.accHolderName = accHolderName;
//	}
//
//	public int getBalance() {
//		return balance;
//	}
//
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	public void createAccount()
	{
		System.out.println("welcome the **** Bank");
		System.out.println("Please fill the following details to create account:");
		System.out.println("enter the account id:");
		accountId=sc.nextInt();
		System.out.println("enter the acc holder name:");
		accHolderName = sc.next();
		System.out.println("enter your password: ");
		password =sc.nextInt();
		System.out.println("enter the balance: ");
		balance =sc.nextInt();
//		printAccountDetails();
		System.out.println("Account is created: ");
		List<Object> bankList = Arrays.asList(accountId,accHolderName,password,balance);
		System.out.println("Details are: "+bankList);
		
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
		
		balance -= amount;
		
		return balance;
	}

	public void printAccountDetails() {
		System.out.println("user details are: ");
		System.out.println(accountId + " " + accHolderName + " " +balance);
	}

//	Scanner sc = new Scanner(System.in);

//private Object getaccountId;
	public void searchAccount() {
//		NewAccount n2 = new NewAccount();		
//		int accountId1=sc.nextInt();
		System.out.println("Please provide the Authentication: ");
		try {
			System.out.println("enter the account id:");
			int accountId1 = sc.nextInt();
			System.out.println("please provide your password: ");
			int password1 = sc.nextInt();
		if (accountId==accountId1 && password==password1) {
			System.out.println("Access is allowed: ");
			printAccountDetails();
		} else {
			System.out.println("not found: ");
		}
		  
//		  int password1 = sc.nextInt();
//		 if(password==password1)
//		 {
//			System.out.println("Access allowed:"); 
//		 }
		}
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
