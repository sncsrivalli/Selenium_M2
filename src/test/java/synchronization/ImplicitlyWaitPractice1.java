package synchronization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitPractice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
/* //h2[text()='Top restaurant chains in Hyderabad']/ancestor::div[@class='sc-fzQBhs jExwBk']
		/descendant::div[@class='sc-aXZVg kVQudY']		*/
		List<WebElement> topRestaurants = driver.findElements(By.xpath("//h2[text()='Top restaurant chains in Hyderabad']/ancestor::div[@class='sc-fzQBhs jExwBk']/descendant::div[@class='sc-aXZVg kVQudY']"));
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("************** Before Sorting ********************");
		for (WebElement restaurant : topRestaurants) {
			list.add(restaurant.getText());
			System.out.println(restaurant.getText());
		}
		
		Collections.sort(list);
		System.out.println("****************** After Sorting *********************");
		for (String string : list) {
			System.out.println(string);
		}
		driver.quit();
	}

}
