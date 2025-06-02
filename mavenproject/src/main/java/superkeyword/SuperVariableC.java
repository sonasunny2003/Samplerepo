package superkeyword;

public class SuperVariableC extends SuperVariableP
{
	String name="Nina"; //instance variable
	
	public static void main(String[] args) 
	{
		SuperVariableC obj=new SuperVariableC();
		obj.print();

	}
	
	public void print()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+super.a);  //bcz a is in parent class.so super keyword
	}

}
