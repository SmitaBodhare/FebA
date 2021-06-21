package pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.seleniumhq.jetty9.util.preventers.DriverManagerLeakPreventer;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
			List<WebElement> listofElement = driver.findElements(By.xpath("//a[text()='Try it Yourself »' ]"));
			int size=listofElement.size();
			System.out.println(size);
			
		
			JavascriptExecutor js=((JavascriptExecutor)driver);
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0, 900)");
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0, -900)");
			Thread.sleep(5000);

			js.executeScript("arguments[0].scrollIntoView(true);", listofElement.get(2));
			Thread.sleep(3000);
			listofElement.get(2).click();
			
			
			
		listofElement.get(0).click();
		listofElement.get(1).click();
		listofElement.get(2).click();
		listofElement.get(3).click();
	 
	
		WebElement Alert =driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));
	 
		Alert.click();
		WebElement Confrim = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']"));
		Confrim.click();
		WebElement Prompt =driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']"));
		Prompt.click();
		WebElement linebreak =driver.findElement(By.xpath("//a[@href=\"tryit.asp?filename=tryjs_alert2\"]"));
		linebreak.click();
		
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(addr.get(0));
		System.out.println(addr.get(1));
		System.out.println(addr.get(2));
		System.out.println(addr.get(3));
		System.out.println(addr.get(4));
		
	//	System.out.println(driver.getCurrentUrl());
		
		
		//driver.switchTo().window(addr.get(4));
		//System.out.println(driver.getCurrentUrl());
		
		
	/*	WebElement frame1 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		WebElement tryit =driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		Alert p=driver.switchTo().alert();
		p.accept();
		
		driver.switchTo().window(addr.get(3));
		System.out.println(driver.getCurrentUrl());
		
		WebElement frame2 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));	
		driver.switchTo().frame(frame2);
		WebElement result =driver.findElement(By.xpath("//button[text()='Try it']"));
		result.click();
		Alert q=driver.switchTo().alert();
		q.accept();
		
		driver.switchTo().window(addr.get(2));
		System.out.println(driver.getCurrentUrl());
		
	    WebElement frame3 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame3);
		WebElement ans =driver.findElement(By.xpath("//button[text()='Try it']"));
		ans.click();
		Alert r=driver.switchTo().alert();
		r.accept();
		
        driver.switchTo().window(addr.get(1));
		System.out.println(driver.getCurrentUrl());
		WebElement frame4 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame4);
		WebElement response =driver.findElement(By.xpath("//button[text()='Try it']"));
		response.click();
		Alert v=driver.switchTo().alert();
		v.accept();
		ArrayList<WebElement> listoflink = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		//listoflink.get(0).click();
		for(int i=1;i<=10;i++) {
		listoflink.get(i).click();*/
		
		
	}

}
