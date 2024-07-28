package PracticeDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class DemoTest2 {

	@Test

	public void reverseString() {
		String str = "arshad";

		char ch[] = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			System.out.println(ch[i]);
			// d,a,h,s,r,a
		}

	}

	@Test

	public void reverseWordInString() {
		String str = "my name is arshad";

		String str1[] = str.split(" ");

		for (int i = str1.length - 1; i >= 0; i--) {
			// 4-1=3 true 3-1=2 true 2-1=1 true 1-1=0

			System.out.print(str1[i] + " ");
			// arshad, is, name, my

		}
	}

	@Test

	public void reverseEachWordInString() {
		String str = "my name is arshad";

		String str1[] = str.split(" ");

		for (int i = 0; i < str1.length; i++) {

			String str2 = str1[i];// 0
			// my //2-1=1,1-1=0

			for (int j = str2.length() - 1; j >= 0; j--) {
				System.out.print(str2.charAt(j));// ym
			}
			System.out.print(" ");
		}

	}

	@Test

	public void printDuplicateInString() {
		String str = "arshad";

		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					System.out.println(ch[i]);
				}

			}

		}
	}

	@Test

	public void printVowelsInString() {
		String str = "arshad";
		int count = 0;
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
				System.out.println(ch[i]);

			}
			// System.out.println(count);
		}

	}

	@Test

	public void printConsonantsInString() {
		String str = "arshad";
		int count = 0;
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'))

			{
				count++;
				System.out.println(ch[i]);

			}
			// System.out.println(count);
		}
	}

	@Test

	public void removeDuplicateFromString() {
		String str = "arshad";
		// arshdyub
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			// char ch=str.charAt(i);
			int count = 0;

			for (int j = 0; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					// a==a, a==r,a==s,a==h,a==a,a==d
					// r==a, r==r,r==s, r==h r==a r==d
					if (i > j) {
						break;

					} else {
						count++;
						// count 2
						// count 1
					}
				}

			}

			if (count >= 1)

				System.out.println(ch[i]);

		}
	}

	@Test

	public void swapeString() {

		String str = "my name is arshad";

		String temp = " ";

		String str1[] = str.split(" ");

		temp = str1[0];

		str1[0] = str1[str1.length - 1];

		str1[str1.length - 1] = temp;

		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);

		}
	}

	@Test

	public void checkStringAnagram() {
		String str = "care";
		String str1 = "race";

		if (str.length() != str1.length()) {
			System.out.println("the given string is not a anagram");
		}

		else {

			char array1[] = str.toCharArray();
			char array2[] = str1.toCharArray();

			Arrays.sort(array1);

			Arrays.sort(array2);

			if (Arrays.equals(array1, array2) == true) 
			{
				System.out.println("the given string is anagram");

			} 
			else
			{
				System.out.println("the given string is not a anagram");
			}

		}

	}
	
	@Test
	
	public void seggregateString()
	{
		String str="ar12shad";
		
		String alpha="";
		String beta="";
		String gamma="";
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z')
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
		System.out.println("alphaphet in string"+alpha+"numbers in a string"+beta+"special character in string"+gamma);
		
		}
	
	
	@Test
	public void addNumbersInString()
	{
		String str="arsh123ad";
		
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
	
	public void multiplyTheString()
	{
		String str="ars45ad";
		
		int mult=1;
		
		for (int i = 0; i < str.length(); i++) {
			
			int x=str.charAt(i)-'0';
			if(x>=0 && x<=9)
			{
				mult =mult*x;
			}
			
			
		}
		System.out.println(mult);
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
			int count =0;
			
			for (int j = 0; j < ch.length; j++) {
				
				if(m==ch[j])
				{
					count++;
				}
				
			
				
			}
			System.out.println(m+"occurence"+count);
		}	
	}
	
	@Test
	
	public void occurenceOfCharacterUsingMap()
	{
		String str="arshad";
		
		char ch[]=str.toCharArray();
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		
		
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
			
			System.out.println(m.getKey()+"occurence"+count);
			
		}	
	}
	
	@Test
	
	public void occurenceOfEachWord()
	{
		String str="my name arshad is arshad";
		
		String str1[]=str.split(" ");
		
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		
		for (int i = 0; i < str1.length; i++) {
			
			hs.add(str1[i]);
			
		}
		for(String m:hs)
		{
			int count=0;
			
			for (int j = 0; j < str1.length; j++) {
				
				if(m.equalsIgnoreCase(str1[j]))
				{
					count++;
				}
			}
			
			System.out.println(m+"occurence"+count);
		}	
	}
	
	@Test
	
	public void occurenceOfEachWordUsingMap()
	{
        String str="my name arshad is arshad";
		
		String str1[]=str.split(" ");
		
		LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
		
		for (int i = 0; i < str1.length; i++) {
			
			map.put(str1[i], i);
			
		}
		
		for(Entry<String, Integer> m:map.entrySet())
		{
			int count=0;
			
			for (int j = 0; j < str1.length; j++) {
				
				if(m.getKey().equalsIgnoreCase(str1[j]))
				{
					count++;
				}
				
			}
			
			System.out.println(m.getKey()+"occurence"+count);
		}
	}
	
	
	@Test
	
	public void checkTheGivenStringIsAnagram()
	{
		String str="care";
		String str1="ract";
		
		
		if(str.length()!=str1.length())
		{
			System.out.println("the given string is not  anagram");
		}
		
		else {
			
			char array[]=str.toCharArray();
			char array1[]=str1.toCharArray();
			
			Arrays.sort(array);
			Arrays.sort(array1);
			
			if(Arrays.equals(array, array1)==true)
			{
				System.out.println("the given string is anagarm");
			}
			else {
				System.out.println("the given string is not a anagram");
			}
		}
	}
	
	
}
	
