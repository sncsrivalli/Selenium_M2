package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.className("_2iLD__")).click();
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		
		String parentHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Apple iPhone"))
				break;
		}
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentHandle);
		driver.navigate().refresh();
		String count = driver.findElement(By.className("ZuSA--")).getText();
		System.out.println(count);
		
		driver.quit();
	}

}
