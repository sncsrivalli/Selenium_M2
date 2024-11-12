package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://in.bookmyshow.com/");
		
		System.out.println("Current Window Address: "+ driver.getWindowHandle());
		
		Set<String> addresses = driver.getWindowHandles();
		for (String s : addresses) {
			System.out.println(s);
		}
		
		driver.quit();
	}

}
