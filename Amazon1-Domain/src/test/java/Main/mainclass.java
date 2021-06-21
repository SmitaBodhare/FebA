package Main;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomclass.Homepage;
import pomclass.mobilepage;
import pomclass.signin;

public class mainclass {
	WebDriver driver;
	Homepage home;
	signin signin;
	SoftAssert soft= new SoftAssert();
	
	@BeforeTest
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
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
	public void bestseller() throws InterruptedException {
		home =new Homepage(driver);
		home.BestSeller();
		Thread.sleep(3000);
		String a=driver.getCurrentUrl();
		soft.assertEquals(a, "actfug");
	}
	@Test
	public void samsung() {
		home= new Homepage(driver);
		home.mobile();
		mobilepage v=new mobilepage(driver);
		v.samsungclick();
		v.min("5000");
		v.max("20000");
		v.anymob();
		ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
	//	soft.assertTrue(a);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		home =new Homepage(driver);
		home.logout();
	}
	
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
	
	
	
	
	
	}
