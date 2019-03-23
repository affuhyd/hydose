package Test_001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("test hello");
		WebDriver driver;
		
		//1. Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\afhqhyder\\Downloads\\java downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.quit();
		
		//2. Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afhqhyder\\Downloads\\java downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
		
		/*//3. IE
		Thread.sleep(3000);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\afhqhyder\\Downloads\\java downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.close();*/
		
	/*	4. Opera
		5. Edge
		6. HTMLUnitDriver*/
		
	}

}
