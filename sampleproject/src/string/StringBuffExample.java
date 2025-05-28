package string;

public class StringBuffExample 
{

	public static void main(String[] args)
	{
StringBuffer buff=new StringBuffer("Hello"); //string declare+initialize(creating a StringBuffer object)
		
		//append(String s) - join 2 strings
		
		buff.append(" World");
		System.out.println("Append : "+buff);
		
		//insert(int offset,String s)
		
		buff.insert(6,"hai ");
		System.out.println("Insert a word : "+buff);
		
		//replace(int startIndex,int endIndex)
		
		buff.replace(6, 9, "super");
		System.out.println("Replace : "+buff);
		
		//delete(int startIndex,int endIndex)
		
		buff.delete(0, 5);
		System.out.println("Delete : "+buff);
		
		//reverse()
		
		buff.reverse();
		System.out.println("Reverse : "+buff);
		
		//capacity()
		
		//buff.capacity();
		System.out.println("Capacity : "+buff.capacity()); // how much space is allocated internally
		
		//length()
		System.out.println("Length : "+buff.length());//string length
		
		
		
		/*StringBuffer buf=new StringBuffer("Sona");
		
		buf.append(" cute");
		System.out.println(buf);
		
		buf.insert(5, "is ");
		System.out.println(buf);
		
		buf.replace(8, 12, "gorgeous");
		System.out.println(buf);
		
		buf.delete(5, 7);
		System.out.println(buf);
		
		buf.reverse();
		System.out.println(buf);
		
		buf.length();
		System.out.println(buf.length());
		
		System.out.println(buf.capacity());
		
		
		System.out.println(buf.substring(10));
		
		System.out.println(buf.substring(0, 8));*/
	
	
		
		
	}

}
