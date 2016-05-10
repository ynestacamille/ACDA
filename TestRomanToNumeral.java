public class TestRomanToNumeral {

	RomanToNumeral romanToNumeral = new RomanToNumeral();
	
	
	// on vérifie que I renvoie 1
	public void testI() {
		assertEquals(1, romanToNumeral.numeralFor("I"));
	}
	
	public void testV() {
		assertEquals(5, romanToNumeral.numeralFor("V"));
	}
	
	public void testVI() {
		assertEquals(6, romanToNumeral.numeralFor("VI"));
	}
}
