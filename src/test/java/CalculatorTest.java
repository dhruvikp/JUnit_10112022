import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CalculatorTest {
	Calculator c;

	@BeforeEach
	void initEach() {
		this.c = new Calculator();
	}

	@Test
	@DisplayName("test calculate method when both inputs positive")
	public void test_calculate_when_both_arg_postive() {

		// STEP 1 : Prepare Input
		int a = 1;
		int b = 1;

		// STEP 2: Get actual value
		int actual = c.calculate(a, b);

		// STEP 3: Prepare expected value
		int expected = 2;

		// STEP 4 : Match expectations
		Assertions.assertEquals(expected, actual);
	}

	@Test
	@DisplayName("test calculate method when one is positive and another is zero")
	public void test2() {
		Assertions.assertEquals(0, c.calculate(-1, 1));
	}

}
