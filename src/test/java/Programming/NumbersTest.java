package Programming;

import org.testng.annotations.Test;

public class NumbersTest {
	
	@Test
	
	public void FactorialOfNumber()
	{
		int fact=1;
		
		for(int i=1; i<=5; i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
			
	}
	
	@Test
	public void FibnocciSeries()
	{
		int a=0;//1,
		int b=1;//1,
		for(int i=0; i<=10; i++)
		{
			//0,1
			int c=a+b;//1,2
			System.out.println(a);
			a=b;//1,
			b=c;//1,
		}
	}
	
	@Test
	
	public void PrimeNumberUpto30()
	{
		
		for(int n=1; n<30; n++)
		{
			int count=0;
			for(int i=1; i<=n; i++)
			{
				if(n%i==0)
				{
					count++;
					
				}
			}
		
		if(count==2)
		{
			System.out.println(n);
		}
		
	}
		
		
	}
	
	@Test
	public void PrimeNumberInTheGivenFormate()
	{
		//1 3 7 15 31 63 127
		
		
		int n=1;//3,7,15
		for(int i=0; i<=6; i++)
		{
			System.out.println(n+"  ");
			
			n=(n*2)+1;//1,3,7,15
		}
	}
	
	@Test
	public void primeNumberFromArray()
	{
		int a[]= {1,9,3,55,2,6,7,4};
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=1; j<=a[i]; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			
		
		if(count==2)
		{
			System.out.println(a[i] + "   it is a prime number");
		}
		else {
			System.out.println(a[i] + "    it is not a prime number");
		}
	}
	
	}
	@Test
	public void Patterns()
	{
		//int n=5;
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<=5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void Pattern2()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			//1<=5t
			//2<=5t
			//3<=5t
			for(int j=1; j<=i; j++)
			{
				//1<=1t
				//2<=1tf,
				
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
	
	
	@Test
	public void pattern3()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("*   ");
			}
			System.out.println();
		}
		
	}
	
	@Test
	public void Pattern4()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
      for(int j=1; j<=i; j++)
      {
    	  System.out.print("* ");
      }
      System.out.println();
		}
	}

	@Test
	public void pattern5()
	{
		int n=5; 
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
				}
			System.out.println();
		}
	}
	
	
	@Test
	public void pattern6()
	{
		//dot
		int n=5;
		for(int i=n; i>0; i--)
		{
			for(int j=1; j<=n; j++)
			{
				if(i<=j)
				{
			System.out.print("* ");
			      }
				else {
					System.out.println(" ");
				}
			}
			System.out.println();
			
		}
	}
	@Test
	public void pattern7()
	{
		//dot
		int n=5;
		for(int i=n; i>0; i--)
		{
			for(int j = n; j>=1; j--)
			{
				
			
			if(i>=j)
			{
				System.out.print("* ");
			}
			else {
				System.out.println(" ");
			}
		}
	}
	
	
	}
	@Test
	public void pattern8()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern9()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern10()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern11()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern12()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern13()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<n; j++)
			{
				System.out.print(" ");
			}
			//System.out.println();
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern14()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			//System.out.println();
			for(int j=i; j<=n; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern15()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			int k=5;
			for(int j=i; j<=n; j++)
			{
				System.out.print(k-- +" ");
			}
			System.out.println();
		}
	
	
	
	}
	
	@Test
	public void pattern16()
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
				{
					System.out.print("2 ");
				}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
		public void pattern17()
		{
			int n=5;
			for(int i=1; i<=n; i++)
			{
				
				for(int j=i; j<n; j++)
				{
	System.out.print(" ");
	
	}
				for(int j=1; j<=i; j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
	
	
			}
		}
	@Test
	public void pattern18()
	{
		int n=5;
		char ch='A';
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern19()
	{
		int n=5;
		
		for(int i=1; i<=n; i++)
		{
			char ch='A';
			for(int j=1; j<=n; j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	
	@Test
	
	public void findSumOfDigit()
	{
		int num=2345;
		
		int sum=0,rem;
		
		while(num!=0)
		{
			rem=num%10;
			
			sum=sum+rem;
			
			num=num/10;
		}
		
		System.out.println("sum of digit of a number"+sum);
	}
}
	
	


