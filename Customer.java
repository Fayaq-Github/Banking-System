package bankingsystem;

import java.util.Scanner;

public class Customer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		bank b = new bank();
		System.out.println("WELCOME TO DARUSSALAM BANK !");
		System.out.println("HOW CAN I HELP YOU ? ");
		System.out.println("ARE YOU A NEW USER ?\n1.YES \n2.NO");
		int a = sc.nextInt();
		if (a == 1)
		{
			System.out.println("ENTER ACCOUNT NUMBER.");
			
			System.out.println("ENTER PASSWORD.");
			b.initDeposit();
		}
		else
		{
			System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER.");
			b.accnumber = sc.nextInt();
			System.out.println("PLEASE ENTER PIN.");
			b.setPin(sc.nextInt());
			if (b.accnumber == 1234 && b.getPin() == 7893) 
			{
				b.service();
			}
			else
			{
				System.out.println("WRONG PIN.\nENTER VALID PIN.");
			}
		}
		sc.close();
	}
}
