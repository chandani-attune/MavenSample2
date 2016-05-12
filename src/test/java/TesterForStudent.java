

import org.junit.Assert;
import org.junit.Test;


public class TesterForStudent 
{
	
	Student obj=new Student();
	@Test
	public void mytest()
	{
		
		Assert.assertEquals(20, obj.countAvg(10, 10, 10));
		
	}
	

}
