package Programming;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.apache.xmlbeans.impl.xb.xsdschema.LengthDocument;
import org.testng.annotations.Test;

public class PracticeTest {
	
	@Test
	public void SumOfTwoArray()
	{
		int a[]= {2,4,5,6,7,9,3};
		int b[]= {5,7,3,4,8,9};
		int i=0;
		int j=0;
		
		while(i<a.length && j<b.length)
		{
			System.out.println(a[i]+b[j]+" ");
			i++;
			j++;
		}
		while(i<a.length)
		{
			System.out.println(a[i]);
		i++;
	}
		while(j<b.length)
		{
			System.out.println(b[j]);
		j++;
		}
	}

	@Test
	public void combinationOfNumber()
	{
		int a[]= {7,4,5,6,2,4,3,4,2};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]+a[j]==10)
				{
					System.out.println(a[i]+"  "+a[j]);
				}
					
					
					
			}
		}
		
	}
	
	
	@Test
	public void removeDuplicateFromArray()
	{
		int a[]= {3,5,6,3,8,7,2,9,2,5};
		
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		System.out.println(hs+"");
		
//		for(Integer m:hs)
//		{
//			System.out.println(m);
//		}
		
	}
	@Test
	public void removeDuplicateUsingMap()
	{
		int a[]= {3,5,6,4,7,5,6,3,4,5};
		LinkedHashMap<Integer, Integer> lhm=new LinkedHashMap<>();
		for(int i=0; i<a.length; i++)
		{
			lhm.put(a[i], i);
		}
		
		for(Entry<Integer, Integer> map:lhm.entrySet())
			
		{
			System.out.println(map.getKey());
		}
		
	}
	
	@Test
	public void countHowManyTimesTheDuplicateNoIsRepeatingInArrayUsingHashSet()
	{
		int a[]= {3,5,4,6,3,7,8,9,2};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		//int count=0;
		for(Integer m:hs)
		{
			int count=0;
	       for(int i=0; i<a.length; i++)
	       {
	    	   if(m==a[i])
	    	   {
	    		   count++;
	    	   }
	       }
		
		System.out.println(m+"repeating"+count+  "times" );
	 
		}
		
	}
	
	@Test
	public void swapeWith3rdVariable()
	{
		int a=10;
		int b=20;
		int temp=a;//10
		a=b;//a=20
		b=temp;//10
		System.out.println(a+" "+b);
		
	}
	@Test
	public void swapeWithout3rdVariable()
	{
		int a=10;
		int b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
	
	
	@Test
	public void occurenceOfEachCharacterInString()
	{
		String str="TestYantra";
		String s=str.toLowerCase();
		char ch[]=s.toCharArray();
		
		HashSet<Character> hs=new HashSet<>();
		
		for(int i=0; i<ch.length; i++)
		{
			hs.add(ch[i]);
			
		}
		for(Character in:hs)
		{
			int count=0;
			for(int j=0; j<ch.length; j++)
			{
				if(in==s.charAt(j))
				{
					count++;
				}
			}
			System.out.println(in+" occurence"+count+" times");
		}
		
		
		
		
	}
	@Test
	public void swapeFirstAndLastWordInString()
	{
		String str="I am from TestYantra";
		String[] s=str.split(" ");
		
		String temp=s[0];//i=0
		s[0]=s[s.length-1];//TestYantra
		s[s.length-1]=temp;//I
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]+" ");
		}
	
	}
	
	
	@Test
	
	public void swapeTheString()
	{
		String str="I am from TestYantra";
		String[] s=str.split(" ");
		
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]+" ");
		}
	
	}
	
	@Test
	public void addTwoNumber()
	{
		int a[]= {12,45,23,65,23,45,13};
		int b[]= {14,19,18,10,11,21};
		int i=0;
		int j=0;
		while(i<a.length && j<b.length)
		{
			System.out.println(a[i]+b[j]+" ");
			i++;
			j++;
		}
		while(i<a.length)
		{
			System.out.println(a[i]);
			i++;
		}
		
		while(i<b.length)
		{
			System.out.println(b[j]);
			j++;
		}
	}
		@Test
		public void convertToSmall()

		{
			String str="Arshad Ayyub";
			String []s=str.split("");
			for(int i=0; i<s.length; i++)
			{
				String su=s[i];
				for(int j=0; j<su.length(); j++)
				{
					if(su.charAt(j)==su.charAt(0))
					{
					System.out.println((char)(su.charAt(j)+32));	
					}
					else {
						System.out.println(su.charAt(j));
					}
				}
				System.out.println("");
			}
			
     
	
	
	
	}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	


