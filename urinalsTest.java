import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class urinalsTest {

	@Test
	void testValidate()
	{
		urinal obj = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== Validate String First Test");
		assertEquals(false, obj.validateString("1011"));
	}
	
	@Test
	void testValidate2()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== Validate String Second Test");
		assertEquals(false, ob.validateString("1023"));
	}

}
