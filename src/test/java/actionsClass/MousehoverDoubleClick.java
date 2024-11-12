package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverDoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement coursetab = driver.findElement(By.id("course"));
		Actions action = new Actions(driver);
		action.moveToElement(coursetab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='Selenium']")).click();
		
		WebElement quantity = driver.findElement(By.id("quantity"));
		int initialValue = Integer.parseInt(quantity.getAttribute("value"));
		
		WebElement plusBTN = driver.findElement(By.id("add"));
		action.doubleClick(plusBTN).perform();
		
		int finalValue = Integer.parseInt(quantity.getAttribute("value"));
		
		if(initialValue+1 == finalValue)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.quit();
	}

}
