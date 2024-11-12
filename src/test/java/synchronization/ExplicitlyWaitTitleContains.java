package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitTitleContains {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean status = wait.until(ExpectedConditions.titleContains("ShoppersStack"));
		System.out.println(status);
		
		driver.quit();
	}

}
