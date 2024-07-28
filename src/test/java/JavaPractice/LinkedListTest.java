package JavaPractice;

import java.util.LinkedList;

import org.testng.annotations.Test;

public class LinkedListTest {
	
	@Test
	public void linkedList()
	
	{
		LinkedList<Object> al=new LinkedList<>();
		
		al.add("arshad");
		al.add(null);
		al.add("collection");
		al.add(35);
		al.add("athar");
		al.add("king");
		for(Object i:al)
		{
			System.out.println(i);
		}
	}

}
