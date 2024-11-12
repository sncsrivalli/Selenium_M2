package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementUsingElementRef {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement blockbusterDeals = driver.findElement(
				By.xpath("//div[@class='dcl-container-inner' and contains(.,'Blockbuster Deals | Ends Oct 29')]"));
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", blockbusterDeals);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
