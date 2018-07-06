package Day3_Questions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Spiral_memory_testcase {

	@Test
	void test() {
		assertEquals(0, Spiral_Memory.distance(5, 1));
		assertEquals(3, Spiral_Memory.distance(5, 12));
		assertEquals(2, Spiral_Memory.distance(5, 23));
		assertEquals(31, Spiral_Memory.distance(33, 1024));
	}

}
