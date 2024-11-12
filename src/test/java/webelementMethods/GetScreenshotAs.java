package webelementMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshotAs {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement zomatoIMG = driver.findElement(By.cssSelector("div.sc-jHZirH.iuwMGI"));
		File temp = zomatoIMG.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/zomato.png");
		FileHandler.copy(temp, dest);
		
		driver.quit();
	}

}
