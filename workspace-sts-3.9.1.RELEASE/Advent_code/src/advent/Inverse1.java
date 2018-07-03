package advent;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Inverse1 {

	@Test
	void test() {
		Inverse_Captcha tester = new Inverse_Captcha();
		assertEquals(3, tester.inverse("1122"), "Result must be 3");
		assertEquals(4, tester.inverse("1111"), "Result must be 4");
		assertEquals(0, tester.inverse("1234"), "Result must be 0");
		assertEquals(9, tester.inverse("91212129"), "Result must be 9");
		
		
		
	}

}
