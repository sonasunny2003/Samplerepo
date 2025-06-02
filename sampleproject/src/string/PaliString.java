package string;

/*	Write a program to check whether the given strings are palindrome or not
•	Java
•	Malayalam
*/

public class PaliString
{
	
		public static void main(String[] args) 
		{		
			String s="Java";
			String s1="Malayalam"; 
			
			PaliString obj=new PaliString(); //instance nethod-so we need to create an obj to call the methods
			obj.pali(s);
			obj.pali(s1);
		}
		
		
		public void pali(String input)
		{
			String rev="";
			
			System.out.println("String : "+input);
			
			for(int i=input.length()-1;i>=0;i--)   ////using string class
			{
				rev=rev+input.charAt(i);
			}
			System.out.println("Reverse : "+rev);
			
			
			if(input.equalsIgnoreCase(rev))
			{
				System.out.println(input+" is a palindrome");
			}
			else
			{
				System.out.println(input+" is not a palindrome");
			}
		}

}
