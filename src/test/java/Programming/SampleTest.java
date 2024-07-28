package Programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class SampleTest {
	
//	public static boolean isPrime(int n)
//	{
//		if(n==0 || n==1)
//		{
//			return false;
//		}
//		for(int i=2; i<=n; i++)
//		{
//			if(n%i==0)
//			{
//				return false;
//			}
//		}
//	
//	return true;
//	}
//
//
//public static void main(String[] args)
//{
//	System.out.println(isPrime(6));
//}
//}

public static void main(String[] args)
{
//	for(int i=1; i<=100; i++)
//	{
//		int count=0;
//		
//	for(int j=1; j<=i; j++)	
//	{
//		if(i%j==0)
//		{
//			count++;
//		}
//	}
//	if(count==2)
//	{
//		System.out.println(i);
//	}
//		
//		
//	}}
//	
//	int fib1=0;
//	int fib2=1;
//	System.out.println(fib1+" "+fib2+" ");
//	
//	for(int i=0; i<=5; i++)
//	{
//		int fib3=fib1+fib2;
//		System.out.println(fib3+" ");
//		fib1=fib2;
//		fib2=fib3;
//	}
	
//	String str="saznat";
//	
//	LinkedHashSet<Character> hs=new LinkedHashSet<>();
//	
//	for(int i=0; i<str.length(); i++)
//	{
//		hs.add(str.charAt(i));//saznt
//	}
//	ArrayList<Character> ar=new ArrayList<>(hs);
//	for(int i=0;i<ar.size();i=i+2)
//	{
//		System.out.println(ar.get(i));
//	}
	

//	String str="a3b2c4d5";
//	char[] ch = str.toCharArray();
//	for (int i = 0; i < ch.length; i++) {
//		if (ch[i]>='a'&& ch[i]<='z') {
//			System.out.println(ch[i]);
//		}
//		else {
//			int a=ch[i]-48;
//			for (int j = 1; j < a; j++) {
//				System.out.println(ch[i-1]);
//			}
//		}
//	}
//	
//       int num=370,number,temp,total=0;
//       
//       number=num;
//       while(number!=0)
//       {
//    	   temp=number%10;
//    	   total=total+temp*temp*temp;
//    	   number=number/10;	   
//    	   
//       }
//       if(total==num)
//       {
//    	   System.out.println("it is a armstrong number");
//       }
//       else {
//    	   System.out.println("it is not a armstomg number");
//       }
//	int a[]= {12,34,52,67,13,6};
//	
//	int temp; int max=a[0];
//	for (int i = 0; i < a.length; i++) {
//		
//			
//				
//				if(max<a[i])
//				{
//					temp=a[i];
//					a[i]=max;
//					max=temp;
//				}
//				
//			}
//		
//	System.out.println(max);	
		
int a[]= {12,34,52,67,13,6};
	
//	int temp; int min=a[0];
//	for (int i = 0; i < a.length; i++) {
//		
//			
//				
//				if(min>a[i])
//				{
//					temp=a[i];
//					a[i]=min;
//					min=temp;
//				}
//				
//			}
//		
//	System.out.println(min);	

int temp;
for (int i = 0; i < a.length/2; i++) {
	
	for (int j = i+1; j < a.length/2; j++) {
		
		if(a[i]<a[j])
		{
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
		
		
//		
//		for(int k=0; k<a.length-3; k++)
//		{
//			System.out.println(a[k]);
//			
//		}
		
		
		
		
	}
	
	
}
System.out.println(a[0]);



	}	

@Test

public void occur()
{
	String str="arshad";
	HashSet<Character> hs=new HashSet<>();
	char ch[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		hs.add(ch[i]);
		
	}
	for(Character m:hs)
	{
		int count=0;
		
		for (int j = 0; j < ch.length; j++) {
			if(m==ch[j])
			{
				count++;
			}
		}
		if(count>=1)
		{
			System.out.println(m+"occured"+count);
		}
	}
}


@Test

public void reverseTheWord()
{
	String str="my name is arshad";
	String[] su = str.split(" ");
	
	for (int i = 0; i < su.length; i++) {
		
		String sp = su[i];
		
		for (int j=sp.length()-1; j>=0; j--) {
			
			char sm = sp.charAt(j);
			
			System.out.print(sm);
			
		}
		System.out.print(" ");
		
	}
	
	
	
}
		
}
		

	
