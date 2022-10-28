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

}
