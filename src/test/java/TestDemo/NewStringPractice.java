package TestDemo;

import org.testng.annotations.Test;

public class NewStringPractice {
	
	
	
	@Test
	
	public void reverseCharacterString()
	{
		
	String str="arshad"	;
	
	char ch[]=str.toCharArray();
	
	for (int i = ch.length-1; i>=0 ; i--) {
		
		System.out.print(ch[i]);
		
	}
	
	}
	
	@Test
	
	public void reverseString()
	{
		String str="my name is arshad";
		
	String str1[]	=str.split(" ");
	
	for (int i = str1.length-1; i >=0 ; i--) {
		
		System.out.print(str1[i]+" ");
		
	}
	System.out.print(" ");
	
	}
	
	
	
	@Test
	
	public void reverseEachWordINString()
	{
		String str="my name is arshad";
		
		String str1[]	=str.split(" ");
		
		for (int i = 0; i < str1.length; i++) {
			
			String str2=str1[i];
			
			for (int j = str2.length()-1; j >=0 ; j--) {
				
				
				System.out.print(str2.charAt(j));
				
			}
			System.out.print(" ");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
