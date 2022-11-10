import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ALifeCycleTest {

	@BeforeAll
	public static void initAll() {
		System.out.println("BeforeAll method invoked!");
	}

	@BeforeEach
	public void initEach() {
		System.out.println("Before Each method invoked!");
	}

	@Test
	public void test1() {
		System.out.println("This is test1");
	}

	@Test
	public void test2() {
		System.out.println("This is test2");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("After Each method is invoked!");
	}

	@AfterAll
	public static void destroyAll() {
		System.out.println("DestroyAll method invoked!");
	}

}
