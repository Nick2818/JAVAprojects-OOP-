import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {

	//declare custom string for testing
	CustomString myCustomString;

	@BeforeEach
	public void setUp() throws Exception {
		//initialize custom string for testing
		this.myCustomString = new CustomString();
	}

	@Test
	void testGetString() {
		
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());
		
		this.myCustomString.setString("hello");
		assertEquals("hello", this.myCustomString.getString());
		
		// TODO write at least 3 additional test cases 

		//replace string
		this.myCustomString.setString("good");

		//string should be changed
		assertNotEquals("hello", this.myCustomString.getString());

		//string should have the replaced value
		assertEquals("good", this.myCustomString.getString());

		//replace string
		this.myCustomString.setString("niky");

		//string should be changed
		assertNotEquals("good", this.myCustomString.getString());

		//string should have the replaced value
		assertEquals("niky", this.myCustomString.getString());

	}
	
	@Test
	void testSetString() {
		
		//string should be null to start, before setting it
		assertNull(this.myCustomString.getString());

		this.myCustomString.setString("Good-bye!");
		assertEquals("Good-bye!", this.myCustomString.getString());

		// TODO write at least 3 additional test cases 

		//set new value of string
		this.myCustomString.setString("Hello!");

		assertNotEquals("Good-bye!", this.myCustomString.getString());

		assertEquals("Hello!", this.myCustomString.getString());

		this.myCustomString.setString("Bye!");

		assertNotEquals("Hello!", this.myCustomString.getString());

		assertEquals("Bye!", this.myCustomString.getString());
	}
	
	@Test
	void testRemove() {
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.remove(""));
		
		this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
		assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));
		
		// TODO write at least 3 additional test cases 

		this.myCustomString.setString("Hello, everyone!");

		assertNotEquals("Hello, everyone!",this.myCustomString.remove("l28"));

		assertEquals("Heo, everyone!",this.myCustomString.remove("l28"));

		this.myCustomString.setString("Good-morning, everyone!");

		assertNotEquals("Good-morning, everyone!",this.myCustomString.remove("o26#"));

		assertEquals("Gd-mrning, everyne!",this.myCustomString.remove("o26#"));


	}

	@Test
	void testReverse() {
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.reverse(""));
		
		this.myCustomString.setString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
		
		// TODO write at least 3 additional test cases 

		this.myCustomString.setString("bunaziua");
		assertNotEquals("buanziua", this.myCustomString.reverse("b2897#@!"));
		assertEquals("Bunaziua", this.myCustomString.reverse("b2897#@!"));

		this.myCustomString.setString("Bunaziua");
		assertNotEquals("Bunaziua", this.myCustomString.reverse("b2897#@!"));
		assertEquals("bunaziua", this.myCustomString.reverse("b2897#@!"));
	}

	@Test
	void testFilterLetters() {
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		this.myCustomString.setString(null);
		assertEquals("", this.myCustomString.filterLetters('E', false));
		
		// TODO write at least 3 additional test cases 

		this.myCustomString.setString("Hello 90, bye 2");

		assertNotEquals("Hello 90, bye 2", this.myCustomString.filterLetters('h', false));

		assertEquals("llo 90, y 2", this.myCustomString.filterLetters('h', false));

		this.myCustomString.setString("Abcdefg");

		assertNotEquals("Abcdefg", this.myCustomString.filterLetters('c', true));

		assertEquals("Ab", this.myCustomString.filterLetters('c', true));


	}

}