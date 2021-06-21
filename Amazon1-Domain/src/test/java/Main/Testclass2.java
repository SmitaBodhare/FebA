package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomclass.Homepage;
import pomclass.mobilepage;
import pomclass.signin;

public class Testclass2 {

	WebDriver driver;
	Homepage home;
	signin signin;
	
	@BeforeTest
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void homepage()
	{
		 driver.get("https://www.amazon.in/");
		signin =new signin(driver);
		signin.AccoutSignin();
		signin.mobilenumber("9769782406");
		signin.Continue();
		signin.password("bodhare@123");
		signin.signin();
	}
	
	@Test
	public void Redmi() throws InterruptedException
	{
		home= new Homepage(driver);
		home.mobile();
		mobilepage v=new mobilepage(driver);
		boolean a=v.redmiclick();
		Assert.assertFalse(a);
	}
	
	@Test
	public void health() 
	{
		home= new Homepage(driver);
		home.Health();
		String a=driver.getTitle();
		Assert.assertEquals(a, "Amazon.in: Health & Personal Care");
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		home =new Homepage(driver);
		home.logout();
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
