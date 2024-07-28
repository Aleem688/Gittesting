package assignmentPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.testng.annotations.Test;

public class AssignmentPrograms {
	
	
	@Test
	//1 revesrse the string 
	public void reverseString()
	{
		String str="welcome to expleo";
		
		/*String rev="";
				//# Split the string into words
				String [] s = str.split(" ");

				for(int i=0; i<s.length; i++)
				{
					rev=s[i]+" "+rev;
				}

				System.out.println(rev);
*/
		String s[]=str.split(" ");
		for(int i=s.length-1; i>=0; i--)
		{
			System.out.println(s[i]);
		}
	}
	

@Test
	//2 remove duplicate from string
	
	public void removeDuplicateFromStringTest()
	
	{
		String str="testyantra";
		//String su=str.toLowerCase();)
		
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
	//3 remove duplicate words
		public void removeDuplicateWordsFromStringTest()
		
		{
			String str = "I am from am from Testyantra";
			String s1 = str.toLowerCase();
			String[] s2 = s1.split(" ");
			LinkedHashSet<String> set = new LinkedHashSet<String>();
			for(int i=0; i<s2.length; i++)
			{
				set.add(s2[i]);
			}
			for(String op:set) 
			{
				System.out.print(op+" ");
			}
		}
	
	@Test
	//4 Revesre the word today is friday input
	public void reverseTheWordsInString()
	{
		String s="today is friday"; // input
		String[] s1 = s.split(" ");
		for(int i=s1.length-1; i>=0; i--)
		{
			System.out.print(s1[i]+" ");
		}
	}


	@Test
	
	//6 Reverse the words 
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
	//7 input-aaabbcddf output is-a3b2cd3f 
	public void printTheOutput()
	{
		String str = "aaabbcdddf";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(Character m:set) {
			int count=0;
			for(int i=0; i<s.length(); i++)
			{
				if(m==s.charAt(i))
				{
					count++;
				}
			}
			System.out.print(m+""+count+"");
		}
	}
	@Test
	//8
	public void max1stNumberWithoutBubbleSort()
	{
		int []a= {7,-3,0,2,1,-9};
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}

		}
		System.out.println("the first max number in array is"+max);
	}
	
	
	@Test
	
	//9
	public void product0fMax3Element()
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
	//10 input -  " i am selenium" 0/p- m ui nelesmai
	public void splitString()
	{
		String s="i am selenium";
		String[] s1 = s.split(" ");
		String rev="";
		for(int i=s1.length-1;i>=0;i--)
		{
			String s2=s1[i];
			for(int j=s2.length()-1;j>=0;j--)
			{
				rev=rev+s2.charAt(j);
			}
		}
		for(int j=0;j<rev.length();j++)
		{
			if(j==0||j==2)
			{
				System.out.print(rev.charAt(j)+" ");
			}
			else
			{
				System.out.print(rev.charAt(j));
			}
		}
	}
	
	@Test
	//11
	public void codeTryCatch()
	{
		try {
            // Code that may throw an exception
            int result = 10/0;
            System.out.println("Result: " + result); // This line will not be reached
        }
		catch (ArithmeticException e) {
            // Handle the exception
            System.err.println("An ArithmeticException occurred: " + e.getMessage());
        }
		finally {
            // Code that will always execute, whether an exception is occured or not
            System.out.println("Finally block executed.");
        }
        
        // Rest of the program continues here
        System.out.println("Program continues after try-catch-finally block.");
    }

 @Test
 //12
  public static int abc()
  {
	  try {
	        return 5;
	    }

	    catch(Exception e)
	    {
	    
	    }
	    return 10;
	    

	}
 
 @Test
 
 //14 print all the 1-20 numbers divisible by 2
 
 public void evenNumber()
 {
	 int n=20;
	 for(int i=1; i<=20; i++)
	 {
		 if(i%2==0)
		 {
			 System.out.println(i);
		 }
	 }
 }
 
 @Test
 //16 print 1-100 prime number
 public void printPrimeNumber()
 {
			int n=100;
			 for (int i = 1; i < n; i++) {
				int count=0;
				for (int j = 2; j < i; j++)
				{
					if (i%j==0) {
						count++;
					}
				}
				if (count==0) {
					System.out.print(i+" ,");
				}
			}
 }
 
 
 @Test
 //17 write a program to print count of characters
 public void countCharactersInString()
 {

		String s="aweexxyyyyyy";
		int j=0;
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i=j) {
			int count=1;
			for ( j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
				else {
					break;
				}
			}
			System.out.println(ch[i]+""+count+" ");
		}
	}
 
 @Test
 // 18 write a program to sort an array
	public void sortAnArray()
	{
		int [] a= {15,34,23,12,67,43};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
 
	@Test
	//19 input -Malayalam output is m:2a:4l:2y:1
	public void printString()
	{
		String str = "Malayalam";
		String s1=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character m:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(m==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.print(m+":"+count+"");
		}
	}
 
 @Test
 //20 write a program to find first min three element in array
 public void first3MinimumNoInArray()
 {
		int []a= {7,-3,0,2,1,-9};
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
	
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		
 }
 
 @Test
 // 22 print the no of times character is present in string
 
 public void occuranceOfEachCharecter()
	{
		String s = "Testyantra";

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
				if(m==s.charAt(j))
				{
					count++;
					
				}
			}
			System.out.println(m+"     Occurence    "+count);
		
		}
	}
 @Test
 //23 print the character which is not duplicate 
	public void printCharacterNotDuplicate()
	{
		String s="Testyantra";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character m:set) {
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(m==s1.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(m+" "+count+"");
		}
	}
 
 @Test
 // 29 input "aabbaa" 
	public void removeduplicatetString()
	{
		String s="aabbaa";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character op:set) {
			System.out.print(op+" ");		
		}
	}
 
 @Test
 
 //30 write a program to reverse a string
 public void reverseStrng()
 {
		String str="Gulbarga";
		for(int i=str.length()-1; i>=0; i--)
		{
		System.out.print(str.charAt(i));	
		}
 
 }
 
 @Test
 //32 java program on bubble sort
 public void bubblesort()
 {
	 {
			int []a= {7,-3,0,2,1,-9};
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
			
 }}
 
 @Test
 //33 program to remove white space and replace it with a comma
 public void replacewithComma()
 {
	
		{
			String str = "my name is arshad";
			String result = str.replaceAll("\\s+", ",");

			System.out.println("Original String is: " + str);
			System.out.println("Modified String is: " + result);
		}

 }
 
 @Test
 //34 java program for taking input in arraylist and returning in array

public void takingInputInArray()
{
	 int a[]= {12,13,15,34,76,23};
	 ArrayList<Integer> al=new ArrayList<>();
	 for(int i=0; i<a.length; i++)
	 {
	 al.add(a[i]);
	
}
 
	 System.out.println(al);
 
 }
 
 @Test
 // 35 Remove the space in string
 
 public void removeSpace()
 {
	 
		{
			String str = "my name is arshad";
			String str2 = str.replaceAll("\\s", "");
			System.out.println("String after removing space: " + str2);
		}

 }
 @Test
 //36

	public void reverseEachWordINString() {
		String str = "my name is ok";
		String rev = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + "" + rev;
		}
		System.out.println(rev);

	}

 @Test
 
 // 41 write a program for  pallindrome
 public void pallindrome()
 {
	 
			int num= 1441;
			int rev=0;
			int temp=num;
			while (num!=0) {
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if (temp==rev) {
				System.out.println(temp+" is palindrome");
			}
		}
 
 @Test
 //43 string pallindrome by iteraror

public class StringpalindromeByIterator {

	
	@Test
	public void iteratorPalindrome() {
		
		
		
		String s="malayalam";
		char[] ch = s.toCharArray();
	 List<char[]> ls1 = Arrays.asList(ch);
		System.out.println(ls1);
		Iterator<char[]> ab = ls1.iterator();
	}
}

 @Test
 //44
 public void test()
 {
	 int i=20;
	 int j=30;
	 System.out.println(i);
 }
 
 @Test
 //45
 public void reverseStringSub()
	{
		String str = "i am in ooty";
		String[] s1 = str.split(" ");
		StringBuilder rev = new StringBuilder();
		for (String word : s1) 
		{
			StringBuilder reversedWord = new StringBuilder();
			for (int i = word.length() - 1; i >= 0; i--) 
			{
				reversedWord.append(word.charAt(i));
			}
			rev.append(reversedWord).append(" ");
		}
		String outputString = rev.toString().trim();
		System.out.println("Input String: " + str);
		System.out.println("Output String: " + outputString);
	}

 
 @Test
 //46 what happens if we change the main method public and static
 public void test2()
 {
	 System.out.println("we can interchange public and static in main method");
 }
 
 @Test
 //48 education wap to print vowels
 public void printVowels()
 {
	 String str="education";
	 int count=0;
	 char ch;
	 for(int i=0; i<str.length(); i++)
	 {
		ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
			System.out.println(ch);
		}
	 }
	 System.out.println(count);
 }
 
 @Test
 //47 education wap to count U
 public void countU()
 {
	 String str="immunuties";
	 int count=0;
	 char ch;
	 for(int i=0; i<str.length(); i++)
	 {
		ch=str.charAt(i);
		if(ch=='u')
		{
			count++;
			System.out.println(ch);
		}
	 }
	 System.out.println(count);
 }
 @Test
 //49 pattern program
	public void pattern2()
	{
		int n = 5; 

		for (int i = 1; i <= n; i++) {
			for (char ch = 'A'; ch <= 'A' + i - 1; ch++) {
				System.out.print(ch + " ");
			}
			System.out.println(); 
		}
	}

 
 @Test
 //50 print combination of number
 public void printCombination()
 {
		int []a= {1,3,5,2,8,9,10};

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
// 51 Occurence of charcter in string
public void OccurenceOfCharacter()
{
	String s = "Testyantra";

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
			if(m==s.charAt(j))
			{
				count++;
				
			}
		}
		System.out.println(m+"     Occurence    "+count);
	
	}
}

@Test
//52 AFgaDFkGd bsed on ascii value which is greatest character which is repeated more times
public void basedOnAsciiGreatestCharacter()
{
	String inputString = "AfgaDFkGd";
	int[] charCount = new int[128]; 
	for (char c : inputString.toCharArray()) {
		charCount[c]++;
	}
	char maxAsciiChar = 0;
	int maxCount = 0;
	for (int i = 0; i < charCount.length; i++) {
		if (charCount[i] > maxCount) {
			maxCount = charCount[i];
			maxAsciiChar = (char) i;
		}
	}
	System.out.println("Input String: " + inputString);
	System.out.println("Character with greatest ASCII value: " + maxAsciiChar);
	System.out.println("Occurrences of the character: " + maxCount);
}


@Test
//53

public void missingElementsInArray()
{
	int[] arr = {1, 2, 4, 6, 7, 9};
	int n = 10; 
	Arrays.sort(arr);
	int current = 1; 
	System.out.print("Missing elements: ");
	for (int num : arr) {
		while (current < num) {
			System.out.print(current + " ");
			current++;
		}
		current++; 
	}
	while (current <= n) {
		System.out.print(current + " ");
		current++;
	}
	System.out.println(); 
}


@Test
//54 frequency of odd and even numbers in the given matrix
public void getFrequencyOfOddEvenNumbersInGivenMatrix()
{
	int[][] matrix = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
	};
	int oddCount = 0;
	int evenCount = 0;
	for (int[] row : matrix) {
		for (int num : row) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
	}
	System.out.println("Matrix:");
	for (int[] row : matrix) {
		for (int num : row) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	System.out.println("Frequency of even numbers: " + evenCount);
	System.out.println("Frequency of odd numbers: " + oddCount);
}



@Test
//57 occurence of string output-a2b2c1e1t2r3a2e2
public void occurrenceOfString()
{
	String inputString = "aabbcettrrraaee";
	StringBuilder result = new StringBuilder();
	char currentChar = inputString.charAt(0);
	int count = 1;
	for (int i = 1; i < inputString.length(); i++) {
		char nextChar = inputString.charAt(i);

		if (nextChar == currentChar) {
			count++;
		} else {
			result.append(currentChar);
			result.append(count);
			currentChar = nextChar;
			count = 1;
		}
	}
	result.append(currentChar);
	result.append(count);
	System.out.println("Input String: " + inputString);
	System.out.println("Output: " + result.toString());
}

@Test
//58output should be product of the number
public void printOutputString()
{
	String inputString = "I a1m goi123ng to fi3215nd pro234duct for the num1212bers ins1212ide th1212is st3245ring";
	int product = 1;
	StringBuilder currentNumber = new StringBuilder();
	for (char ch : inputString.toCharArray()) {
		if (Character.isDigit(ch)) {
			currentNumber.append(ch);
		} else {
			if (currentNumber.length() > 0) {
				int number = Integer.parseInt(currentNumber.toString());
				product *= number;
				currentNumber.setLength(0); 
			}
		}
	}
	if (currentNumber.length() > 0) {
		int number = Integer.parseInt(currentNumber.toString());
		product *= number;
	}
	System.out.println("Input String: " + inputString);
	System.out.println("Output: " + product);
}

 
 @Test
 //83 find character occurence using hasmap
 public void occurenceOfCharacter()
 {
	 String st = "hello";
		String s=st.toLowerCase();

		char ch[]=s.toCharArray();
		HashMap <Character,Object> map=new HashMap<>();
		
		for(int i=0; i<ch.length; i++)
		{
			map.put(s.charAt(i), i);
		}
		
			for(Entry<Character, Object> m:map.entrySet())
			{
				int count =0;
			
				for(int i=0; i<ch.length; i++)
				{
					if(m.getKey()==s.charAt(i))
					{
						count++;
					}
				}
				System.out.println(m.getKey()+"  occurence"+count);
		
		}
 }
 
@Test
//87 string program 
public void verifyString()
{
	
String s1="hello";
String s2="hello";
String s3=new String("hello");
String s4=new String("hello");
System.out.println(s1==s2);
//System.out.println(s3.equalsIgnoreCase(s4));
//false

}

@Test

//61 reverse the alternative words
public void reverseAlteranativeWords()
{
	String s = "this is Java programming questions";
	String[] s1 = s.split(" ");
	StringBuilder rev = new StringBuilder();
	for (String word : s1) 
	{
		StringBuilder reversedWord = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) 
		{
			reversedWord.append(word.charAt(i));
		}
		rev.append(reversedWord).append(" ");
	}
	String outputString = rev.toString().trim();
	System.out.println("Input String: " + s);
	System.out.println("Output String: " + outputString);
	
}

@Test
//62reverse the alternative words in a string 
public void reverseAlternateWordsInString()
{
	String s = "I love programming";
	String[] s1 = s.split(" ");
	StringBuilder rev = new StringBuilder();
	for (String word : s1) 
	{
		StringBuilder reversedWord = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) 
		{
			reversedWord.append(word.charAt(i));
		}
		rev.append(reversedWord).append(" ");
	}
	String outputString = rev.toString().trim();
	System.out.println("Input String: " + s);
	System.out.println("Output String: " + outputString);
}

@Test
//65 print the duplicate values in a string
public void printDuplicateValues()
{
	String[] dropdown = {"Rishabh", "Rohan", "Rishabh", "Neha", "Venketesh"};
	int count = 0;
	System.out.print("Duplicate Values: ");
	for (int i = 0; i < dropdown.length - 1; i++) {
		for (int j = i + 1; j < dropdown.length; j++) {
			if (dropdown[i].equalsIgnoreCase(dropdown[j])) {
				System.out.print(dropdown[i] + " ");
				count++;
				break; 
			}
		}
	}
	System.out.println("\nCount of Duplicate Values: " + count);
}

@Test
//67
public void outputFormat()
{
	int[] arr = {3, 4, 5, 6};
	int target = 7;
	for (int i = 0; i < arr.length - 1; i++) {
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] + arr[j] == target) {
				System.out.println("Indices: " + i + ", " + j);
				return; 
			}
		}
	}
	System.out.println("No such pair found.");
}


@Test
//68
public void outputFormat2()
{
	int[] a = {7, 2, 12, 15};
	int target = 9;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for (int i = 0; i < a.length; i++) {
		int complement = target - a[i];
		if (map.containsKey(complement)) {
			int j = map.get(complement);
			System.out.println("Index I: " + j + ", Index J: " + i);
			return;
		}
		map.put(a[i], i);
	}
	System.out.println("No such indices found.");
}

@Test
//72 print repeated digits in given 
public void repeatedDigits()
{
	System.out.println("Repeated Digit Numbers from 0 to 100:");
	for (int i = 11; i <= 99; i++) {
		int tensDigit = i / 10;
		int unitsDigit = i % 10;
		if (tensDigit == unitsDigit) {
			System.out.print(i + " ");
		}
	}
}

@Test
//73 fibnocci series print the number divisible by 3 and5
public void fibonaciSeries()
{
	int n = 20; 
	int[] fibonacci = new int[n];
	fibonacci[0] = 0;
	fibonacci[1] = 1;
	System.out.println("Fibonacci Series (First " + n + " numbers):");
	System.out.print(fibonacci[0] + " "); 
	System.out.print(fibonacci[1] + " ");
	for (int i = 2; i < n; i++) {
		fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		if (fibonacci[i] % 3 == 0 && fibonacci[i] % 5 == 0) {
			System.out.print(fibonacci[i] + " ");
		}
	}
}

@Test
//74print the table for user entered number
public void printTable()
{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	System.out.println("Multiplication Table for " + number + ":");
	for (int i = 1; i <= 10; i++) {
		System.out.println(number + " x " + i + " = " + (number * i));
	}
	scanner.close();
}

@Test
//75 write a java program for armstrong number
public void armstrongNumber()
{
	int num=371,number,temp,total=0;
	
	number=num;
	
	while(number!=0)
	{
		temp=number%10;
		total=total+temp*temp*temp;
		number=number/10;
	}
	if(total==num)
	{
		System.out.println("given number is armstrong");
	}
	else {
		System.out.println("given number is not an armstrong");
	}
}

@Test
//78,79, Sop(15+35+"chandan") tell me the output
public void sop()
{
	System.out.println('A'+'B');
	// Output is 131 

	System.out.println(15+35+"Chandan"+3+4);
	// output is 50chandan

}

@Test
//82
public void outPut()
{
	String str ="java234str789";
	String str1 = str.replaceAll("[^0-9]", "");
	System.out.println(str1);
	// Output is 234789
}

@Test

//83 String s=hello find charcter occurence using map
public void characterOccurrence()
{
	String s="hello";
	String s1 = s.toLowerCase();
	LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
	for(int i=0; i<s1.length(); i++)
	{
		lhm.put(s1.charAt(i), i);
	}
	for(Entry<Character, Integer> m:lhm.entrySet())
	{
		int count=0;
		for(int i=0; i<s1.length(); i++) 
		{
			if(m.getKey()==s1.charAt(i))
			{
				count++;
				lhm.put(m.getKey(), count);
			}
		}
		System.out.println(m.getKey()+" is repeating  "+count+" times");
	}
}

@Test
//86 find the count of each number(by using map optimized)
public void optimizedOccurrence()
{
	String s="aaabbbccceeegggfff";
	String s1 = s.toLowerCase();
	LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
	for(int i=0; i<s1.length(); i++)
	{
		lhm.put(s1.charAt(i), i);
	}
	for(Entry<Character, Integer> m:lhm.entrySet())
	{
		int count=0;
		for(int i=0; i<s1.length(); i++) 
		{
			if(m.getKey()==s1.charAt(i))
			{
				count++;
				lhm.put(m.getKey(), count);
			}
		}
		System.out.println(m.getKey()+" is repeating  "+count+" times");
	}
}

@Test
//87 
public void checkString()
{
	String s1="hello";
	String s2 =new String("hello");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
}



@Test
//88 reverse each word in string
public void reverseEachWord()
{
	String str="my name is anusha";
	
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
//89write a program to find factorial of a number

public void factorilNumber()
{
	int fact=1;
	for(int i=1; i<=5; i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	
	
}

@Test
//90 count occurence of string "The grass is green"
public void OccurenceOfString()
{
	String s = "The grass is green";
	String [] str=s.split(" ");
	HashSet<String>hs=new HashSet<>();
	
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
//91 swap to number without using 3rd variable
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

//96 count each digit 12345
public void countEachDigit()
{
   
        int number = 12345;
        int[] digitCount = new int[10]; // Array to store the count of each digit

        // Convert the number to a string to iterate through its digits
        String numberStr = Integer.toString(number);

        // Iterate through each character in the string
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i); // Get the current character (digit)
            int digit = Character.getNumericValue(digitChar); // Convert character to integer

            // Increment the count for the current digit
            digitCount[digit]++;
        }

        // Display the count for each digit
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Digit " + i + " occurs " + digitCount[i] + " times.");
            }
        }
    }



@Test
//94 check the 2 string is anagram
public void checkAnagram()
{
  String str1 = "Race";
  String str2 = "Care";
  
  str1 = str1.toLowerCase();
  str2 = str2.toLowerCase();

  // check if length is same
  if(str1.length() == str2.length()) {

    // convert strings to char array
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();

    // sort the char array
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    // if sorted char arrays are same
    // then the string is anagram
    boolean result = Arrays.equals(charArray1, charArray2);

    if(result) {
      System.out.println(str1 + " and " + str2 + " are anagram.");
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
  
}

@Test
//95 pattern program
public void pattern()
{
	//dot
	int n=4;
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

//97pallindrome String madam

public void stringPallindrome()
{
	String str="madam";
	String rev="";
	for(int i=str.length()-1; i>=0; i--)
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


}











 
 


	

