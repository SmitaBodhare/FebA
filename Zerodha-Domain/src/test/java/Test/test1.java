package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
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

public class test1 extends Pojo{

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
	public void VerifyLoginpage() throws InterruptedException
	{
		driver.navigate().to("https://kite.zerodha.com/");
		 login=new Loginpage(driver);
		String Title=login.LoginTitle();
		Assert.assertEquals(Title, "Kite - Zerodha's fast and elegant flagship trading platform");
		boolean h=login.SendUserid("");
		Assert.assertTrue(h);
		login.SendUserid("");
		login.SendPassword("3");
		boolean a=login.LoginisEnable();
		Assert.assertTrue(a);
		login.ClickLogin();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://kite.zerodha.com/");
		login.SendPin("");
		login.ContinueToLogIn();
	
	}

	@AfterClass
	public void closebroser(){
		driver.close();
	}
	
	
	
	
	
	
	
	
}
