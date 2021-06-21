package pomclass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobilepage {
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Samsung']")
	private WebElement Samsung;
	
	@FindBy(xpath="//span[text()='Redmi']")
	private WebElement Redmi;
	
	@FindBy(xpath="//img[@data-image-index='9']")
	private WebElement Anymob;
	
	@FindBy(xpath="//input[@name='low-price']")
	private WebElement min;
	
	@FindBy(xpath="//input[@name='high-price']")
	private WebElement max;
	
	@FindBy(xpath="//span[@class='a-size-large product-title-word-break']")
	private WebElement mobileTitle;
	
	public mobilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void samsungclick() {
	boolean a=Samsung.isSelected();
		if(a==false) {
			Samsung.click();
		}
		else {
			System.out.println("selected");
		}
	}
	public void anymob() {
		Anymob.click();
	}
	
	public void min(String a) {
		min.sendKeys(a);
	}
	
	public void max(String b) {
		max.sendKeys(b);
	}
	
	public boolean redmiclick() throws InterruptedException {
		Redmi.click();
		Thread.sleep(3000);
		boolean a=Redmi.isSelected();
		return a;
		}
}
