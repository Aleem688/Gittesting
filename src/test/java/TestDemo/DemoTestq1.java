package TestDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class DemoTestq1 {
	
	
	@Test
	
	public void reverseTheString()
	{
		String str="shamuu";
		//uumahs
		char ch[]=str.toCharArray();
		
		for (int i =  ch.length-1; i >=0; i--) {
			
			System.out.print(ch[i]);
			
		}
		
		System.out.println(" ");
	}

	@Test
	
	public void reverseWordInString()
	
	{
		String str="my name is arshad";
		
		//op-arshad is name my
		String str1[]=str.split(" ");
		for(int i=str1.length-1; i>=0; i--)
		{
			System.out.println(str1[i]);
		}
	}
	
	
	@Test
	
	public void reverseEachWordInString()
	{
		String str="my name is arshad";
		//ym eman si dahsra
		String str1[]=str.split(" ");
		
		for (int i = 0; i < str1.length; i++) {
			
		String str2	=str1[i];
		
		for (int j =  str2.length()-1; j >=0; j--) {
			
			System.out.print(str2.charAt(j));
			
		}
		System.out.print(" ");
			
		}
		
	}
	
	@Test
	public void  segriegateSpecialString()
	{
	String str="ar12s@$ad";
	
	/* arsad
	   12
	   @$
	   
	*/
	String alpha=" ";
	String beta=" ";
	String gamma=" ";
	
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
		
		else {
			gamma=gamma+ch;
		}
	}
	
	System.out.println(alpha+" "+beta+" "+gamma);
	
	}	
	
	
	
	@Test
	
	public void anagramString()
	{
		String str="care";
		String str1="race";
		if(str.length()>str1.length())
		{
		System.out.println("the given string is not a anagram");
	}
		
	char []array=str.toCharArray();
	char []array1=str.toCharArray();
	
	Arrays.sort(array);
	Arrays.sort(array1);
	
	if(Arrays.equals(array, array1)==true)
	{
		System.out.println("the given string is anagram");
	}
	
	else {
		System.out.println("it is not a anagram string");
	}
	
	}
	
	@Test
	
	public void removeDuplicateString()
	{
		String str="arshad";
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			
			hs.add(str.charAt(i));
			
	}
		System.out.print(hs);
	
		}
	
     @Test
     
     public void occurenceOfEachCharacter()
     {
    	 String str="abbbccddff";
    	 
    	 HashSet<Character> hs=new HashSet<Character>();
    	 
    	 for (int i = 0; i < str.length(); i++) {
			
    		 char ch=str.charAt(i);
    		 hs.add(ch);
		}
    	 
    	 for(Character m:hs)
    	 {
    		 int count=0;
    		 for (int j = 0; j < str.length(); j++) {
    			 
    			char chh =str.charAt(j);
    			//INT J=0; 
    			if(m==chh)
    			{
    				count++;
    			}
    			
			}
    		 System.out.println(m+"  occured"+ count);
    	 }
    	 
     }
     
     @Test
     
     public void occurenceUsingMap()
     {
    	 String str="abbbccddff";
    	 
    	 HashMap<Character, Integer> map=new HashMap<>();
    	 
    	 for (int i = 0; i < str.length(); i++) {
    		 
    		char ch= str.charAt(i);
    		
    		map.put(ch, i);
			
		}
    	 for(Entry<Character, Integer> m:map.entrySet())
    	 {
    		 
    		 int count=0;
    		 
    		 for (int j = 0; j < str.length(); j++) {
    			 
    			char ch =str.charAt(j);
    			
    			if(m.getKey().equals(ch))
    			{
    				count++;
    			}
				
			}
    		 
    		System.out.println(m.getKey()+"occurence"+count); 
    		 		 
    	 }
    	 	 
     }
         
     @Test
     
     public void addTheNumberInString()
     {
    	 String str="ar1sh2a3d";
    	 
    	 int sum=0;
    	 for (int i = 0; i < str.length(); i++) {
    		 
    		char ch =str.charAt(i);
    		
			if(ch>='0' && ch<='9')
			{
				int n=ch-48;
				sum=sum+n;
			}
			
		}
    	 System.out.println(sum);
     }
     
     @Test
     
     public void multiplyTheNumberInString()
     {
    	 String str="ar1sh2a3d";
    	 int mult=1;
    	 int x;
    	 for (int i = 0; i < str.length(); i++) {
    		 
    		 x =str.charAt(i)-'0';
    		 	
    		if(x>=0 && x<=9)
    		{
    			mult=mult*x;
    		}
    	 }
    		System.out.println(mult);
		
    	
     }
          
     @Test
     
     public void swapeTheGivenString()
     {
    	 String str="I am from TestYantra";
    	 
    	String str1[] =str.split(" ");
    	
    		String temp = str1[0];
    		
    		str1[0]=str1[str1.length-1];
    		
    		str1[str1.length-1]=temp;
    		
    		
		for (int i = 0; i < str1.length; i++) {
			
			System.out.println(str1[i]);
			
		}	
		
     }
     
     @Test
     
     public void addTheNumberInString11()
     {
    	 
     }
          }	

