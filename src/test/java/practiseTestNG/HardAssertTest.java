package practiseTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
	
	@Test
	public void hardAssertTest()
	
	{
		System.out.println(".....step1.....");
		System.out.println(".....step2.....");
		System.out.println(".....step3.....");
		
		Assert.assertEquals("a","b");
		System.out.println(".....step4.....");
		System.out.println(".....step5.....");
		System.out.println(".....step6.....");
	}
	
	@Test
	
	public void demoTest()
	{
		System.out.println(".....step4.....");
		System.out.println(".....step5.....");
		
		int a=10;
		Assert.assertNull(a);
		System.out.println(".....step6.....");
	}

}
