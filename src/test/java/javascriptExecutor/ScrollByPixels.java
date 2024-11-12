package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixels {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0, -2000)");
		Thread.sleep(2000);
		driver.quit();
	}

}
