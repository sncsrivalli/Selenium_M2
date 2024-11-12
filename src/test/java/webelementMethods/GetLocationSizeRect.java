package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationSizeRect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signUpBTN = driver.findElement(By
				.xpath("//button[normalize-space(text()) = 'Sign up for GitHub']"));
		Point loc = signUpBTN.getLocation();
		System.out.println("X-coordinate: " + loc.getX());
		System.out.println("Y-coordinate: " + loc.getY());
		
		Dimension size = signUpBTN.getSize();
		System.out.println("Height: " + size.getHeight());
		System.out.println("Width: " + size.getWidth());
		
		Rectangle rect = signUpBTN.getRect();
		System.out.println("*********** From getRect() ************");
		System.out.println("X-coordinate: " + rect.getX());
		System.out.println("Y-coordinate: " + rect.getY());
		System.out.println("Height: " + rect.getHeight());
		System.out.println("Width: " + rect.getWidth());
		driver.quit();
	}

}
