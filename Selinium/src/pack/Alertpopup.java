package pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		
		WebElement Alert =driver.findElement(By.xpath("//button[text()='Click Me']"));
		Alert.click();
		Alert v=driver.switchTo().alert();
		v.accept();
		
		WebElement DuobleClick =driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions a=new Actions(driver);
		a.doubleClick(DuobleClick).perform();
		
		
		
				
		
//		driver.navigate().to("https://demoqa.com/alerts");
//		
//		WebElement button =driver.findElement(By.xpath("//button[@id='alertButton']"));
//		button.click();
//		Thread.sleep(3000);
//		Alert a= driver.switchTo().alert();
//		a.accept();
//		
//	//	WebElement timer5 =driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//		//timer5.click();
//	//	a.accept();
//		
//		WebElement confirmbutton =driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		confirmbutton.click();
//		Thread.sleep(3000);
//		a.accept();
//		confirmbutton.click();
//		Thread.sleep(3000);
//		a.dismiss();
//		
//		WebElement Prompotbox =driver.findElement(By.xpath("//button[@id='promtButton']"));
//		Prompotbox.click();
//		a.sendKeys("sanjana");
//		Thread.sleep(6000);
//		String h=a.getText();
//		System.out.println(h);
//		a.accept();
		
		
		
	}

}
