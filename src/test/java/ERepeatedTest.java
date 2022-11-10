import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ERepeatedTest {

	Calculator c;

	@BeforeEach
	public void initEach() {
		c = new Calculator();
	}
	
	@Test
	@RepeatedTest(1000)
	public void test() {
		
		
		Assertions.assertEquals(2, c.calculate(1, 1));
	}
}
