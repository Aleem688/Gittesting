package DemoPac;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="my name is arshad";
		
		TreeSet<String> ts=new TreeSet<String>();
		String str1[]=str.split(" ");
		
		for(int i=0; i<str1.length; i++)
		{
			ts.add(str1[i]);
		}
		
		
		System.out.println(ts);
//		for(int i=str1.length-1; i>=0; i--)
//			
//		{
//			System.out.println(str1[i]);
//		}

	}

}
