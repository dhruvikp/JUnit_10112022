import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GDynamicDemoTest {

	Calculator c;

	@BeforeEach
	void init() {
		c = new Calculator();
	}

	@TestFactory
	public Collection<DynamicTest> testCalculate() {
		Collection<DynamicTest> dynamicTests = new ArrayList<DynamicTest>();

		dynamicTests.add(DynamicTest.dynamicTest("Calculate when both agrument positive", () -> {
			Assertions.assertEquals(2, c.calculate(1, 1));
		}));
		
			
		dynamicTests.add(DynamicTest.dynamicTest("Calculate when one is input positive, and another isnegative", () -> {
			Assertions.assertEquals(0, c.calculate(1, -1));
		}));
		
		dynamicTests.add(DynamicTest.dynamicTest("Calculate when both arguments are negative", () -> {
			Assertions.assertEquals(-2, c.calculate(-1, -1));
		}));
		
		return dynamicTests;
	}
}
