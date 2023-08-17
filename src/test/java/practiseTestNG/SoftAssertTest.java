package practiseTestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void hardAssertTest()
	
	{
		System.out.println(".....step1.....");
		System.out.println(".....step2.....");
		System.out.println(".....step3.....");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("a","b");
		System.out.println(".....step4.....");
		System.out.println(".....step5.....");
		System.out.println(".....step6.....");
		sa.assertAll();
	}
	
	@Test
	
	public void demoTest()
	{
		System.out.println(".....step4.....");
		System.out.println(".....step5.....");
		
		int a=10;
		
		SoftAssert sa=new SoftAssert();
		sa.assertNull(a);
		
		System.out.println(".....step6.....");
		sa.assertAll();
	}

}
