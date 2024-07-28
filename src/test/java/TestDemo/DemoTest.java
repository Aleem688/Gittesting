package TestDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	
	public void occurenceOfCharacter()
	
	{
		String str="abbccdduyy";
		
		HashSet<Character> hs=new HashSet<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			hs.add(ch);
		}
		//System.out.println(hs);
		
		for(Character m:hs)
			
		{
			int count=0;
			
			for (int j = 0; j < str.length(); j++) {
				
				if(m==str.charAt(j))
				{
					count++;
				}
				
			}
			System.out.println(m+"occurence"+count);
		}
	}
	
	@Test
	
	public void occurenceUsingMap()
	{
		String str="abbccdduyy";
		
	char ch[]=str.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0; i<ch.length; i++)
		{
			//char ch=str.charAt(i);
			map.put(ch[i], i);
		}
		//System.out.println(map);
		
		for(Entry<Character, Integer> m:map.entrySet())
		{
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if(m.getKey()==ch[i])
				{
					count++;
				}
				
			}
			System.out.println(m.getKey()+"occured"+count);
			
		}
	}
	
	@Test
	
	public void reverseEachWord()
	{
		String str="I am from TestYantra";
		
		String s[]=str.split(" ");
		
//		for (int i = 0; i < s.length; i++) {
//			
//			String su=s[i];
//			
//			for(int j=su.length()-1; j>=0; j--)
//			{
//				char ch=su.charAt(j);
//				
//				System.out.print(ch+" ");
//			}
//			//System.out.println(ch);
//			
//		}
		
		for(int j=s.length-1; j>=0; j--)
		{
			System.out.println(s[j]);
		}
		
		
	}
	
	@Test
	
	public void checkGivenStringAnagram()
	{
		String str="racehgf";
		String str1="care";
		
		if(str.length()!=str1.length())
		{
			System.out.println("it is not a anagram string");
		}
		
		char[] array1 = str.toCharArray();
		char[] array2 = str1.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2)==true)
		{
			System.out.println("it is a anagram string");
		}
		else {
			System.out.println("it is not aa anagram string");
		}
	}
	
	@Test
	
	public void reverseWord()
	{
		String str="arshad";
		char[]ch=str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			
			System.out.println(ch[i]);
			
		}
	}
		
	@Test
	
	public void arrayInAscendingOrder()
	{
		int a[]= {12,5,43,23,11,3};
		
		//int max=a[0];
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
	
	public void maxNumberInArray()
	{
		int a[]= {12,23,11,56,22};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
			max=a[i];
			
			}
			
		}
		System.out.println(max);
	}
	
	@Test
	public void minNumberInArray()
	{
        int a[]= {12,23,11,56,22};
		
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<min)
			{
				
			min=a[i];
			
			}
			
		}
		System.out.println(min);
	}
		
	@Test
	
	public void append0sAtLast()
	{
		int a[]= {2,3,4,0,0,5,6};
		
		int m=0;
		int n=a.length-1;
		
		int b[]=new int[a.length];
		
		for (int i = 0; i < b.length; i++) {
			
			if(a[i]==0)
			{
				b[m]=a[i];
				m++;
			}
			else {
			b[n]=a[i];
			n--;
			}
			
		}
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
			
		}
			
	}
		
}
