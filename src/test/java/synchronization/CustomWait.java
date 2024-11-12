package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebElement header = null;
		int count = 0;
		while(count < 20) {
			try {
				header = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
				break;
			}catch(NoSuchElementException e) {
				count++;
				Thread.sleep(1000);
			}
		}
		System.out.println(header.getText());
		driver.quit();
	}
}
