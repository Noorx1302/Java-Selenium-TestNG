package day11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	void testTitle()
	{
		String actualTitle = "OpenCart";
		String ExpectedTitle = "OpenCart";
		Assert.assertEquals(actualTitle, ExpectedTitle);
		
	}

}
