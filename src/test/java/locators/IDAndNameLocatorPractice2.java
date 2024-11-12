package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDAndNameLocatorPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.name("field-keywords")).sendKeys("wallets");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
