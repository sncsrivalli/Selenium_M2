package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	@Test(groups = "smoke")
	public void demo1() {
		Reporter.log("Test2 - demo1 - smoke", true);
	}
	
	@Test(groups = "regression")
	public void demo2() {
		Reporter.log("Test2 - demo2 - regression", true);
	}
	
	@Test(groups = {"smoke", "regression"})
	public void demo3() {
		Reporter.log("Test2 - demo3 - smoke and regression", true);
	}
}
