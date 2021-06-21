package package2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		WebElement ok=driver.findElement(By.xpath("//button[text()='OK']"));
		ok.click();
		System.out.println(driver.getCurrentUrl());
		//WebElement menu =driver.findElement(By.xpath("//i[@class='fa fa-align-justify'][1]"));
		//menu.click();
		
		Actions a=new Actions(driver);
		
		//WebElement holiday =driver.findElement(By.xpath("//a[@aria-label='Menu Holiday']"));
		WebDriverWait wait=new WebDriverWait(driver,15);
		WebElement holiday =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label='Menu Holiday']")));
		a.moveToElement(holiday).perform();
		Thread.sleep(3000);
		WebElement SpecialTrains  =driver.findElement(By.xpath("//span[text()='Special Trains'][1]"));
		a.moveToElement(SpecialTrains).perform();	
		
		WebElement Toristtrain  =driver.findElement(By.xpath("//span[text()='Tourist Train'][1]"));
		a.moveToElement(Toristtrain).click().build().perform();
		Thread.sleep(6000);
		
		WebElement Hotel  =driver.findElement(By.xpath("//a[text()=' HOTELS ']"));
		Hotel.click();
		
		ArrayList<String> main= new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(main.get(0));
		
		driver.switchTo().window(main.get(1));

		WebElement ok2=driver.findElement(By.xpath("//button[text()='Ok']"));
		
		ok2.click();
		
		WebElement Cityname =driver.findElement(By.xpath("//input[@placeholder='Enter hotel name or city name']"));
		Cityname.sendKeys("mumbai");
	}

}
