package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextTagNameAttributeCssValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginBTN = driver.findElement(By.name("login"));
		System.out.println("Text on the Element: " + loginBTN.getText());
		System.out.println("Tag name of the element: " + loginBTN.getTagName());
		System.out.println("Get Attribute: " + loginBTN.getAttribute("data-testid"));
		System.out.println("Font: " + loginBTN.getCssValue("font"));
		System.out.println("Background color: " + loginBTN.getCssValue("background-color"));
		System.out.println("Color: " + loginBTN.getCssValue("color"));
		
		driver.quit();
	}

}
