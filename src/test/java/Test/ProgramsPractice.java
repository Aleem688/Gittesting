package Test;

import org.testng.annotations.Test;

public class ProgramsPractice {
	
	
	
	
	@Test
	
	public void armstrongNumber()
	{
		
	int num=370,number,temp,total=0;
	
	number =num;
	
	while (number!=0)
	{
		temp=number%10;
		
		total=total+temp*temp*temp;
		
		number=number/10;
	}
		
		if(total==num)
		{
			System.out.println("it is armstrong number");
		}
		else {
			System.out.println("it is not a armstromg number");
		
	}		
	}
	
	@Test
	
	public void checkNumberPallindrome()
	{
		int num=1221,rem;
		int rev=0;//3//33//332//
		
		int number=num;
		
		while(number!=0)
		{
			rem=number%10;//1233%10=3 &&123%10=3 && 12%10=2
			
			rev=rev*10+rem;//3,3*10+3=33//33*10+2=332//332*10+1=
			
			number=number/10;//123//12//1//
				
		}
		
		if(num==rev)
		{
			System.out.println("it is a pallindrome number");
			
		}
		else {
			System.out.println("it is not a pallindrome number");
		}
	}
	
	@Test
	
	public void FactorialOfNumber()
	{
		int fact=1;//2//6//12//
		
		for (int i = 1; i <=5; i++) {
			
			fact=fact*i;//1*1//1*2//2*3//6*4//24*5=120
			
		}
		System.out.println(fact);
	}
	
	
	
	@Test
	
	public void sumOfDigitOfNumber()
	{
		int num=127,rem;
		int sum=0;
		
		while(num!=0)
		{
			rem=num%10;//127%10=7//12%10=2//1%10=1
			
			sum=sum+rem;//0+7=7,7+2=9,9+1=10
			
			num=num/10;//12//1//0
		}
		
		System.out.println("sum of digit of number is"+sum);
	}

	@Test
	
	public void fibnocciSeries()
	{
		int a=0;//1//1//2//3//5//8
		int b=1;//1//2//3//5//8
		
		for (int i = 0; i <=10; i++) {
			
			int c=a+b;
			
			System.out.println(c);
			
			a=b;//1
			b=c;//1
			
		}
	}	
}

