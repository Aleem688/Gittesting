package Test1;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class DemoTest2 {
	
	
	
	@Test
	
	public void verifyString()
	{
		String str1="Automation";
		String str2="Automation";
		String str3=new String("Automation");
		
		
		
		//String str2=new String("Automation");
		
		//System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str3));
	}
	
	
	@Test
	
	public void reverseEachWord()
	{
		String str="my name is arshad";
		
		   String str1[] =str.split(" ");
		   
		   for (int i = 0; i < str1.length; i++) {
			   
			String str2 = str1[i];
			
			for(int j=str2.length()-1; j>=0; j--)
			{
			System.out.print(str2.charAt(j));
				
					
				}
			System.out.print(" ");
			}
		   
			
		}
	
	@Test
	
	public void reverseWord()
	{
		String str="my name is arshad";	
		
	String str2[]=str.split(" ");
	
		for (int i =str2.length-1; i>=0; i--)
			//4-1=3      3>=0 true;
			//3-1=2   2>=0 true;
			
		{
			System.out.print(str2[i]);
		}
		System.out.println(" ");
			
		}	
	
	
	@Test
	
	public void verifSpecialString()
	{
		String str="ar24@$3sh5ad";
		
		String alpha="";
		String beta="";
		String gamma="";
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='z')
			{
				alpha=alpha+ch;
			}
			
			else if(ch>='0' && ch<='9')
			{
				beta=beta+ch;
				
			}
			else{
				gamma=gamma+ch;
				
			}
			
		}
		
		System.out.println(alpha+" ");
        System.out.println(beta+" ");
        System.out.println(gamma+" ");	
	}
	
	@Test
	
	public void sumOfDigitInString()
	{
		String str="ar23sh5ad";
		int sum=0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch=str.charAt(i);
			
			if(ch>='0' && ch<='9')
			{
				int n=ch-48;
				sum=sum+n;
			}
			
		}
		System.out.println(sum);
		
	}
	
	@Test
	
	public void countUpperAndLower()
	{
	int upper=0;
	
	int lower=0;
	
	String str="PrAtAbRaJ";
	
	for(int i=0; i<str.length(); i++)
	{
		char ch=str.charAt(i);
		
		if(ch>='A' &&  ch<='Z')
		{
		System.out.println(ch);
			upper++;
		}
		else 
			{
			System.out.println(ch);
				lower++;
			}
	}
	System.out.println(upper);
	System.out.println(lower);
	}
	
	@Test
	
	public void removeDuplicateFromArray()
	{
		int a[]= {1,2,3,3,4,5,6,2,5,9,5,};
		
		
		for (int i = 0; i < a.length; i++) {
			
			int count=0;
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					if(i>j)
					{
						break;
					}
					else {
						count++;
					}
				}
				
			}
			
			if(count>=1)
			{
				System.out.println(a[i]);
			}
			
		}
	}
	
	@Test
	
	public void reverseWord11()
	{
	String str="arshad";
	
	//String str1[]=str.split("");
	
	char[] ch=str.toCharArray();
	
	for(int i=str.length()-1; i>=0; i--)
	{
		System.out.println(ch[i]);
	}
	System.out.println(" ");

	}
	
	@Test
	
	public void checkTheGivenStringAnagram()
	{
		String str="care";
		String str1="rare";
		
		if(str.length()>str1.length())
		{
			System.out.println("the given string is not anagram");
		}
		
	char[]array1	=str.toCharArray();
	char[]array2	=str1.toCharArray();
	
	Arrays.sort(array1);
	Arrays.sort(array2);
	
	if(Arrays.equals(array1,array2)==true)
		
	{
		System.out.println("the given string is anagram");
	}
	else {
		System.out.println("it is not a anagram string");
	}
	}
	
	
	@Test
	
	public void reverseSWord()
	{
		String str="my name is arshad";
		
	String str1[]=str.split(" ");
	
	for(int i=str1.length-1; i>=0; i--)
	{
		System.out.println(str1[i]);
	}
	System.out.println(" ");
	}
		
	@Test
	
	public void reverseEachWordFromString()
	{
		String str="my name is arshad";
		
	String str1[]=str.split(" ");
	
	         for (int i = 0; i < str1.length; i++) {
	        	 
	        String str2	=str1[i];//0 //1
	        
	        for(int j=str2.length()-1; j>=0; j--)
	        {
	        	System.out.println(str2.charAt(j));
	        }
	        
	        System.out.println(" ");	
	        
			}
	}
	
	@Test
	
	public void occurenceOfEachDigit()
	{
		int n=132432345;
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		while(n>0)
		{
			int remainder=n%10;
			
			if(map.containsKey(remainder))
			{
				map.put(remainder, map.get(remainder)+1);
			}
			else {
				map.put(remainder, 1);
			}
			n=n/10;
			
		}
		System.out.println(map);
		
	}
			
}
	
	
	
	
	
	
	


