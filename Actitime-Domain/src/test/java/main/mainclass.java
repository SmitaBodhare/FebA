package main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BrwoserSetup.Pojo;
import Pomclass.Home;
import Pomclass.Loginpage;
import Utility.TakesScreenShot;

public class mainclass extends Pojo{

	WebDriver driver;
	Home home;
	@BeforeTest
	@Parameters("browser")
	public void LaunchApp(String browser)throws Exception {
		System.out.println("Best Test");
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
	
	@BeforeMethod
	public void beforemethod() 
	{   driver.navigate().to("http://localhost:8080/login.do");
		Loginpage a= new Loginpage(driver);
		 a.sendusername("admin");
		 a.password("manager");
		 a.login();
	}
	
	@Test
	public void verifytask() throws InterruptedException, IOException 
	{
		home=new Home(driver);
		 Thread.sleep(3000);
		 home.taskclick();
		TakesScreenShot.screenshot(driver);
		String c= driver.getCurrentUrl();
		System.out.println(c);
		Assert.assertEquals(c,"http://localhost:8080/tasks/otasklist.do");
		boolean p=home.isdiplaytask();
		Assert.assertTrue(p);
		
	}
	
	@Test
	public void verifyuser()
	{
		home=new Home(driver);
		home.userclick();
		String c= driver.getCurrentUrl();
		System.out.println(c);
		Assert.assertEquals(c, "http://localhost:8080/administration/userlist.do");
	}
	
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{	
		Thread.sleep(3000);
		home=new Home(driver);
		home.logout();
	}
	
	@AfterClass()
	public void afterclass()
	{
		driver.close();
	}
	

}
