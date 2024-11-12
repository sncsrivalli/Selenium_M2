package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		
		Set<String> addresses = driver.getWindowHandles();
		for (String address : addresses) {
			driver.switchTo().window(address);
			if(driver.getCurrentUrl().contains("flipkart")) {
				driver.close();
				break;
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
