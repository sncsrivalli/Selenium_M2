package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo = driver.findElement(By.cssSelector("svg#Layer_1"));
		if(logo.isDisplayed())
			System.out.println("Displayed");
		else
			System.out.println("Not Displayed");
		driver.quit();
	}

}
