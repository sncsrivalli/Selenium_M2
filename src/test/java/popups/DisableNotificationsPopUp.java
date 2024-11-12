package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotificationsPopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--incognito");
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-geolocation");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		driver.quit();
	}

}
