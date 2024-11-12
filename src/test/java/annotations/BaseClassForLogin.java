package annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.LoginPage;

public class BaseClassForLogin {
	
	protected WebDriver driver;
	protected LoginPage login;
	
	@BeforeClass
	public void classSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void methodsetup() {
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		login = new LoginPage(driver);
	}
	
	@AfterMethod
	public void methodTeardown() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void classteardown() {
		driver.quit();
	}
}
