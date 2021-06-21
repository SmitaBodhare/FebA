package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Later'][1]")
	private WebElement Later ;
	
	@FindBy(xpath="//span[text()='Accounts']")
	private WebElement Accounts ;

	@FindBy(xpath="//label[text()='Savings Account']")
	private WebElement SavingsAccount ;
	
	@FindBy(xpath="//img[@alt='Insta Save Account']")
	private WebElement InstaSaveAccount;
	
	@FindBy(xpath="//span[text()='Loans']")
	private WebElement Loans;
	
	@FindBy(xpath="//label[text()='Popular Loans']")
	private WebElement PopularLoans;
	
	@FindBy(xpath="//a[text()=' Personal Loans']")
	private WebElement PersonalsLoans;
	
	public Homepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Later() {
		Later.click();

	}
	public void Account() {
		Actions s=new Actions(driver);
		s.moveToElement(Accounts).perform();
	}
	public void SavingsAccount() {
		Actions s=new Actions(driver);
		s.moveToElement(SavingsAccount).perform();
	}
	
	public void InstaSaveAccount() {
		Actions s=new Actions(driver);
		s.moveToElement(InstaSaveAccount).click().build().perform();
	}
	
	public void Loans() {
		Actions s=new Actions(driver);
		s.moveToElement(Loans).perform();
	}
	
	public void PopularLoans () {
		Actions s=new Actions(driver);
		s.moveToElement(PopularLoans).perform();
	}
	
	public void PersonalsLoans() {
		Actions s=new Actions(driver);
		s.moveToElement(PersonalsLoans).click().build().perform();;
	}
}
