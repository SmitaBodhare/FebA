package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
	
		

		WebElement all= driver.findElement(By.xpath("//select[contains(@aria-describedby,'se')]"));
		all.click();
		all.sendKeys("baby");
		all.click();
		WebElement mobile= driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobile.click();
		
	
		WebElement Samsung =driver.findElement(By.xpath("//span[text()='Samsung']"));
		boolean a= Samsung.isSelected();
		if(a==true)
		{
			System.out.println("dont click");
		}
		else
		{
			Samsung.click();
		}
		WebElement Anymob =driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][1]"));
		Anymob.click();
			WebElement here= driver.findElement(By.xpath("//a[text()='Start here.'][1]"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, 900)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -900)");
		Thread.sleep(5000);

		js.executeScript("arguments[0].scrollIntoView();", here);
		
	//	here.click();
		/*DateFormat formatdate =new SimpleDateFormat("YYYY-MM-dd HH-mm-ss-ms");
		
		Date SystemDate =new Date();
		for(int i=0;i<=2;i++) {
			
		String dateofSystem =formatdate.format(SystemDate);
		
		File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\pravin.bodhare\\Desktop\\X-PATH\\Image"+ i + ""+dateofSystem+".jpg");
		
		FileHandler.copy(Source, dest);
		
		}
		
		Actions u=new Actions(driver);
		u.moveToElement(mobile).click().build().perform();
		driver.navigate().back();
		
		WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));
		u.moveToElement(prime).click().build().perform();

		WebElement Primejoin=driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		u.moveToElement(Primejoin).click().build().perform();	
		
		
		*/
	}

}
