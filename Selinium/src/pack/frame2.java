package pack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe");
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='interactive']"));
		driver.switchTo().frame(frame1);
		
		WebElement frame2=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame2);
		
		WebElement zoomin =driver.findElement(By.xpath("//a[@title='Zoom in']"));
		zoomin.click();
		zoomin.click();
		WebElement zoomout=driver.findElement(By.xpath("//a[@title='Zoom out']"));
		zoomout.click();
		
		
		
		
		
		
		
		
		/*driver.get("https://demoqa.com/nestedframes");
		
		WebElement f1 =driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(f1);
		WebElement text1 =driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(text1.getText());
		
		
		WebElement f2 =driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]"));
		driver.switchTo().frame(f2);
		WebElement text2 =driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(text2.getText());
		
		driver.switchTo().parentFrame();
		System.out.println(text1.getText());*/
		
		
		/*driver.get("https://demoqa.com/frames");
		
		WebElement frame1 =driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(frame1);
		WebElement text1 =driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"][1]"));
		System.out.println(text1.getText());
		
		driver.switchTo().defaultContent();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		
		WebElement frame2 =driver.findElement(By.xpath("//iframe[@id=\'frame2\']"));
		driver.switchTo().frame(frame2);
		WebElement text2 =driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"][1]"));
		System.out.println(text2.getText());*/
	}

}
