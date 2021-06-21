package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshort {

	public static void screenshot(WebDriver driver) throws IOException {
		LocalDateTime v =java.time.LocalDateTime.now();
		
		
		File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		for(int i=1;i<=2;i++)
		{
		String W=v.toString().replace(":", ".");
		double Q=Math.random();
		
		File s= new File("C:\\Users\\pravin.bodhare\\Desktop\\X-PATH\\"+Q+" "+W+".jpg");
		
		FileHandler.copy(Source, s);
		}
	}

}
