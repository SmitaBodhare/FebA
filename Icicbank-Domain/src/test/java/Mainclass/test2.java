package Mainclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomclass.Homepage;
import pomclass.Homepage2;

public class test2 {

	WebDriver driver;
	Homepage Home;
	Homepage2 Home2;
	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.icicibank.com");
		Home=new Homepage(driver);
		Home.Later();
	}
	
//	@BeforeMethod
//	public void Aplicationlaunch() {
//		Home=new Homepage(driver);
//		Home.Later();
//	}
	
	@Test
	public void Miscellaneous() throws InterruptedException {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3100)");
		Home2=new Homepage2(driver);
		Home2.Miscellaneous();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		Assert.assertNotEquals(url, "ABSD");
	}
	
	@Test
	public void invest() {
		Home2=new Homepage2(driver);
		Home2.Invest();
		Home2.Deposits();
		Home2.FixedDeposit();
		String url=driver.getCurrentUrl();
		Assert.assertNotEquals(url, "ABCYhg");
	}

	@AfterMethod
	public void back()
	{
		driver.navigate().back();
	}
	
}
