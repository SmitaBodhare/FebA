package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomclass.homepage;
import pomclass.loginpage;

public class test2 {
	WebDriver driver;
	homepage home;
	loginpage login;
	
	@BeforeTest
	public void beforeclass() {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver(options);
	}
	
	@BeforeMethod
	public void login() {
		driver.get("https://en-gb.facebook.com/");
		 login =new loginpage(driver);
		 login.sendname("shubhampatil4584@gmail.com");
		 login.password("Shree007");
		 login.login();
	}
	
	@Test
	public void watch() throws InterruptedException {
		home=new homepage(driver);
		home.watch();
		Thread.sleep(3000);
		String w=driver.getCurrentUrl();
		Assert.assertEquals(w, "https://www.facebook.com/watch");
		boolean a=home.isdisplayedwatchlist();
		Assert.assertTrue(a);
	}
	
	@Test
	public void market() throws InterruptedException {
		home =new homepage(driver);
		home.market();
		Thread.sleep(3000);
		String m=driver.getCurrentUrl();
		Assert.assertEquals(m, "https://www.facebook.com/marketplace/?ref=app_tab");
	}
	
	
	@AfterMethod
	public void logout() throws InterruptedException {
		 home =new homepage(driver);
		 home.account();
		 Thread.sleep(3000);
		 home.logout();
	}
}
