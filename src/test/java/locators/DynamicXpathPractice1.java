package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.className("_2iLD__")).click();

		List<WebElement> mobiles = driver.findElements(By.className("KzDlHZ"));
		Thread.sleep(2000);

		for (WebElement mobile : mobiles) {
			String name = mobile.getText();
			WebElement price = driver.findElement(By.xpath("//div[text()='" + name
					+ "']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
			System.out.println(name + "\t" + price.getText());
		}

		Thread.sleep(2000);
		driver.quit();
	}

}
