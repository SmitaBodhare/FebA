package pack;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravin.bodhare\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List <WebElement> rowCount= driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(rowCount.size());
		for(int i=0;i<3;i++)
		{
		
			String v =rowCount.get(i).getText();
			System.out.print(v+" ");
		}
		System.out.println();
		for(int j=2;j<=7;j++)
		{
			List <WebElement> CellCount=driver.findElements(By.xpath("//table[@id='customers']//tr["+j+"]//td"));
			//System.out.println(CellCount.size());
			for(int i=0;i<3;i++)
			{
				String v =CellCount.get(i).getText();
				System.out.print(v+" ");
			}
			System.out.println();
		}*/
		
		/*driver.get("http://demo.guru99.com/test/table.html");
		
		List <WebElement> rowCount= driver.findElements(By.xpath("//table[@border='1']//tr"));
		System.out.println(rowCount.size());
		
		System.out.println();
		for(int j=1;j<6;j++)
		{
			List <WebElement> CellCount=driver.findElements(By.xpath("//table[@border='1']//tr["+j+"]//td"));
			int n=CellCount.size();
			for(int i=0;i<n;i++)
			{
				String v =CellCount.get(i).getText();
				System.out.print(v+" ");
			}
			System.out.println();
		}*/
		driver.get("https://www.freedomscientific.com/SurfsUp/Tables.htm");
		for(int i=0;i<=8;i++)
		{
			
				List<WebElement> rowcount =driver.findElements(By.xpath("//table[@border='1'][7]//tr["+i+"]//th"));
				int n=rowcount.size();
				for(int j=0;j<n;j++)
					{
						String v =rowcount.get(j).getText();
						System.out.print(v+" ");		
					}
			
		System.out.println();
		}
	}
}
