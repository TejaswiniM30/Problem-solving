package advent;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Inverse2 {

	@Test
	void test() {
		assertEquals(6, Inverse_captcha_part_2.inverse2("1212"));
		assertEquals(0, Inverse_captcha_part_2.inverse2("1221"));
		assertEquals(4, Inverse_captcha_part_2.inverse2("123425"));
		assertEquals(12, Inverse_captcha_part_2.inverse2("123123"));
		assertEquals(4, Inverse_captcha_part_2.inverse2("12131415"));



	}

}
