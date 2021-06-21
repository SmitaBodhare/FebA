package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement task;
	
	@FindBy(xpath="(//td[@class='pagetitle'])[1]")
	private WebElement opentask;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement user;
	
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement Report;
	
	@FindBy(xpath="//div[text()='Work Schedule']")
	private WebElement Workschedule;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void taskclick() {
		task.click();
	}
	public boolean isdiplaytask() {
		boolean a=opentask.isDisplayed();
		return a;
	}
	public void userclick() {
		user.click();
	}
	
	public void Reportclick() {
		Report.click();
	}
	
	public void Workclick() {
		Workschedule.click();
	}
	public void logout() {
		Logout.click();
	}
	
	
}
