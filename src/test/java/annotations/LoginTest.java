package annotations;

import org.testng.annotations.Test;

public class LoginTest extends BaseClassForLogin {

	@Test
	public void loginTest() {
		login.setEmail("admin");
		login.setPassword("admin");
		login.clickKeepMeLoggedIn();
		login.clickLogin();
	}
}
