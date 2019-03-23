package Test_001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptLoadTimeOut_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\afhqhyder\\\\Downloads\\\\java downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		/* If you do not set the above script time out, the following error will occur with async script
		 * Test_001.ScriptLoadTimeOut_Practice.main(ScriptLoadTimeOut_Practice.java:16)
		 * 
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.location='https://www.facebook.com'");
		js.executeAsyncScript("window.location='https://www.facebook.com'");
		driver.quit();

	}

}
