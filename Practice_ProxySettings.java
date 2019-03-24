package Test_001;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Practice_ProxySettings {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\afhqhyder\\Downloads\\java downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		String ManualProxy = "testhttpproxy:8081";
		Proxy pr = new Proxy();
		//1. To set the proxy as auto detect
		//pr.setProxyType(ProxyType.AUTODETECT);
		
		//2. If you want to set the proxy as "No Proxy" option, use DIRECT in proxytype
		//pr.setProxyType(ProxyType.DIRECT);
		
		//3. IF you want to set the system proxy settings, use below setting
		//pr.setProxyType(ProxyType.SYSTEM);
		
		//4. If you want to set the manual settings , use the following options
		pr.setProxyType(ProxyType.MANUAL);
		pr.setHttpProxy(ManualProxy);
		pr.setSslProxy(ManualProxy);
		pr.setFtpProxy(ManualProxy);
		pr.setSocksProxy(ManualProxy);
		pr.setSocksVersion(5);
		
		//pr.setProxyAutoconfigUrl("https://proxy.chercher.tech");
		//ChromeOptions options = new ChromeOptions();
		FirefoxOptions options = new FirefoxOptions();
		options.setProxy(pr);
		WebDriver driver = new FirefoxDriver(options);
		
	}

}
