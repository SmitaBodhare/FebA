package Pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	@FindBy(xpath="//input[@id='search-input']")
	private WebElement Searchtab;
	
	@FindBy(xpath="(//li[@class='search-result-item'])[1]")
	private WebElement SearchElement;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	private WebElement Quntity;
	
	@FindBy(xpath="//label[text()='Intraday ']")
	private WebElement Indraday;

	@FindBy(xpath="//button[text()='B ']")
	private WebElement Buy;
	
	@FindBy(xpath="//label[text()='SL']")
	private WebElement Stoploss;
	
	@FindBy(xpath="//input[@label=\"Trigger price\"]")
	private WebElement TriggerPrice;
	
	
	public Homepage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SendSharesInSearchTab(String a)
	{
		Searchtab.sendKeys(a);
	}
	public void SearchElement()
	{
		Actions a=new Actions(driver);
		a.moveToElement(SearchElement).perform();
		a.moveToElement(Buy).click().build().perform();
	}
	public boolean SelectIntraday()
	{
		Indraday.click();
		boolean v=Indraday.isSelected();
		return v;
	}
	
	public boolean SelectQuntity(String a)
	{
		boolean v=Quntity.isDisplayed();
		Quntity.sendKeys(a);
		return v;
	}
	
	public void SelectStoploss() throws InterruptedException
	{
		Thread.sleep(3000);
		Stoploss.click();
	}
	
	public void SelectTriggerPrice(String a) throws InterruptedException
	{
		TriggerPrice.clear();
		Thread.sleep(3000);
		TriggerPrice.sendKeys(a);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
