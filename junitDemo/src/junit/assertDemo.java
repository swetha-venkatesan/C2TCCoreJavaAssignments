package junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class assertDemo {
	
	@Test
	public void TestForAssertEquals() {
		int actualResult=1;
		int ExpectedResult=1;
		
		assertEquals(actualResult,ExpectedResult);
		
	}
	@Test
	public void  TestForAssertTrue(){
//		assertTrue("swetha".contains("c"));
		assertTrue("swetha".contains("s"));
		
		
	}
	@Test
	public void testForAssertFalse() {
		
		assertFalse("swetha".contains("b"));
	}
	@Test
	public void testForNull()
	{
		String s = null;
		assertNull(s);
	}
	
	
	@Test
	public void failTest() {
		fail("it is suppose to fail");
	}
	

}
