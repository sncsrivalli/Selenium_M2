package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	@Test
	public void testMethod() {
		Reporter.log("@Test", true);
	}
}
