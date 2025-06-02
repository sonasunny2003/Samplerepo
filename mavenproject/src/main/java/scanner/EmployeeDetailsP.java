package scanner;

import java.util.Scanner;

public class EmployeeDetailsP 
{
	double basicPay,deduction,bonus;
	
	public void getPayment()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the basic pay : ");
		basicPay=sc.nextDouble();
		
		System.out.println("Enter the deducted amount : ");
		deduction=sc.nextDouble();
		
		System.out.println("Enter the bonus amount : ");
		bonus=sc.nextDouble();
	}
}
