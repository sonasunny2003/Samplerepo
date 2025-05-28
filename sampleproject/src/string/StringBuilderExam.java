package string;



public class StringBuilderExam 
{

	public static void main(String[] args)
	{
		StringBuilder build=new StringBuilder("Hello");
		
		//append(String s)
		build.append(" Hai");
		System.out.println("Append : "+build);
		
		//insert(int offset,String s)
		build.insert(5, " Anna");
		System.out.println("Insert : "+build);
		
		//replace(int startIndex,int endIndex,String s)
		build.replace(6,10 , "Meenu");
		System.out.println("Replace : "+build);
		
		//delete(inst startIndex,int endIndex)
		build.delete(6, 11);
		System.out.println("Delete : "+build);
		
		//charAt(int index)
	
		System.out.println("Character at the index : "+build.charAt(4));
		
		//legth()
		System.out.println("Length : "+build.length());
		
		//capacity()
		System.out.println("Capacity : "+build.capacity());
		
		//substring(int beginIndex)
		System.out.println("Substring starting from the given index : "+build.substring(7));
		
		//substring(int beginIndex,int endIndex)
		
		System.out.println("Substring between the given indexes : "+build.substring(0, 5));
		
		//reverse()
		System.out.println("Reverse : "+build.reverse());
		
		//deleteCharAt(int index)
		System.out.println("Delete the character from the specified index : "+build.deleteCharAt(2));


	}

}
