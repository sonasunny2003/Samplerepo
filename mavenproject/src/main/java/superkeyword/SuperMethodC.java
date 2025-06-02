package superkeyword;

public class SuperMethodC extends SuperMethodP
{

	public static void main(String[] args)
	{
		SuperMethodC obj=new SuperMethodC();
		obj.name();
		//obj.print();
	}
	
	public void name()
	{
		super.print();
		System.out.println("My name is Anna");
	}

}
