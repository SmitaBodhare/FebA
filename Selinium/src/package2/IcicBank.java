package package2;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class IcicBank {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.icicibank.com/");
		
		WebElement later = driver.findElement(By.xpath("//div[text()='Later'][1]")) ;
		Thread.sleep(3000);
		later.click();
		WebElement ACC = driver.findElement(By.xpath("//span[text()='Accounts']")) ;

		Actions s=new Actions(driver);
		s.moveToElement(ACC).perform();
		WebElement saving = driver.findElement(By.xpath("//label[text()='Savings Account']")) ;
		s.moveToElement(saving).perform();
		
		
		WebElement Frame = driver.findElement(By.xpath("//iframe[@scrolling='no'][1]")) ;
		driver.switchTo().frame(Frame);
		
		WebElement text = driver.findElement(By.xpath("//li[text()='Earn up to 10,000 additional reward points']")) ;
		String z=text.getText();
		System.out.println(z);
		
		WebElement apply = driver.findElement(By.xpath("//a[contains(@href,'applynow_btn&WT.mc_id=Desk_NLI_CC_Gindex_Cor')]")) ;
		Thread.sleep(6000);
		s.moveToElement(apply).click().build().perform();
		driver.navigate().back();
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 LocalDateTime g= java.time.LocalDateTime.now();
		String v= g.toString().replace(":", ".");
		File p =new File("C:\\Users\\pravin.bodhare\\Desktop\\X-PATH\\abc"+v+".jpg");
		
		FileHandler.copy(source, p);
		
		
		
		
		
		/*driver.switchTo().defaultContent();
		driver.switchTo().frame(Frame);
		WebElement know = driver.findElement(By.xpath("//a[contains(@href,'coral_hp_find_right_product_knowmore_btn')]")) ;
		Thread.sleep(8000);
		s.moveToElement(know).click().build().perform();	*/	
		
		
		
		
		
		//WebElement login = driver.findElement(By.xpath("//a[@id='login-btn']")) ;
		//login.click();
		
		
		
	}

}
