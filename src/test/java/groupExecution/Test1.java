package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test(groups = "smoke")
	public void demo1() {
		Reporter.log("Test1 - demo1 - smoke", true);
	}
	
	@Test(groups = "sanity")
	public void demo2() {
		Reporter.log("Test1 - demo2 - sanity", true);
	}
	
	@Test(groups = {"smoke", "sanity"})
	public void demo3() {
		Reporter.log("Test1 - demo3 - smoke and sanity", true);
	}
}
 