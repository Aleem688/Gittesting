package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class StringClassTest {
	

	@Test
	public void reverseString()
	{
		//1
//		String str="Gulbarga";
//		String rev="";
//		for(int i=str.length()-1; i>=0; i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
		
		//2
		
		String s="Gulbarga";
	char[] str = s.toCharArray();
	for(int i=str.length-1; i>=0; i--)
	{
		System.out.print(str[i]+" ");
	}
	
	
		//3
	
//		String str="Gulbarga";
//		for(int i=str.length()-1; i>=0; i--)
//		{
//		System.out.println(str.charAt(i));	
//		}

	
	//4
		//StringBuffer s=new StringBuffer("Gulbarga");
	}	//System.out.println(s);
	
	
	@Test
	public void occuranceOfEachCharecter()
	{
		String s = "testyantra";

		char ch[]=s.toCharArray();
		HashSet<Character>hs=new HashSet<>();
		
		for(int i=0; i<ch.length; i++)
		{
			hs.add(ch[i]);
		}
		System.out.println(hs);
		//int count=0;
		for(char m:hs)
		{
			int count=0;
			for(int j=0; j<ch.length; j++)
			{
				if(m==ch[j])
				{
					count++;
					
				}
			}
			System.out.println(m+"     Occurence    "+count);
		
		}
	}
	@Test
	public void occuranceOfEachCharecterUsingMap()
	{
		String st = "Testyantra";
		String s=st.toLowerCase();

		char ch[]=s.toCharArray();
		HashMap <Character,Integer> map=new HashMap<>();
		
		for(int i=0; i<ch.length; i++)
		{
			map.put(ch[i], i);
		}
		
			for(Entry<Character, Integer> m:map.entrySet())
			{
				int count =0;
			
				for(int i=0; i<ch.length; i++)
				{
					if(m.getKey()==ch[i])
					{
						count++;
					}
				}
				System.out.println(m.getKey()+"  occurence"+count);
		
		}
	}
	
	
	
	@Test
	
	
	public void removeDuplicateFromStringTest()
	
	{
		String str="TestYantra";
		
		System.out.println("the given string is:"+str);
		System.out.println("the string after removing duplicate id:"+removeDuplicate(str));
		
	}
   public String removeDuplicate(String sv) {
		// TODO Auto-generated method stub
		char[] ch=sv.toCharArray();
		String ne="";
		
		for(char value:ch)
		{
			if(ne.indexOf(value)==-1)
			{
				ne=ne+value;
			}
		
	}
	return ne;
	}
   
   @Test
   public void removeDuplicateFromString2()
   {
	   String str="TestYantra";
	  String s =str.toLowerCase();
	char[]ch = s.toCharArray();
	String ne="";
	for(int i=0; i<ch.length; i++)
	{
		if(ch[i]!=' ')
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
				}
			}
			ne=ne+ch[i];
		}
	}
	
	System.out.println(ne);
	
	
   }
   
   
   
   
   
   
   
   
   
   
	@Test
	public void countNumberOfDuplicate()
	{
		String str="TestYantra";
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			int count=1;
			if(ch[i]!=' ')
			{
				for(int j=i+1; j<ch.length; j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]=' ';
					}
				}
				if(count>=2)
				{
					System.out.println(ch[i]+" "+count);
				}
			}
		}
		
		
	}
	
	@Test
	public void PositionOfEachCharacter()
	{
		String str="TestYantra";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			System.out.println(ch+"and its position" +i);
		}
	}
	@Test
	
	public void occuranceOfEachWords()
	{
		String s = "I am from am from TestYantra";
		String [] str=s.split(" ");
		LinkedHashSet<String>hs=new LinkedHashSet<>();
		
		for(int i=0; i<str.length; i++)
		{
			hs.add(str[i]);
		}
		System.out.println(hs);
		//int count=0;
		for(String m:hs)
		{
			int count=0;
			
			for(int j=0; j<str.length; j++)
			{
				if(m.equalsIgnoreCase(str[j]))
				{
					count++;
					
				}
			}
			System.out.println(m+"     Occurence    "+count);
		
		}
	}
	@Test
	public void findOccurenceOfEachWordInAStringUsingMap()
	{
		String str="I am from am i TestYantra";
		String s=str.toLowerCase();
		
		String [] st=s.split(" ");
		
		HashMap<String, Integer> map=new HashMap<>();
		for(int i=0; i<st.length; i++)
		{
			map.put(st[i], i);
		}
		for(Entry<String, Integer> in:map.entrySet())	
		{
			int count=0;
			for(int j=0; j<st.length; j++)
			{
				if(in.getKey().equalsIgnoreCase(st[j]))
				{
					count++;
				}
			}
			System.out.println(in.getKey()+"  Occurence"+count+ "times");
		}
			
	}
	
	@Test
	public void positionOfEachWord()
	{
		String str="I am from am from TestYantra";
		String[] s=str.split(" ");
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i] +"and its position" +i);
		}
	}
	
	@Test
	
	public void stringPallindrome()
	{
		String str="malayalam";
		String rev="";
		for(int i=str.length()-1; i>=0; i--)//malayalam
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("it is a pallindrome string");
		}
		else {
			System.out.println("it is not a pallindrome string");
		}
	
	}
	
	@Test
	
	public void printPositionOfEachCharacterInReverse()
	
	{
		String str="Tester";
		String s = str.toLowerCase();
		
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i)+"    and its position"+((s.length()-1)-i));
		}
		
		
	}
	//1st method
	@Test
	public void reverseAGivenString()
	{
		String str="I am from TestYantra";
		String rev=" ";
		String s[]=str.split(" ");
		for(int i=0; i<s.length; i++)
		{
			rev=s[i]+"  "+rev;
		}
		System.out.println(rev);
	}
	
	//2nd method important
       @Test
	public void reverseAGivenString2()
	{
		String str="I am from TestYantra";
	
		String s[]=str.split(" ");
		
		for(int i=s.length-1; i>=0; i--)
		{
			System.out.print(s[i]+" ");
	}
	
	
	
	}
	@Test
	public void reverseTheWordsInAString()
	{
		String str="I am from TestYantra";
		
		String s[]=str.split(" ");
		
		for(int i=0; i<s.length; i++)
		{
		String s1=s[i];
		
			for(int j=s1.length()-1; j>=0; j--)
			{
				
				System.out.print(s1.charAt(j));
				
			}
			System.out.print(" ");
		}
	}
	
	@Test
	public void swap1stAndLastWordInAString()
	
	{
		String st="I am from TestYantra";
		String[] su=st.split("");
		String temp= su[0];
		
		su[0]=su[su.length-1];
		
		su[su.length-1]=temp;
		
		for(int i=0; i<su.length; i++)
		{
			System.out.println(su[i]+" ");
		}
	}
	
	@Test
	public void countNoOfVowelsInAStringwithDuplicate()
	{
		String s="India";
		String st=s.toLowerCase();
		//String[] su=st.split(" ");
		int count=0;
		for(int i=0; i<st.length(); i++)
		{
			
		char ch=st.charAt(i);
		
		if(ch=='a'||ch=='e'|| ch=='i' ||ch=='o'||ch=='u')
		{
			System.out.println(ch);
			count++;
		}
	
	//System.out.println(count);
	
	}
	System.out.println("vowels occured"+count+"times");
	
	
	}
	
	@Test
	public void countNoOfVowelsInAStringwithoutDuplicate()
	{
		
		String s="India";
		int count=0;
		String st=s.toLowerCase();
		//String[] su=st.split(" ");
		//int count=0;
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0; i<st.length(); i++)
		{
			hs.add(st.charAt(i));
			
		}
	
		for(Character m:hs)
		{
			//int count=0;
			
			if(m=='a'||m=='e'|| m=='i' ||m=='o'||m=='u')
				
			{
				System.out.println(m);
				count++;
				
			}
		}
		
		System.out.println(count);
	
	
	}
	
	@Test
	
	public void segregateAlphabetsNumberAndSpecialCharactersFromGivenString()
	{
		String str="a1b2%c@3";
		char ch;
		String alpha="";
		String number="";
		String special="";
		for(int i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			if(ch>='A' && ch<='z')//A=67 Z=90 a=97 z=122
			{
				alpha=alpha+ch;
				//System.out.println(ch+" ");
			}
			
			else if(ch>='0' && ch<='9')
			{
				number=number+ch;
				//System.out.println(ch);
			}
			 
			 
			 
			else {
				special=special+ch;
				//System.out.println(ch);
			}
			
		}
		System.out.println(alpha+" ");
		System.out.println(number+" ");
		System.out.println(special+" ");
		
	}
	
	
	
	
	//@Test
//	public void upperCaseAndLower()
//	{
//		String str="AthAr";
//		String sma="";String bga="";
//		char ui,uii;
//		String ss;
//		String sss;
//		char []ch=str.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]>='A' && ch[i]<='Z')
//			{ ui = Character.toLowerCase(ch[i]);
//				ss=ui;
//			}
//			else {
//				 uii = Character.toUpperCase(ch[i]);
//				
//				}
//			 sma=ui+uii;
//			}
//		}
//	System.out.println(sma);
//		
//		char ch;
//		for(int i=0; i<str.length(); i++)
//			
//		{
//			ch=str.charAt(i);
//			if(Character.isUpperCase(ch))
//			{
//				System.out.println(ch);
//			}
//		}
	
	
	
	
	@Test
	public void  sumOfNumberInString()
	{
		String str="1he2m4";
		char ch;
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int n=ch-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	
}
	@Test
	public void  sumOfNumberInString2()
	{
		String str="1he2m4";
		//char ch;
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
	    if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
	
		}
		
		System.out.println(sum);
		
	}
	@Test
	
	public void SumOfTwoDigit()
	{
		String str="12a11b3";//12+11+3=26
				int sum=0;// 0 12 23
				int tsum=0;//0 1 12 0 1 11 0 3
		for(int i=0; i<str.length(); i++)
		{
			//i=0 0<7t
			//i=1 1<7t
			//i=2 2<7t
			//i=3 3<7t
			//i=4 4<7t
			//i=5 5<7t
			//i=6 6<7t
			//i=7 7<7f terminated
			char ch=str.charAt(i);
			
	   if(ch>='0'&& ch<='9')// 1t 2t af 1t 1t bf 3t
	   {
		   int n=ch-48;//n=49-48=1 50-48=2 49-48=1 49-48=1 51-48=3
		   tsum=tsum*10+n;//tsum=0*10+1=1, 1*10+2=12, 0*10+1=1, 1*10+1=11, 0*10+3=3
	   }
	   
	   else {
		   sum=sum+tsum;
		   tsum=0;//0 0
	   }
	}
	sum=sum+tsum;//23+3=26
	System.out.println(sum);//26
	
	
	}
	
	@Test
	public void printMinLengthValuesInAString()
	{
		
		String[] s= {"12","1234","12345","45","1434234"};//12 45
		int size = s.length;
		System.out.println(size);
		
		String min=s[0];
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()<min.length())
{
	min=s[i];
}
			
		}
		//System.out.println(min_length);
for(int i=0; i<s.length; i++)
{
	if(s[i].length()==min.length())
	{
		System.out.println(s[i]+" ");
	}
}
	}

		
	@Test
	public void printMaximumLengthValuesInAString()
	{
		String[]s= {"ab","qbcd","myfvb","bv","jhvjhvjv"};
		String max=s[0];
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()>max.length())
{
	               max=s[i];
}
		}
for(int i=0; i<s.length; i++)
{
	if(s[i].length()==max.length())
	{
		System.out.println(s[i]+" ");
	}
		
	//System.out.println(max_length);	
		
		
		
}
		
	}	
		
		@Test
		public void reverseStringWord()
		{
			String str="I am From TestYantra";
			String []su=str.split(" ");
			
			for(int i=0; i<su.length; i++)
			{
				String st=su[i];
				for(int j=st.length()-1 ;j>=0; j--)
				{
					System.out.print(st.charAt(j));
				}
				System.out.println();
			}
		}
		
		@Test
		public void countUpperAndLower()
		{
		int upper=0;
		int lower=0;
		String str="PrAtAbRaJz";
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z')
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
		
		
//		for(int j=0; j<str.length(); j++)
//		{
//			char ch=str.charAt(j);
//			if(Character.isLowerCase(ch))
//			{
//				System.out.println(ch);
//				lower++;
//			}
//		}
		System.out.println("UPPERCASE "+upper);
		System.out.println("LOWERCASE "+lower);		

		}
		
		
		@Test
		public void revWordInString() {
//			String s1="i am from tamilnadu";
//			String s2="";
//			String[] s3 = s1.split(" ");
//			
//			for(String s4:s3) {
//				String s5="";
//				 for(int i=s4.length()-1; i>=0; i--) {
//					 char ch=s4.charAt(i);
//					 s5=s5+ch;
//				 }
//				 s2=s2+s5+" ";
//			}
//			System.out.println(s2);
			String s="my name is khan";
		    String[] s1=s.split(" ");
		    String f="";
		    for(String g:s1)
		    {
		    char ch=Character.toUpperCase(g.charAt(0));
		    String d=g.substring(1);
		    f+=ch+d;
		    
			 }
		    System.out.println(f);
		}
			
			@Test
			
			public void addToString()
			{
				
			String str="abcde";
			
			char []ch=str.toCharArray();
			
			String str1="1234";
			
			char[] ch1=str1.toCharArray();
			
			int i=0;
			int j=0;
			try {
			while(i<=ch.length && j<=ch1.length)
			{
				i++;
				j++;
				System.out.print(ch[i-1]+" "+ch1[j-1]);
			}
				
			while(i<=ch.length)
			{
				i++;
				System.out.print(ch[i]);
			}
			while(j<=ch.length)
			{
				j++;
				System.out.print(ch[j]);
			}
			}
			catch(Exception e)
			{
				System.out.println("");
			}
			
			
			}
			
			@Test
			public void evenOddArray()
			{
				
			int a[]= {1,2,50,55,90,100};
			ArrayList<Integer>al=new ArrayList<Integer>();
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i]%2==0)
				{
					
					al.add(a[i]);
				
				}
				
			}
			System.out.println(al);
			
			
			System.out.println();
			
			ArrayList<Integer>al2=new ArrayList<Integer>();
			for(int j=0; j<a.length; j++)
		{
			if(a[j]%2==1)
			{
				al2.add(a[j]);
				
				}					
			}
			
			System.out.println(al2);
	
	
			}	
		
		@Test
		
		public void arrayAscending()
		{
			int a[]= {1,2,50,55,90,100};
			
			for(int i=1; i<a.length; i++)
			{
//				for(int j=i+1; j<a.length; j++)
//				{
				if(a[i]<a[i+1])
				{
					
		}
			
		}
		}	
		@Test
		
		public void missingArray()
		{
			int a[]= {1,3,4,6,7,8,9};
			
			ArrayList<Integer> ar=new ArrayList<Integer>();
			
			for(int i=0; i<a.length; i++)
			{
				ar.add(a[i]);
			}
			
			for(int i=1; i<=10; i++)
			{
				if(!ar.contains(i))
				{
					System.out.println(i);
				}
			}
			
		}
		
		@Test
		
		public void countVowelsInString()
		{
			String [] str= {"vijay","vinay","jawahar"};
			
			for(int i=0; i<str.length; i++)
			{
				int count=0;
				String su=str[i];
				
				for(int j=0; j<su.length(); j++)
				{
				
					char  ch=su.charAt(j);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					{
						count++;
					}}
					
				System.out.println(str[i]+"   "+count);
			}
		}
		
		@Test
		
		public void primeNumber()
		{
		
			for(int n=2; n<=100; n++)
			{
				
				for(int j=1; j<=n; j++)
				{
				int count=0;
				
			if(n%j==0)	
			{
				count++;
			}
				if(count==2)
				{
					System.out.println(n);
				}
				//System.out.println(n);
			}}	
		}
		
		@Test
		
public void countVowelsInString1()
		
		{
			String  str= "vijay vinay jawahar";
		String[] str1 = str.split(" ");
			
			for(int i=0; i<str1.length; i++)
			{
				int count=0;
				String su=str1[i];
				
				for(int j=0; j<su.length(); j++)
				{
				
					//char  ch=su.charAt(j);
					if(str1[i].charAt(j)=='a'||str1[i].charAt(j)=='e'||str1[i].charAt(j)=='i'||str1[i].charAt(j)=='o'||str1[i].charAt(j)=='u')
					{
						count++;
						
					}
				
				}
				System.out.println(str1[i]+"   "+count);
				
			}
		}
		
		@Test
		
		public void  OccurenceOfDigit()
		{
			int n=122324445;
			
			
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
		
		@Test
		public void checkStringAnagram()
		{
			String a="care";
			String b="selenium";
			
			if(a.length()!=b.length())
			{
				System.out.println("it is not an anagram");
			}
				
				else {
					char array1[]=a.toCharArray();
					char array2[]=b.toCharArray();
					
					Arrays.sort(array1);
					Arrays.sort(array2);
					
					if(Arrays.equals(array1, array2)==true)
					{
						System.out.println("it is a anagram");
					}
					else {
						System.out.println("it is not a anagram");
					}
				}
				
		}
		
		@Test
		
		public void checkAnagaram()
		{
			String str="care";
			String str1="racehgj";
			
			
			if(str.length()!=str1.length())
			{
				System.out.println("it is not a anagram string");
			}
			else {
			char array1[]=str.toCharArray();
			char array2[]=str1.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			if(Arrays.equals(array1, array2)==true)
			{
				System.out.println("it is a anagaram");
			}
			else {
				System.out.println("it is not an anagram string");
			}
		}
		}
		
		@Test
		public void addNumberInString()
		{
			String str="ar1sha2d";
			int sum=0;
			
			for (int i = 0; i < str.length(); i++) {
				
				char ch=str.charAt(i);
				
				if(ch>='0'&& ch<='9')
				{
					sum=sum+ch-48;
				}
			}
			System.out.println(sum);		
		}
		
		@Test
		public void revWordStr()
		{
			String str="my name is arshad";
			String rev=" ";
			
			String[] su = str.split(" ");
			
		for (int i = 0; i < su.length; i++) 
			{
				rev=su[i]+" "+rev;
			}
			System.out.println(rev);
			
		}
		}
		
		
			

			
	
