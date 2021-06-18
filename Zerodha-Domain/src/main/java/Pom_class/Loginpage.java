package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@label='User ID']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Continue;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String LoginTitle()
	{
		String Title=driver.getTitle();
		return Title;
	}
	
	public boolean SendUserid(String a)
	{
		boolean v=userid.isDisplayed();
		userid.sendKeys(a);
		return v;
	}
	
	public void SendPassword(String a)
	{
		password.sendKeys(a);
	}
	
	public boolean LoginisEnable()
	{
		boolean a=login.isEnabled();
		return a;
	}
	
	public void ClickLogin()
	{
		login.click();
	}
	public void SendPin(String a)
	{
		pin.sendKeys(a);
	}
	
	public void ContinueToLogIn()
	{
		Continue.click();
	}
	
	
	
	
	
	
}
