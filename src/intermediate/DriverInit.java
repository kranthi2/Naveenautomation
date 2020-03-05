package intermediate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	private static DriverInit Instance_Driver=null;
	 private static WebDriver driver;
	 
	 public DriverInit() {
		 
	 }
	 
	 public WebDriver openBrowser() {
		 driver= new ChromeDriver();
		 return driver;
	 }
	
	 public static DriverInit getInstance() {
		 if(Instance_Driver==null) {
			Instance_Driver = new DriverInit();
		 }
		 return Instance_Driver;
	 }
	 
	 
	 public static void main(String[] args) {
		DriverInit instanceDriver= DriverInit.getInstance();
		driver= instanceDriver.openBrowser();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
}
