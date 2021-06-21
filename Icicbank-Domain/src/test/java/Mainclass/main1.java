package Mainclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomclass.Homepage;

public class main1 {

	WebDriver driver;
	Homepage Home;
	@BeforeClass
	public void browserlaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
	}
	
	@BeforeTest
	public void Aplicationlaunch() {
		driver =new ChromeDriver();
		driver.get("https://www.icicibank.com");
		Home=new Homepage(driver);
		Home.Later();
	}
	
	@Test
	public void InstasavingAccount(){
		Home=new Homepage(driver);
		driver.manage().window().maximize();
		Home.Account();
		Home.SavingsAccount();
		Home.InstaSaveAccount();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.icicibank.com/Personal-Banking/account-deposit/savings-account/insta-save-account.page");
		
	}
	
	@Test
	public void PersonalsLoans() {
		Home=new Homepage(driver);
		Home.Loans();
		Home.PopularLoans();
		Home.PersonalsLoans();
		
		String titel=driver.getTitle();
		System.out.println(titel);
		Assert.assertNotEquals(titel, "ABSCh");
	}
	
	@AfterMethod
	public void closetab() {
		driver.close();
	}
	
	
	
	
	
	
}
