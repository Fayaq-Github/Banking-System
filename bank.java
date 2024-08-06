package bankingsystem;

import java.util.Scanner;

public class bank 
{
	Scanner scan = new Scanner(System.in);
	public int accnumber;
	public String name;
	private double balance;
	private int pin;
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
			this.balance = balance;
	}
	public int getPin() 
	{
		return pin;
	}
	public void setPin(int pin) 
	{
		this.pin = pin;
	}
	// INITIAL DEPOSIT
	public void initDeposit()
	{
		System.out.println("ENTER THE AMOUNT TO BE DEPOSITED INTIALLY.");
		int init = scan.nextInt();
		if (init > 0)
		{
			setBalance(init);
			System.out.println("AMOUNT INTIALLY DEPOSIT SUCCESSFULLY.");
			service();
		}
		else
		{
			System.out.println("ENTER VALID AMOUNT.");
		}
		
	}
	// SERVICE METHOD.
	public void service()
	{
		System.out.println("SELECT SERVICES YOU WANT: \n1.Balance Enquiry\n2.Cash Deposit\n3.Cash Withdraw");
		int input = scan.nextInt();
		switch (input) {
		case 1: {
					enquiry();
					break;
		        }
		case 2: {
					deposit();
					break;
				}
		case 3: {
					withdraw();
					break;
				}
		}
	}
	// BALANCE ENQUIRY
	public void enquiry()
	{
		System.out.println("AVAILABLE BALANCE IS: \n\tRs." + getBalance());
		System.out.println("\tBACK");
		String input2 = scan.next().toLowerCase();
		switch (input2)
		{
		case "back":{
						service();
						break;
					}
		default:{
					System.out.println("ENTER BACK TO EXIT");
					break;
				}
		}
	}
	// DEPOSIT
	public void deposit()
	{
		System.out.println("ENTER THE AMOUNT TO BE DEPOSITED.");
		double input3 = scan.nextDouble();
		if (input3 > 0) 
		{
			balance += input3;
			System.out.println("AMOUNT DEPOSITED SUCCESSFULLY.");
			System.out.println("\tBACK");
			String input4 = scan.next().toLowerCase();
			switch (input4)
			{
			case "back":{
							service();
							break;
						}
			default:{
						System.out.println("ENTER BACK TO EXIT");
						break;
					}
			}
		}	
		else
		{
			System.out.println("PLEASE ENTER VALID AMOUNT.");
		}
		
	}
	// WITHDRAW
	public void withdraw()
	{
		System.out.println("ENTER AMOUNT: \n\tRS. ");
		int input5 = scan.nextInt();
		if (input5 > 0 && input5 < balance)
		{
			balance -= input5;
			System.out.println("AMOUNT WITHDRAWN SUCCESFULLY.");
			System.out.println("\tBACK");
			String input6 = scan.next().toLowerCase();
			switch (input6)
			{
			case "back":{
							service();
							break;
						}
			default:{
						System.out.println("ENTER BACK TO EXIT");
						break;
					}
			}
		}	
		else
		{
			System.out.println("PLEASE ENTER VALID AMOUNT.");
		}
	}
}
