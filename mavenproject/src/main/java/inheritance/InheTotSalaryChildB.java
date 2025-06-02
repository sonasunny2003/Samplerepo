package inheritance;

public class InheTotSalaryChildB extends InheTotSalaryChildA
{
	double totsalary;
	
	public static void main(String[] args) 
	{
		InheTotSalaryChildB obj=new InheTotSalaryChildB();
		obj.getSalary();
		obj.printsalary();
	}
	
	public void getSalary()
	{
		calculation(); 
		totsalary=basicPay+hra-pf-deduction+bonus;
		
	}
	
	public void printsalary()
	{
		 System.out.println("\n===== Salary Slip =====");
	     System.out.println("Basic Pay      : ₹" + basicPay);
	     System.out.println("HRA (5%)       : ₹" + hra);
	     System.out.println("PF (20%)       : ₹" + pf);
	     System.out.println("Deduction      : ₹" + deduction);
	     System.out.println("Bonus          : ₹" + bonus);
	     System.out.println("-----------------------------");
	     System.out.println("Net Salary     : ₹" + totsalary);
	}

}
