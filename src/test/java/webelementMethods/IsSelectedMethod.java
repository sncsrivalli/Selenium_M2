package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create new account")).click();
		WebElement femaleRadioBTN = driver.findElement(By.xpath("//input[@value='1']"));
		femaleRadioBTN.click();
		if(femaleRadioBTN.isSelected())
			System.out.println("Selected");
		else
			System.out.println("Not Selected");
		
		driver.quit();
	}

}
