package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class NewPracticeString {
	
	
	
	@Test
	
	public void reverseEachCharacterString()
	{
		String str="arshad";
		
	       char ch[] = str.toCharArray();
	       
	       for (int i = ch.length-1; i >=0; i--) {
	    	   
	    	   System.out.print(ch[i]);
		
		}
	}
	
	@Test
	
	public void reverseWordsInString()
	{
		String str="my name is deepika";
		
		String str1[]=str.split(" ");
		
		for (int i = str1.length-1; i>=0; i--) {
			
			System.out.println(str1[i]);
			
		}
			
	}
@Test
	
	public void reverseEachWordsInString()
	{
		String str="my name is deepika";
		
		String str1[]=str.split(" ");
		
	for (int i = 0; i < str1.length; i++) {
		
		String str2=str1[i];
		
		for (int j = str2.length()-1; j >=0; j--) {
			
			System.out.print(str2.charAt(j));
			
		}
		System.out.print(" ");	
	}
	
	}
	
	
	@Test
	
	public void checkGivenStringAnagram()
	{
		String str="race";
		String str1="care";
		
		
		if(str.length()!=str1.length())
		{
			System.out.println("given string is not anagram");
		}
	
		char array1[]=str.toCharArray();
		char array2[]=str.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2)==true)
		{
			System.out.println("the given string is anagaram");
		}
		
		else {
			System.out.println("it is not a anagram string");
		}
	}	
	
	
	@Test
	
	public void occurenceOfEachCharacter()
	{
		String str="arshad";
		
		char ch[]=str.toCharArray();
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			
			hs.add(ch[i]);
		}
		//System.out.println(hs);
		
		
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
	
	public void occurenceOfEachCharacterUsingMap()
	{
		String str="arshad";
		
		char ch[]=str.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for (int i = 0; i < ch.length; i++) {
			
			map.put(ch[i], i);
		}
		
		for(Entry<Character, Integer> m:map.entrySet())
		{
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				
				if(m.getKey()==ch[i])
				{
					count++;
				}
				
			}
			System.out.println(m.getKey()+" occured"+ " " +count);
		}
	}
	
	@Test
	
	public void occurenceOfEachWordINString()
	{
		String str="my name is my arshad";
		
		String str1[]=str.split(" ");
		
		HashSet<String> hs=new HashSet<>();
		
		for (int i = 0; i < str1.length; i++) {
			
			hs.add(str1[i]);
			
		}
		
		for(String m:hs)
		{
			int count=0;
			
			for (int i = 0; i < str1.length; i++) {
				
				if(m.equalsIgnoreCase(str1[i]))
				{
					count++;
				}
				
			}
			System.out.println(m+" occured"+" "+count);
		}
		
	}
		
		@Test
		
		public void occurenceOfEachWordUsingMap()
		{
			String str="my name is my arshad";
			
		String str1[]=str.split(" ");
			
			HashMap<String,Integer> map=new HashMap<>();
			
			for (int i = 0; i < str1.length; i++) {
				
				map.put(str1[i], i);
			}
			
		for(Entry<String, Integer> m:map.entrySet())
		{
			int count=0;
			
        for (int i = 0; i < str1.length; i++)
        {
				
		if(m.getKey().equalsIgnoreCase(str1[i]))
{
			count++;
	}
			}
        System.out.println(m.getKey()+" occurence"+ count);

				
			}
		}

		}

		
		
		