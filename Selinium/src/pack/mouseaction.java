package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
	WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
	WebElement draghere=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	
	Actions s= new Actions(driver);
	
	s.moveToElement(drag).click().build().perform();	
	s.dragAndDrop(drag, draghere).perform();
	
	
	
	
	
	}

}
