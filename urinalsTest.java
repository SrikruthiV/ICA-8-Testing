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
		assertEquals(false, ob.validateString("1231"));
	}
	
	@Test
	void testValidate3()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== Validate String Third Test");
		assertEquals(true, ob.validateString("100011"));
	}
	
	@Test
	void testcountUrinals1()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== Count Urinals First Test");
		assertEquals(3, ob.countUrinals("10001"));
	}
	

	@Test
	void testcountUrinals2()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== Count Urinals Second Test");
		assertEquals(2, ob.countUrinals("0000"));
	}
	
	@Test
	void testcountUrinals3()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== Count Urinals Third Test");
		assertEquals(0, ob.countUrinals("1001"));
	}
	
	@Test
	void testcountUrinals4()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== Count Urinals Fourth Test");
		assertEquals(0, ob.countUrinals("011"));
	}
	
	@Test
	void testcountUrinals5()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== Count Urinals Fifth Test");
		assertEquals(-1, ob.countUrinals("011"));
	}
	
	@Test
	void testOpenFile()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== File Doesn't Exist Test");
		//assertEquals(null,ob.openFile("ABC.dat"));
	}
	
	@Test
	void testOpenFile2()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== File Empty Test");
		//assertEquals(null,ob.openFile("ABC.dat"));
	}
	
	@Test
	void testWriteFile()
	{
		urinal ob = new urinal();
		System.out.println("==== SRIKRUTHI VEDANTHAM ==== File Write Test");
		//assertEquals(0, ob.writeFile());
	}
	
	
	
	
}
