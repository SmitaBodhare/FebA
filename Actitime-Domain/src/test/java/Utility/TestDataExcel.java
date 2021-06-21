package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataExcel {
	
	public static String data(int i,int j) throws EncryptedDocumentException, IOException
	{
		FileInputStream path=new FileInputStream("C:\\Users\\pravin.bodhare\\Desktop\\Sanjana-Xpath.xlsx");
		
		Sheet s=WorkbookFactory.create(path).getSheet("Sheet3");
		String data = null;
		
					Cell a= s.getRow(i).getCell(j);
		
					try
					{
						data=a.getStringCellValue()	;	
					}
					catch(IllegalStateException e)
					{
						double n= a.getNumericCellValue();
						data=String.valueOf(n);
					}
			
			return data;
		}	
		
	

}
