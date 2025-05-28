package string;


public class StringClass
{

	public static void main(String[] args)
	{
		String s="java program";
		
		//length()
		System.out.println("Length : "+s.length());
		
		//charAt()
		System.out.println("Character at index : "+s.charAt(5));
		
		//valueOf()
		int num=123;
		String numString=String.valueOf(num);
		System.out.println("Value of number : "+numString);
		
		//equals()
		String s1="Java program";
		System.out.println("Is it equal :"+s1.equals(s));
		
		//equalsIgnoreCase()
		System.out.println("Is it equal : "+s1.equalsIgnoreCase(s));
		
		//isEmpty()
		String s2=" "; //space calculate
		System.out.println("Is empty : "+s2.isEmpty());
		
		//concat()
		System.out.println("Concat : "+s.concat(numString));
		
		//toUpperCase()
		System.out.println("Upper Case  "+s.toUpperCase());
		
		//toLowerCase()
		System.out.println("Lower Case : "+s1.toLowerCase());
		
		//contains()
		System.out.println("Contains the given sequence : "+s.contains(s1));
		System.out.println("Contains the given sequence : "+s.contains("hello"));
		
		//replace(char oldChar,char newChar)
		System.out.println("Replace : "+s.replace('a','o'));
		
	}
	
	//another program
	/*public static void main(String args[])
	{
		String s="Hello";
		
		System.out.println("Length : "+s.length());
		
		System.out.println("Character ath the index : "+s.charAt(3));
		
		float f=2.154f;
		String floatNum=String.valueOf(f);
		System.out.println("Value of number : "+floatNum);
		
		String s1="hello";
		System.out.println("Is it equal : "+s.equals(s1));
		
		System.out.println("Is it equal : "+s.equalsIgnoreCase(s1));
		
		System.out.println("Is empty : "+"".isEmpty());
		
		System.out.println("Concat : "+s.concat(s1));
		
		System.out.println("uppercase : "+s1.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.contains("llo"));
		
		System.out.println(s.replace('H', 'o'));
	}*/
	
}
