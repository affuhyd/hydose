package Test_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions_HeadlessBrowser {

	public static void main(String[] args) {
		String url = "http://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\afhqhyder\\\\Downloads\\\\java downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//1. Following option can be used to set headless setting.
		//options.addArguments("--headless");
		
		//2. The below option can also be used.
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("testuser");
		driver.findElement(By.id("pass")).sendKeys("testpass");
		System.out.println("Entered Username and password");
	}

}
