package aggregation;

public class StudentC //classA
{
	String name;
	int id;
	AddressP address; //classB obj;(has-a)
	
	StudentC(String name,int id,AddressP address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Address : "+address.city+","+address.state);
	}
	
	
	public static void main(String[] args) 
	{
		AddressP obj=new AddressP("Erna","Kerala");

		StudentC obj1=new StudentC("Anna",22,obj);
		obj1.display();
	}
	
}
