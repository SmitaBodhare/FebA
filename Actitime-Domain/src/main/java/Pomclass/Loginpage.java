package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {


	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername(String a) {
		username.sendKeys(a);
	}
	
	public void password(String a) {
		password.sendKeys(a);
	}
	
	public void login() {
		login.click();
	}
	
	
	
}
