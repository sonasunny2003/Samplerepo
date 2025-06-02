package inheritance;

public class InheTotSalaryChildA extends InheTotSalary
{
	double hra,pf;
	
	public void calculation()
	{
		hra=0.05*basicPay;
		pf=0.20*basicPay;
	}
}
