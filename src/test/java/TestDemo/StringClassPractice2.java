package TestDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class StringClassPractice2 {
	
	
	@Test
	
	public void reverseCharInString()
	{
		
	String str="arshad"	;
	
	char ch[]=str.toCharArray();
	
	  int size = str.length();
	  System.out.println(size);
	
	System.out.println(ch.length);
	
	for (int i =  ch.length-1; i >=0; i--) {
		
		System.out.println(ch[i]);
		
	}
		
		
		
		
	}
	
	
@Test
	
	public void reversewordsInString()
	{
		
	String str="my name is arshad";
	
String str1[]=str.split(" ");

for (int i = str1.length-1; i >=0 ; i--) {
	
	System.out.println(str1[i]);
	
}

}

@Test

public void reversEachewordsInString()
{
	
String str="my name is arshad";

String str1[]=str.split(" ");

for (int i = 0; i < str1.length; i++) {
	
String str2	=str1[i];

for (int j = str2.length()-1; j >=0 ; j--) {
	
	System.out.print(str2.charAt(j));
	
}
	System.out.print(" ");
}

}


@Test

public void ocuurenceOfEachCharacter()
{
	
String str="arshad"	;
HashSet<Character> hs=new HashSet<>();
char ch[]=str.toCharArray();


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
	System.out.println(m+".... occured"+count);
}
	
}

@Test

public void ocuurenceOfEachWordsInString()
{
	
String str="my name is arshad name"	;
HashSet<String> hs=new HashSet<>();
//char ch[]=str.toCharArray();
String str1[]=str.split(" ");

for (int i = 0; i < str1.length; i++) {
	
	hs.add(str1[i]);
}


for( String m:hs)
{
	int count=0;
	
	for (int j = 0; j < str1.length; j++) {
		
		if(m.equalsIgnoreCase(str1[j]))
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
	
	HashMap<Character, Integer> map=new HashMap<>();
	
	
	char ch[]=str.toCharArray();
	
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
		System.out.println(m.getKey()+"....occured"+count);
	}
	
	
}


@Test

public void ocuurenceOfEachWordsInStringUsing()
{
	
String str="my name is arshad name"	;
HashMap<String, Integer> map=new HashMap<>();


//char ch[]=str.toCharArray();
String str1[]=str.split(" ");

for (int i = 0; i < str1.length; i++) {
	
	map.put(str1[i],i);
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
	
	System.out.println(m.getKey()+"...ocured"+count);
}
}


@Test

public void checkGivenStringIsAnagram()
{
	String str="care";
	
	String str1="race";
	
	
	if(str.length()!=str1.length())
	{
		System.out.println("the given string is not a anagram");
	}
	
	
	char array[]=str.toCharArray();
	
	char array1[]=str1.toCharArray();
	
	Arrays.sort(array);
	Arrays.sort(array1);
	
	if(Arrays.equals(array, array1)==true)
	{
		System.out.println("given string is anagaram");
	}

	
	else{
		System.out.println("it is not a anagram");
	}
}


@Test

public void segrregateTheString()
{
	String str="ars23$#had";
	
	String alpha="";
	String beta="";
	String gama="";
	
char ch[]	=str.toCharArray();

for (int i = 0; i < ch.length; i++) {
	
	if(ch[i]>='0'&& ch[i]<='9')
	{
		
		alpha=alpha+ch[i];
	}
	
	else if(ch[i]>='A' && ch[i]<='z')
	{
		beta=beta+ch[i];
	}
	
	else {
		gama=gama+ch[i];
	}
}

System.out.println(alpha+" "+beta+" "+gama);
}




@Test

public void addNumbersInString()
{
	String str="ars234had";
	
	int sum=0;
	
	char ch[]	=str.toCharArray();
	
	for (int i = 0; i < ch.length; i++) {
		
		if(ch[i]>='0'&& ch[i]<='9')
			
		{
			int n=ch[i]-48;
			sum=sum+n;
		}
		
		
		
	}
	System.out.println(sum);
}

@Test

public void multiplyNumberString()
{
	String str="ars57ad";
	char ch[]	=str.toCharArray();
	
	
	int mult=1;
	
	for (int i = 0; i < ch.length; i++) {
		
		if(ch[i]>='0'&& ch[i]<='9')
		{
		int n=ch[i]-48;
		
		mult=mult*n;
		
		}
		
	}
	System.out.println(mult);
	
	
}

@Test

public void CheckNumberIsPallindrome()
{
	int num=1323,rem;
	int number=num;
	int rev=0;
	
	while(number!=0)
	{
		rem=number%10;
		
		rev=rev*10+rem;
		
		number=number/10;
	}
	
	if(rev==num)
	{
		System.out.println("it is a pallindrome");
	}
	else {
		System.out.println("it is not a pallindrome");
	}
}

@Test

public void givenNumberIsHappy()
{
	int num=375,number,temp,total=0;
	
	number=num;
	
	while(number!=0)
		
	{
		temp=number%10;
		
		total=total+temp*temp*temp;
		
		number=number/10;
	}
	if(total==num)	
	{
		System.out.println("it is a armstrong");
	}
	else {
		System.out.println("it is not a armstrong");
	}
}


//print prime number upto 30

@Test

public void printPrimeNumber()
{
	//int n=30;
	
	
	for(int n=1; n<30; n++)
	{
		int count=0;
		for (int i = 1; i <= n; i++) {
			
			//1<=2
			
			if(n%i==0)
			{
				//2%1=0
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(n);
			//2
		}
	}
}



@Test

public void swipeTheNumberWith3rdVariable()
{
	
	int a=10;
	int b=20;
	int temp;
	
	temp=a;
	a=b;
	b=temp;
	
	System.out.println(a+" "+b);
	
		
}

@Test

public void swipeTheNumberWithout3Variable()
{
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a+"   "+b);
		
}


@Test

public void fibnossiSeries()
{
	int a=0;
	
	int b=1;
	
	for(int i=0; i<=10; i++)
	{
		int c=a+b;
		
		System.out.println(c);
		
		a=b;
		b=c;
	}
	
	
	
}


@Test

public void factorialOfNumber()
{
	int fact=1;
	
	//1,2,6,24,24*5=120
	for (int i = 1; i <=5; i++) {
		
		
		fact=fact*i;	
	}
	
	System.out.println(fact);
		
}



@Test

public void append0sAtLast()
{
	int a[]= {3,5,0,7,0,2,1};
	
	int m=0;
	
	int n=a.length-1;
	
	int b[] =new int [a.length];
	
	for (int i = 0; i < a.length; i++) {
		
		
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



@Test

public void append0sAtFirst()

{
	
	int a[]= {2,4,7,0,2,0,1};
	
	
	int m=0;
	
	int n=a.length-1;
	
	int b[]=new int[a.length];
	
	
	for (int i = 0; i < a.length; i++) {
		
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






@Test

public void findMaxNumberInArray()
{
	int a[]= {3,5,8,7,9,36};
	
	int temp;
	
	
	
	for (int i = 0; i < a.length; i++) {
		
		
		for (int j = i+1; j < a.length; j++) {
			
			if(a[i]<a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			
			
		}
		
	}

	System.out.println(a[0]);
	
}


@Test

public void maxNumberInArray()
{
	int a[]= {2,4,5,7,8,9};
	
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

public void minNumberInArray()
{
	int a[]= {2,4,5,7,8,9};
	
	int min=a[0];
	
	for (int i = 0; i < a.length; i++) {
		
		if(min>a[i])
		{
			min=a[i];
		}
		
	}
	
	System.out.println(min);
}


@Test

public void uniqueNumberInArray()
{
	int a[]= {1,2,2,3,3,4,5};
	
	
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

}
