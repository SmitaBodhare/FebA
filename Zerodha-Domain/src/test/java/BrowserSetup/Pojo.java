package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {

	public static WebDriver openChromeBrowser() {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		return driver;
	}
	
	public static WebDriver openFireFoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browsers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		return driver;
	}
}
