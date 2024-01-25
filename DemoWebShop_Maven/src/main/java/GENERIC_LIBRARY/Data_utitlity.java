package GENERIC_LIBRARY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_utitlity {
	
	public String getDataFromProperties(String key) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(FrameWorkConstants.properties_path);
		Properties pobj = new Properties();
		
		try {
			pobj.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String value = pobj.getProperty(key)

;
		return value;
	}
	
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(FrameWorkConstants.excel_path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh =book.getSheet(sheetName);
		
		String value=sh.getRow(rowNum).getCell(cellNum).toString();
		return value;
		
	}


public static Object[][] getAllDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException
{
	 FileInputStream fs=new FileInputStream(FrameWorkConstants.excel_path);
	 Workbook book = WorkbookFactory.create(fs);
	Sheet sh = book.getSheet(sheetName);
	
	int lastRowNum=sh.getPhysicalNumberOfRows();
	int lastCellNum=sh.getRow(0).getPhysicalNumberOfCells();
	 Object[][] arr=new Object[lastRowNum-1][lastCellNum];
	  
	 for(int i=1;i<lastRowNum;i++)
	 {
		 for(int j=0;j<lastCellNum;j++) {
			 arr[i-1][j]=sh.getRow(i).getCell(j).toString();
		 }
	 }
	 return arr;
}
}


