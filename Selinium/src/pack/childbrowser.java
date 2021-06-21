package pack;

import java.util.ArrayList;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		WebElement createacc= driver.findElement(By.xpath("//a[text()='Create New Account']"));	
		createacc.click();
		
		Thread.sleep(3000);
		WebElement terms =driver.findElement(By.xpath("//a[@href='/legal/terms/update']"));
		WebElement Privacy =driver.findElement(By.xpath("//a[@id='privacy-link']"));
		WebElement cookie =driver.findElement(By.xpath("//a[@id='cookie-use-link']"));
		
	
		terms.click();
		Privacy.click();
		cookie.click();
		
		String mainpage=driver.getWindowHandle();
		//System.out.println(driver.getWindowHandle());
		
		ArrayList addr =new ArrayList(driver.getWindowHandles());
		System.out.println(mainpage);
		System.out.println(addr.get(0));
		System.out.println(addr.get(1));
		System.out.println(addr.get(2));
		System.out.println(addr.get(3));
		
		
		/*System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(addr.get(1));
		
		
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(addr.get(2));
		
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(addr.get(3));
		System.out.println(driver.getCurrentUrl());*/
	}

}
