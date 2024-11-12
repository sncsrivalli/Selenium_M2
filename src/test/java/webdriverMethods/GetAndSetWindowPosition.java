package webdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetWindowPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Point actPoint = driver.manage().window().getPosition();
		System.out.println(actPoint);
		Thread.sleep(2000);
		
		Point reqPoint = new Point(500, 500);
		driver.manage().window().setPosition(reqPoint);
		Thread.sleep(2000);
		driver.close();
	}

}
