package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BrowserSetup.Pojo;
import Pom_class.Homepage;
import Pom_class.Loginpage;

public class test2 extends Pojo{

	WebDriver driver;
	Homepage Home;
	Loginpage login;
	int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	@BeforeTest
	@Parameters("browser")
	public void LaunchBrowser(String browser)throws Exception {
		reporter=new ExtentHtmlReporter("test-output//ExtendReport//Extent.html");
		ExtentReports extend =new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver= openChromeBrowser();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver= openFireFoxBrowser() ;
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void LaunchApp() throws InterruptedException {
		driver.navigate().to("https://kite.zerodha.com/");
		 login=new Loginpage(driver);
		login.SendUserid("JN9191");
		login.SendPassword("Shubhu@143");
		login.ClickLogin();
		Thread.sleep(3000);
		login.SendPin("898354");
		login.ContinueToLogIn();
	
		Thread.sleep(3000);
		Home = new Homepage(driver);
		Home.SendSharesInSearchTab("SBI");
		Thread.sleep(3000);
		Home.SearchElement();
		boolean h=Home.SelectIntraday();
		Assert.assertFalse(h);
		Home.SelectIntraday();
		Home.SelectQuntity("5");
		Thread.sleep(3000);

		Home.SelectStoploss();
		Home.SelectTriggerPrice("280");
		Assert.fail();
	}
	@AfterClass
	public void closebroser(){
		driver.close();
	}
	
	
}
