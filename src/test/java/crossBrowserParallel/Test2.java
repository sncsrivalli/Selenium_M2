package crossBrowserParallel;

import org.testng.annotations.Test;

public class Test2 extends BaseClass{

	@Test
	public void swiggyTest() {
		driver.get("https://www.swiggy.com/");
	}
}
