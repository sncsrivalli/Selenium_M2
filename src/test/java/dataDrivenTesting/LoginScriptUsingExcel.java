package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginScriptUsingExcel {

	public static void main(String[] args) throws InterruptedException {
		Map<String, String> map = readData();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(map.get("url"));
		
		long time = Long.parseLong(map.get("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("email")).sendKeys(map.get("username") + Keys.TAB + map.get("password") + Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static Map<String, String> readData() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet("Sheet1");
		
		DataFormatter df = new DataFormatter();
		Map<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i <= sheet.getLastRowNum(); i++) {
			String key = df.formatCellValue(sheet.getRow(i).getCell(0));
			String value = df.formatCellValue(sheet.getRow(i).getCell(1));
			map.put(key, value);
		}
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return map;
	}

}
