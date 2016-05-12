import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class StudentTestCase {

	Student ob=new Student();
	@Test
	public void testCountAvg() {
		Assert.assertEquals(10,ob.countAvg(10, 10, 10));
	}
	
	@Ignore("This is ignored intentionally")
	@Test
	public void testCountAvgIgnored() {
		Assert.assertEquals(20,ob.countAvg(10, 10, 10));
	}

	@Test
	public void testGetGrades() 
	{
		Assert.assertEquals("A",ob.getGrades(90) );		

	}

}
