package grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("hfguyhjgkjhkjhkjn");
		driver.findElement(By.name("pass")).sendKeys("hgiukjlk4524521");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
