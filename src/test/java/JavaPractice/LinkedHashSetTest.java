package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class LinkedHashSetTest {
	
	@Test
	public void linkedHashSet()
	{
	//LinkedHashSet<Object> al=new LinkedHashSetTest();	
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(56);
		//al.add(null);
		//al.add(23);
		al.add(12);
		//al.add(null);
		al.add(15);
		//Collections.sort(al,Collections.reverseOrder());
		Collections.reverse(al);
		System.out.println(al);
		
	}

}
