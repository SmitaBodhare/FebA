package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin {

	@FindBy(xpath="//input[@type='email']")
	private WebElement mobilenumber;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement AccoutSignin;
	
	public signin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AccoutSignin() {
		AccoutSignin.click();
	}
	public void mobilenumber(String a) {
		mobilenumber.sendKeys(a);
	}
	
	public void Continue() {
		Continue.click();
	}
	public void password(String b) {
		password.sendKeys(b);
	}
	public void signin() {
		signin.click();
	}
	
}
