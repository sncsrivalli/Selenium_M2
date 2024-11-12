package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributesTextPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='restaurants curated for biryani']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Pure veg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Less than 30 mins']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Balaji Dhaba Exclusive']")).click();
		Thread.sleep(2000);
		WebElement deliveryCharges = driver.findElement(By.xpath("//div[@class='sc-aXZVg fVWuLc']"));
		System.out.println(deliveryCharges.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
