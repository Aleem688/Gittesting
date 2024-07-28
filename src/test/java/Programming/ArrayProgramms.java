package Programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ArrayProgramms {

	@Test

	public void swapNumberWith3rdVar()
	{
		int a=10;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}

	@Test
	public void swapNumberwithout3rdVar()
	{
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

	@Test
	public void sortArrayInAscendingOrderUsingBubbleSort()
	{

		int []a= {5,3,0,1,4};
		int temp;
		//int size = a.length;
		//System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
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
	public void sortArrayInDescendingOrderUsingBubbleSort()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
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
	public void min1stNumber()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}


			}
			//System.out.println(a[0]);
		}
		System.out.println(a[0]);

	}
	@Test
	public void max1stNumberArray()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}


			}
			//System.out.println(a[0]);
		}
		System.out.println(a[0]);
	}

	@Test
	public void Sum1st3MinNumber()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}


			}
			//System.out.println(a[0]);
		}
		//System.out.println(a[0]+a[1]+a[2]);
		int sum=0;
		for(int i=0; i<3; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}
	

	@Test
	public void Sum1st3MaxNumber()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}


			}
			//System.out.println(a[0]);
		}
		//System.out.println(a[0]+a[1]+a[2]);
		int sum=0;
		for(int i=0; i<3; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);


	}

	@Test
	public void Multiply1st3MinNumber()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int mult=1;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}


			}
			//System.out.println(a[0]);
		}
		System.out.println(a[0]*a[1]*a[2]);
		
	}

	@Test
	public void Multiply1st3MaxNumber()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}


			}
			//System.out.println(a[0]);
		}
		System.out.println(a[0]*a[1]*a[2]);

	}

	@Test
	public void min2ndNumber()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}


			}
			//System.out.println(a[0]);
		}
		System.out.println(a[1]);

	}


	@Test
	public void Max2ndNumber()
	{

		int []a= {5,3,0,1,4};
		int temp;
		int size = a.length;
		System.out.println(size);
		for(int i=0; i<a.length; i++)

		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}


			}
			//System.out.println(a[0]);
		}
		System.out.println(a[1]);

	}

	@Test
	public void min1stNumberWithoutBubbleSort()
	{
		int []a= {5,3,0,1,4};
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			
			if(min>a[i])
			{
				min=a[i];
			}

		}
		System.out.println("the first minimum number in array is"+min);
	}

	@Test
	public void max1stNumberWithoutBubbleSort()
	{
		int []a= {5,3,0,1,4};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}

		}
		
		System.out.println("the first Maximum number in array is"+max);
	}

	@Test
	public void find1stAnd2ndMinNosInArrayWithoutUsingBubbleSort()
	{
		int []a= {5,3,0,4,0};
		int firstmin=a[0];
		int secondmin=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(firstmin>a[i])
			{  
				firstmin=a[i];
			}
			//		if(a[i]>min) {
			//			if(a[i]<secondmin)
			//		{
			//			secondmin=a[i];
			//		}
			//			
			//	}
			for(int j=0; j<a.length; j++)

			{
				if(a[j]>firstmin) {
					if(a[j]<secondmin)
					{
						secondmin=a[j];
					}
				}}

			//	System.out.println("the first minimum number in array is"+min);
			//	System.out.println("the secondt minimum number in array is"+secondmin);
		}
		System.out.println("the first minimum number in array is"+firstmin);
		System.out.println("the secondt minimum number in array is"+secondmin);
	}


	@Test
	public void find1stAnd2ndMaxNosInArrayWithoutUsingBubbleSort()
	{
		int []a= {5,3,56,4,92,60,78,53,100,544};
		int max=a[0];
		int secondmax=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{  
				max=a[i];
			}
			//		if(a[i]>min) {
			//			if(a[i]<secondmin)
			//		{
			//			secondmin=a[i];
			//		}
			//			
			//	}
			for(int j=0; j<a.length; j++)

			{
				if(a[j]<max) {
					if(a[j]>secondmax)
					{
						secondmax=a[j];
					}
				}}

			//	System.out.println("the first minimum number in array is"+min);
			//	System.out.println("the secondt minimum number in array is"+secondmin);
		}
		System.out.println("the first max number in array is"+max);
		System.out.println("the secondt max number in array is"+secondmax);
	}


	@Test
	public void PrintCombinationOfNumber()
	{
		int []a= {8,4,3,9,2,7,5,6};

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)

			{
				if(a[i]+a[j]==11)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

	@Test
	public void additionOf2Array()
	{
		//		int n=0;
		//int a[]= {4,2,6,1,7};
		//		int c[]=a;
		//		int b[]= {3,1,7,2};
		//		if(a.length<b.length)
		//		{
		//			n=a.length;
		//			
		//		}
		//		else {
		//			n=b.length;
		//		}
		//		for(int i=0; i<n; i++)
		//		{
		//			c[i]=a[i]+b[i];
		//		}
		//		
		//		for(int number:c)
		//		{
		//			System.out.println(number);
		//		}
		int a[]= {2,4,5,7};
		int b[]= {4,5,2,7,8};

		//		int maxLength = a.length;
		//		if(a.length<b.length)
		//			maxLength=b.length;
		//		int c[]=new int[maxLength];

		int i=0;
		int j=0;
		//int k = 0;
		while(i<a.length && j<b.length)
		{
			System.out.print(a[i]+b[j]+" ");
			//c[k]=a[i]+b[j];
			i++;
			j++;
			//k++;
		}

		while(i<a.length)
		{
			System.out.print(a[i]+" ");
			//c[k]=a[i];
			i++;
			//k++;
		}

		while(j<b.length)
		{
			System.out.print(b[j]+" ");
			//c[k]=b[j];
			j++;
			//k++;
		}
		//		for(int m=0; m<c.length; m++)
		//		{
		//			System.out.print(c[m]+" ");
		//		}

	}

	@Test

	public void appending0sAtLast()
	{
		int [] a= {5,0,4,0,0,9};

		//int n=a.length;

		int[]b=new int[a.length];

		int m=0;
		int n=a.length-1;

		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)

			{
				b[m]=a[i];
				m++;
			}

			else {
				b[n]=a[i];
				n--;
			}
		}
		for(int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}


	}
	@Test

	public void appending0sAtFirst()
	{
		int [] a= {5,0,4,0,0,9};

		//int n=a.length;

		int[]b=new int[a.length];

		int m=0;
		int n=a.length-1;

		for(int i=0; i<a.length; i++)
		{
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
		for(int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}
	}
	@Test

	public void removeDuplicateFromArray()
	{
		int a[]= {2,3,1,4,1,3,5,2};
		//int b[]=new int[a.length];
		HashSet<Integer> hs=new HashSet<Integer>();

		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		System.out.println(hs);
	}

	@Test

	public void removeDuplicateFromArrayByUsingMap()
	{
		//int a[]= {2,3,1,4,1,3,5,2};
		int[]a= {48,76,54,54,32,32,76};
		//int b[]=new int[a.length];
		LinkedHashMap <Integer,Integer> hs = new LinkedHashMap<>();

		for(int i=0; i<a.length; i++)
		{
			//		//hs.put(null, a[i]);
			//			if(hs.get(a[i])==null)
			//			{
			//				hs.put(a[i],true);
			//				System.out.println(a[i]);
			//			}
			//		}

			hs.put(a[i],i);
		}


		for(Entry<Integer,Integer> m:hs.entrySet())
		{
			System.out.println(m.getKey()+" ");
		}
		//System.out.println(a[null]);
	}
	
	@Test
	public void countHowManyTimesTheDuplicateNoIsRepeatingInArray()

	{
		int count=0;

		int[] a= {2,3,1,4,1,3,5,2};

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)

			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					count ++;
				}
		
		
			}}
	}


	@Test
	public void countHowManyTimesTheDuplicateNoIsRepeatingInArrayUsingHashSet()

	{
		//int count=0;

		int[] a= {2,3,1,4,1,3,5,2};
		HashSet<Integer> hs=new HashSet<>();		
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);	
		}
		for(Integer in:hs)
		{

			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(in==a[i])
				{
					count++;
				}
			}

			System.out.println(in+" repeating  "+count +"times ");
		}
		
	}

	@Test
	public void countHowManyTimesTheDuplicateNoIsRepeatingInArrayUsingHashMap()

	{
		//int count=0;

		int[] a= {2,3,1,4,1,3,5,2};
		//HashSet<Integer> hs=new HashSet<>();


		HashMap<Integer,Integer> hs=new HashMap<>();
		for(int i=0; i<a.length; i++)
		{
			hs.put(a[i], i);
		}



		for( Entry<Integer, Integer> in:hs.entrySet())
		{

			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(in.getKey()==a[i])
				{
					count++;
				}
			}

			System.out.println(in.getKey()+" repeating  "+count +"times ");
		}
	}


	@Test
	public void countNoOfTimesTheDuplicateNoIsRepeatingInArrayUsingHashMap()

	{
		//int count=0;

		int[] a= {2,3,1,4,1,3,5,2};
		//HashSet<Integer> hs=new HashSet<>();


		LinkedHashMap<Integer,Integer> hs=new LinkedHashMap<>();
		for(int i=0; i<a.length; i++)
		{
			hs.put(a[i], i);
		}



		for( Entry<Integer, Integer> in:hs.entrySet())
		{

			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(in.getKey()==a[i])
				{
					count++;
				}
			}
			if(count>1) //taking only duplicate

				System.out.println(in.getKey()+" repeating  "+count +"times ");
		}


	}

	@Test

	public void positionOfEachNoInArrayWithoutDuplicate()
	{
		int[] a= {2,3,1,4,1,3,5,2};

		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();

		for(int i=0; i<a.length; i++)
		{
			//hs.put(a[i], i);
			hs.add(a[i]);

		}


		for(Integer in:hs)

		{
			for(int i=0; i<a.length; i++)
			{
				if(in==a[i])
				{
					System.out.println(in+" is present in"+i+"position");
					break;
				}
			}
		}

	}

	@Test
	public void positionOfEachNoInAnArrayWithoutDuplicateUsingMap()

	{
		//int count=0;

		int[] a= {2,3,1,4,1,3,5,2};
		//HashSet<Integer> hs=new HashSet<>();


		LinkedHashMap<Integer,Integer> hs=new LinkedHashMap<>();
		for(int i=0; i<a.length; i++)
		{
			hs.put(a[i], i);
		}



		for( Entry<Integer, Integer> in:hs.entrySet())
		{


			for(int i=0; i<a.length; i++)
			{
				if(in.getKey()==a[i])
				{
					System.out.println(in.getKey()+" is present in"+(i+1)+"position");
					break;
				}
			}

		}


	}
	@Test
	
	public void swipeTheNumberWith3rdVariable12()
	{
		int a=10;
		int b=20;
		
		int temp=a;//10
		a=b;  //a=20
		b=temp;;//
		System.out.println(a+" "+b);
	
	}
	
	@Test
	public void ascendingOrder()
	{
		int a[]= {12,23,25,65,32};
		
		int size=a.length;
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
				
			{
				if(a[i]>a[j])
				{
					//12>23 false
					temp=a[j];//32
					a[j]=a[i];//32
					a[i]=temp;//32
				}
			}
			System.out.println(a[i]);
				
				
		}	
	}
	@Test
	public void descendingOrder()
	{
		int a[]= {12,23,25,65,32};
		
		int size=a.length;
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
				
			{
				if(a[i]<a[j])
				{
					//12>23 false
					temp=a[j];//32
					a[j]=a[i];//32
					a[i]=temp;//32
				}
			}
			System.out.println(a[i]);
}
	}
	
	
	
	@Test
	
	public void positionOfEachNoInAnArrayWithoutDuplicateUsingMap1()

	{
		//int count=0;

		int[] a= {2,3,1,4,1,3,5,2};
		LinkedHashMap<Integer, Integer> hm =new LinkedHashMap<>();
		
		for(int i=0; i<a.length; i++)
		hm.put(a[i], i);
		
		for(Entry<Integer, Integer> in:hm.entrySet())
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(in.getKey()==a[j])
				{
					System.out.println(in.getKey()+"is present"+j+"position");
					break;
					
					
				}
			}
			
			
		}
	
	}
	
	@Test
	
	public void printSwapingArray()
	{
		int a[]= {10,20,30,40,50};
		int []b=new int[a.length];
		for(int i=1; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0; i<1; i++)
		{
			System.out.print(a[i]);
		}
	}
	
	
	
	@Test
	
	public void printUniqueArray()
	{
		int a[]= {1,2,3,99,1,2,3};
		
		HashSet< Integer> hs=new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		
		for(Integer m:hs)
		{
			int count=0;
			for(int j=0; j<a.length; j++)
			{
				if(m==a[j])
				{
					count++;
				} 
				}
			
				if(count==1)
				{
					System.out.println(m);
				}
			}
		}
	
	
	@Test
	
	public void swipeNumbers()
	{
		int a[]= {10,20,30,40,50};
		int temp;
		for(int i=0; i<a.length; i++)
		{
	for(int j=i+1; j<a.length; j++)
	{
	    if(a[i]<a[j])
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
	
	public void countCharacter()
	{
		String str="abcabcddcadd";
		HashSet<Character> hs=new HashSet<Character>();
	        char[] ch = str.toCharArray();
	        
	        for(int i=0; i<ch.length; i++)
	        {
	        hs.add(ch[i]);
	        
	        }
	        System.out.println(hs);
	        
	        for(Character m:hs)
	        {
	        	int count=0;
	        for(int j=0; j<ch.length; j++)	
	        {
	        	if(m==ch[j])
	        	{
	        		count++;
	        	}
	        }
	        System.out.println(m+"occured--->"+count);  	
	       
	        }
	            
	}
	@Test
	public void pattern()
	{
		int n=5;
		for(int i=0; i<n; i++)
		{
		int m=(i*2)+1;
		int x=1;
     
		for(int j=1; j<=m; j++)
      {
	  
			if(j<=i)
	  {
		  System.out.print((x++));
		  
	  }
	  else {
		  System.out.print((x--));
	  }
  }
  System.out.println("");
		}
	}
	
	@Test
	public void append0sAtLast()
	{
		int a[]= {5,3,0,2,9,0,1};
		
		int[] b=new int [a.length];
		
		int m=0;
		int n=a.length-1;
		
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i]!=0)
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b[n]=a[i];
				n--;
			}
		
	}
		for(int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}
			
	}
	
	@Test
	public void append0sAtFirst()
	{
	int a[]= {5,3,0,2,9,0,1};
	
	int[] b=new int [a.length];
	
	int m=0;
	int n=a.length-1;
	
	for(int i=0; i<a.length; i++)
	{
		
		if(a[i]==0)
		{
			b[m]=a[i];
			m++;
		}
		else
		{
			b[n]=a[i];
			n--;
		}
	
}
	for(int j=0; j<b.length; j++)
	{
		System.out.println(b[j]);
	}
		
}
	
}
