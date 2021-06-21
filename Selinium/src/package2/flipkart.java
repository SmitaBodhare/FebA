package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		WebElement cancel =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		WebElement search =driver.findElement(By.xpath("//input[@name='q']"));
		search.click();
		search.sendKeys("mobile");
		WebElement click =driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		click.click();
		
		Thread.sleep(3000);
		WebElement brand =driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
		brand.click();
		brand.sendKeys("SAMSUNG");
		WebElement samsung =driver.findElement(By.xpath("//div[text()='SAMSUNG']"));
		samsung.click();
		
	/*	WebElement pricerange =driver.findElement(By.xpath("//div[@class='_3FdLqY']"));
		Actions s=new Actions(driver);
		WebElement uptothisrange =driver.findElement(By.xpath("//div[@class=\"_2TbXIJ\"][5]"));

		s.clickAndHold(pricerange).release(uptothisrange).build().perform();*/
		
		WebElement Popularity =driver.findElement(By.xpath("//div[text()='Popularity']"));
		Popularity.click();
		WebElement letestmob =driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy F41 (Fusion Green, 128 GB)']"));
		letestmob.click();
		
		
		
		
	}

}
