package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login-button")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@DataProvider
	public Object[][] loginData(){
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "standard_user";
		obj[0][1] = "secret_sauce";
		
		obj[1][0] = "locked_out_user";
		obj[1][1] = "secret_sauce";
		
		obj[2][0] = "problem_user";
		obj[2][1] = "sauce_demo";
		
		obj[3][0] = "performance_glitch_user";
		obj[3][1] = "secret_sauce";
		
		return obj;
	}
}
