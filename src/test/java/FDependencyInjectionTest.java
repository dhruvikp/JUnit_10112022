import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class FDependencyInjectionTest {

	@Test
	@DisplayName("This is DisplayName for Test")
	public void test(TestInfo testInfo, TestReporter testReporter) {
		String displayName = testInfo.getDisplayName();
		testReporter.publishEntry("displayName", displayName);
	}
}
