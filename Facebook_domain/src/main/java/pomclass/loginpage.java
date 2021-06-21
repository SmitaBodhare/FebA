package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
 
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;
	
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendname(String a)
	{
		username.sendKeys(a);;
	}
	
	public void password(String a)
	{
		password.sendKeys(a);
	}
	
	public void login()
	{
		login.click();
	}
	
	
	
	
}
