package GENERIC_LIBRARY;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class common_utitlity {
	Select s;
	
	public int getRandomNumber()
	{
		Random r=new Random();
		return r.nextInt(1000);
	}
	public void totakeScreenshot(WebDriver driver,String name) {
		String path=FrameWorkConstants.screenshot_path+name+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(path);
		try {
			FileHandler.copy(src,trg);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}


public void acceptAlertPopup(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
		
public void dismissAlertPopup(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
	
}

public void selectDropdownByIndex(WebElement dropDown,int indexnum)
{
	s=new Select(dropDown);
	s.selectByIndex(indexnum);
}


public void selectDropdownByVisibleText(WebElement dropDown,String text)
{
	s=new Select(dropDown);
	s.selectByVisibleText(text);
}
	
public void selectDropdownByValue(WebElement dropDown,String value)
{
	s=new Select(dropDown);
	s.selectByValue(value);
}
}
	



