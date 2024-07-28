package JavaPractice;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayListTest {
	
	@Test
	
	public void verifyArrayList()
	{
		List<Object> al=new ArrayList<Object>();
		
		al.add("arshadgasfhsjxkxjlksjkxlbhsb");
		al.add(null);
		al.add("qspider");
		al.add("testyantra");
		al.add("testyantra");
		al.add(27);
		al.add(" ");
		
		for(Object i:al)
		{
			System.out.println(i);
		}
		//System.out.println(al);
		
	}

}
