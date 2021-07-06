import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		assertEquals(Calculator.add(2, 2),4);
	}

	@Test
	void testSubtract() {
		assertEquals(Calculator.subtract(4, 2),2);
	}

	@Test
	void testMult() {
		assertEquals(Calculator.mult(5, 2),10);
	}

	@Test
	void testDiv() {
		assertEquals(Calculator.div(6, 2),3);
	}

}
