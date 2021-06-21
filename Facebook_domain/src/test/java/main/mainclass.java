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

public class mainclass {

	WebDriver driver;
	loginpage login;
	homepage home;
	
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
	
	@Test()
	public void bookmarks() throws InterruptedException {
		 home =new homepage(driver);
		home.bookmark();
		 Thread.sleep(2000);
		String a=driver.getCurrentUrl();
		Assert.assertEquals(a, "https://www.facebook.com/bookmarks");
	}
	
	@Test
	public void group() throws InterruptedException {
		 home =new homepage(driver);
		 home =new homepage(driver);
			home.group();
		    Thread.sleep(2000);
			String a=driver.getCurrentUrl();
			Assert.assertEquals(a, "https://www.facebook.com/groups/feed/");
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		 home =new homepage(driver);
		 home.account();
		 Thread.sleep(3000);
		 home.logout();
		// driver.close();
	}
	
}
