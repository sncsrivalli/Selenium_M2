package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("reset")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
