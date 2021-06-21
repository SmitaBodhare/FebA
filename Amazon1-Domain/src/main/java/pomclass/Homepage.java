package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
WebDriver driver;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement account;
	
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement mobile;
	
	@FindBy(xpath="//a[text()='Best Sellers']")
	private WebElement BestSeller;
	
	@FindBy(xpath="//select[contains(@aria-describedby,'se')]")
	private WebElement All;
	
	@FindBy(xpath="//a[@id='nav-item-signout']")
	private WebElement logout;
	
	@FindBy(xpath="//a[text()='Health, Household & Personal Care']")
	private WebElement health;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void mobile() {
		mobile.click();
	}
	
	public void Health() {
		health.click();
	}
	public void BestSeller() {
		BestSeller.click();
	}
	
	public void logout() {
		Actions s=new Actions(driver);
		
		s.moveToElement(account).moveToElement(logout).click().build().perform();
	}
	
	
}
