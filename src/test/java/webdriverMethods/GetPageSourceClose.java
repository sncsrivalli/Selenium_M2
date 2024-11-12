package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSourceClose {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close();
	}

}
