package listenerPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listenerPractice.ListenerImplementation.class)
public class TestClass extends BaseClass {

	@Test
	public void testMethod1() {
		Reporter.log("@Test1", true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "testMethod1")
	public void testMethod2() {
		Reporter.log("@Test2", true);
	}
}
