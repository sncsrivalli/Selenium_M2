package basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchUserDesiredBrowser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name: ");
		String browser = sc.next();
		WebDriver driver;

		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else 
			System.out.println("Invalid browser name");
	}
}
