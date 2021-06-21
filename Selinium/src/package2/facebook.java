package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//upcasting
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement text = driver.findElement(By.xpath("//div[text()='Create a new account']"));
		text.getText();
		
		
	WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
	//name.sendKeys("sanjana");
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].value='sanjana';",name);
	WebElement sirname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
	//sirname.sendKeys("bodhare");
	js.executeScript("arguments[0].value='Bodhare';",sirname);
	String X=(String)js.executeScript("return arguments[0].value", sirname);
	System.out.println(X);
	WebElement mobileNo = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	mobileNo.sendKeys("9702966702"); 
	
	WebElement pw = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	pw.sendKeys("pqrs@123");
	
	WebElement date = driver.findElement(By.xpath("//select[contains(@aria-label,'ay')]"));
	Select s= new Select(date);
	s.selectByIndex(0);
	
	WebElement month  = driver.findElement(By.xpath("//select[contains(@aria-label,'ont')]"));
	Select p= new Select(month);

	p.selectByValue("6");
	
	WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select q= new Select(year);

	q.selectByVisibleText("1997");
	
	WebElement Custom = driver.findElement(By.xpath("//input[@value='-1']"));
	WebElement pronoun = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
	boolean j=pronoun.isDisplayed();
	System.out.println(j);
	
	if(j==true) {
	System.out.println("dont select");
	}
	else {
		Custom.click();
		Select x= new Select(pronoun);
		x.selectByValue("6");
	}
	//male=//label[text()='Male']
			
	//custom=//label[text()='Custom']
	
	//policy=//p[@class='_58mv']
	//WebElement signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
	//signup.click();
	
	//WebElement massenger = driver.findElement(By.xpath("//a[@href='https://messenger.com/']"));
	//massenger.click();
	
	//System.out.println(driver.getTitle());
	//driver.navigate();
	
	//WebElement facebookLite = driver.findElement(By.xpath("//a[contains(@title,' Lite')]"));
	//facebookLite.click();
	
	//lang + =//i[@class='img sp_Ydr5npncjzL sx_be9d52']
	}

}
