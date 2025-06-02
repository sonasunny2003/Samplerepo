package scanner;

public class TotSalary extends CalculateComponents
{
	double total;
	
	public void getTotal()
	{
		total=basicPay+hra-pf-deduction+bonus;
	}
	
	public void printSalary()
	{
		System.out.println("\n===== Salary Slip =====");
	    System.out.println("Basic Pay      : ₹" + basicPay);
	    System.out.println("HRA (5%)       : ₹" + hra);
	    System.out.println("PF (20%)       : ₹" + pf);
	    System.out.println("Deduction      : ₹" + deduction);
	    System.out.println("Bonus          : ₹" + bonus);
	    System.out.println("-----------------------------");
	    System.out.println("Net Salary     : ₹" + total);
	}
	
	public static void main(String[] args) 
	{
		TotSalary obj=new TotSalary();
		obj.getPayment();
		obj.calculation();
		obj.getTotal();
		obj.printSalary();

	}

}
