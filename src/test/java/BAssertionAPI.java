import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BAssertionAPI {

	@Test
	public void test() {
		Assertions.assertTrue(5>1);
		Assertions.assertFalse(5<1);
		
		Assertions.assertEquals(true, 5>1);
		Assertions.assertNotEquals(true, 5<1);
		
		String str= null;
		Assertions.assertNull(str);
		
		int[]  a1  = {1,2};
		int[] a2 = {1,2};
		
		Assertions.assertArrayEquals(a1, a2);
		
	}
}
