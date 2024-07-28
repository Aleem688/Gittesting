package TestDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class StringPractice2 {
	
	
	@Test
	
	public void reverseCharInString()
	{
		
		String str="arshad";
		
	char ch[]	=str.toCharArray();
	
	for (int i = ch.length-1; i >=0 ; i--) {
		
		System.out.println(ch[i]);
		
	}
		
	}
	

	@Test
	
	public void reverseWordsInString()
	{
		
		String str="my name is arshad";
		
	         String str1[] = str.split(" ");
	
	for (int i = str1.length-1; i >=0 ; i--) {
		
		System.out.print(str1[i]+" ");
		
	}
		System.out.print("");
	}
	
@Test
	
	public void reverseEachWordsInString()
	{
		
		String str="my name is arshad";
		
	         String str1[] = str.split(" ");
	
	for (int i = 0; i < str1.length; i++) {
		
		String str2=str1[i];
		
		for (int j = str2.length()-1; j >=0 ; j--) {
			
			System.out.print(str2.charAt(j));
			
		}
		System.out.print(" ");
		
	}
	         
	}
	
	@Test
	
	public void printDuplicateCharacterInString()
	{
		String str="arshad";
		
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			
			for (int j = i+1; j < ch.length; j++) {
				
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
				
			}
			
		}
			
	}
	
	@Test
	
	public void removeDuplicateFromString()
	{
		String str="arshad";
		
		char ch[]=str.toCharArray();
		
		HashSet<Character> hs=new HashSet<>(); 
		
		for (int i = 0; i < ch.length; i++) {
			
			hs.add(ch[i]);
			
		}
		
		System.out.println(hs);
			
	}
	
	@Test
	
	public void occurenceOfEachCharacter()
	{
		String str="arshad";
		
		char ch[]=str.toCharArray();
		
      HashSet<Character> hs=new HashSet<>(); 
		
		for (int i = 0; i < ch.length; i++) {
			
			hs.add(ch[i]);
			
		}
		
		for(Character m:hs)
		{
			int count=0;
			
		for (int i = 0; i < ch.length; i++) {
			
			if(m==ch[i])
			{
				count++;
			}
			
		}
		
		System.out.println(m+"occured"+count);
		}
			
	}
	
	@Test
	
	public void occurenceOfEachWordInString()
	{
		String str="my name is arshad is";
		
		String str1[]=str.split(" ");
		
		HashSet<String> hs=new HashSet<>();
		
		for (int i = 0; i < str1.length; i++) {
			
			hs.add(str1[i]);
			
		}
		
		
		for(String m:hs)
		{
			int count=0;
			
			for (int j = 0; j < str1.length; j++) {
				
				if(m.equalsIgnoreCase(str1[j]))
				{
					
				}
				
			}
		}
			
	}
	
	@Test
	
	public void occurenceOfEachcharUsingMap()
	{
         String str="arshad";
		
		char ch[]=str.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		
		for (int i = 0; i < ch.length; i++) {
			
			map.put(ch[i], i);
			
		}
		
		for(Entry<Character, Integer> m:map.entrySet())
		{
			int count=0;
			
			for (int j = 0; j < ch.length; j++) {
				
				if(m.getKey()==ch[j])
				{
					count++;
				}
				
			}
			System.out.println(m.getKey()+"occured"+count);
		}
		
	}
	
	
	
	
	
	
	@Test
	
	public void occurenceOfEachWordUsingMap()
	{
        String str="my name is arshad is";
		
		String str1[]=str.split(" ");
		
		HashMap<String, Integer> map=new HashMap<>();
		
		for (int i = 0; i < str1.length; i++) {
			
			map.put(str1[i], i);
			
		}
		for(Entry<String, Integer> m:map.entrySet())
		{
			int count=0;
			for (int i = 0; i < str1.length; i++) {
				
			if(m.getKey().equalsIgnoreCase(str1[i]))
			{
				count++;
			}
		}
			
			System.out.println(m.getKey()+"occured"+count);
	}
	
}
	@Test
	
	public void checkGivenStringAnagram()
	{
		String str="care";
		String str1="race";
		
		
		if(str.length()!=str1.length())
		{
			System.out.println("given string is not a anagram");
		}
		
		
		char []array1=str.toCharArray();
		char []array2=str.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
	
	
	if(Arrays.equals(array1, array2)==true)
	{
		System.out.println("given string is anagram");
	}
	
	else {
		System.out.println("it is not a anagram");
	}
	}
	
	@Test
	
	public void SwapeTheGivenString()
	{
		String str="my name is arshad";
		
		String str2[]=str.split(" ");
		String temp;
		
		temp=str2[0];
		
		str2[0]=str2[str2.length-1];
		
		str2[str2.length-1]=temp;
		
		for (int i = 0; i < str2.length; i++) {
			
			System.out.println(str2[i]);
			
		}
	}
	
	
	@Test
	
	public void sortArrayInAscendingOrder()
	{
		int a[]= {3,5,6,4,7,8};
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
					
			}
			System.out.println(a[i]);
			
		}
	}
	
	
	@Test
	
	public void maxNumberINArray()
	{
		int a[]= {3,5,6,4,7,8};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		
		
		
	}
	
	@Test
	
	public void addTheNumberInString()
	{
		String str="ar2sh4ad";
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
	
	
	
	
	
		
}
