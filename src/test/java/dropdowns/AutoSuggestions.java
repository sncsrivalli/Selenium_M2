package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("srivalli");
		List<WebElement> list = driver.findElements(By.xpath("//li[contains(.,'valli')]"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
		
		list.get(4).submit();
		Thread.sleep(2000);
		driver.quit();
	}
}
