package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");

		driver.findElement(By.name("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();

		driver.findElement(By.xpath("//span[text()='Courses']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space(text())='Category']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space(text())='New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("RPA");
		driver.findElement(By.name("add")).click();
		Thread.sleep(2000);
		List<WebElement> categories = driver.findElements(By.className("sorting_1"));
		for (WebElement category : categories) {
			if (category.getText().equals("RPA")) {
				driver.findElement(By.xpath(
						"//td[text()='" + category.getText() 
						+ "']/following-sibling::td/button[text()=' Delete']"))
						.click();
				Thread.sleep(2000);
				driver.findElement(By.name("delete")).click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
