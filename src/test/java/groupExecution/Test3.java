package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

	@Test(groups = "regression")
	public void demo1() {
		Reporter.log("Test3 - demo1 - regression", true);
	}
	
	@Test(groups = "sanity")
	public void demo2() {
		Reporter.log("Test3 - demo2 - sanity", true);
	}
	
	@Test(groups = {"regression", "sanity"})
	public void demo3() {
		Reporter.log("Test3 - demo3 - regression and sanity", true);
	}
}
