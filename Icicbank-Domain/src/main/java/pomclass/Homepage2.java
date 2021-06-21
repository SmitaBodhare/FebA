package pomclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage2 {

	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Miscellaneous']")
	private WebElement Miscellaneous ;
	
	@FindBy(xpath="//span[text()='Invest']")
	private WebElement Invest ;
	
	@FindBy(xpath="(//label[text()='Deposits'])[2]")
	private WebElement Deposits;
	
	@FindBy(xpath="(//a[text()='Fixed Deposit (FD)'])[2]")
	private WebElement FixedDeposit ;
	
	public Homepage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Miscellaneous () {
		Miscellaneous.click();	
	}
	
	public void Invest () {
		Actions s=new Actions(driver);
		s.moveToElement(Invest).perform();
	}
	
	public void Deposits () {
		Actions s=new Actions(driver);
		s.moveToElement(Deposits).perform();
	}
	public void FixedDeposit() {
		Actions s=new Actions(driver);
		s.moveToElement(FixedDeposit).click().build().perform();
	}
	
	
}
