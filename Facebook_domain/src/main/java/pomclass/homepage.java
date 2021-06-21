package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
	@FindBy(xpath="//div[@aria-label='Account']")
	private WebElement account;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	@FindBy(xpath="//a[@aria-label='Watch']")
	private WebElement Watch;
	
	@FindBy(xpath="(//span[text()='Your watchlist'])[1]")
	private WebElement Watchlist;
	
	@FindBy(xpath="(//span[@class='l9j0dhe7'])[4]")
	private WebElement Group;
	
	@FindBy(xpath="//a[@aria-label='More']")
	private WebElement bookmark;
	
	@FindBy(xpath="//a[@aria-label='Marketplace']")
	private WebElement marketplace;
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bookmark() {
		bookmark.click();
	}
	
	public void group() {
		Group.click();
	}
	
	public void watch()
	{
		Watch.click();
	}
	public boolean isdisplayedwatchlist()
	{
		boolean a=Watchlist.isDisplayed();
		return a;
	}
	
	public void market()
	{
		marketplace.click();
	}
	
	public void account() {
		account.click();
	}
	
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		logout.click();
	}
	
	
	
	
	
	
	
}
