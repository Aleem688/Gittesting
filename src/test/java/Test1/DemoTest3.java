package Test1;

import org.testng.annotations.Test;

public class DemoTest3 {
	
	@Test
	
	public void maxNoInArray()
	{
		
	
	
	int a[]= {12,43,45,3,7};
	
	int max=a[0];
	
	for(int i=0; i<a.length; i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		
	}
	System.out.println(max);
	}
	
	@Test
	
	public void minNoInArray()
	{
		int a[]= {12,43,45,3,7};
		
		int min=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
	}

	
	
	@Test
	
	public void sumOfDigit()
	{
		int n=3456,rem;
		
		int sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
		
		n=n/10;
		}
		
		System.out.println("sum of digit of a number"+sum);
	}	

}
