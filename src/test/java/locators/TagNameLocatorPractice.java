package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
