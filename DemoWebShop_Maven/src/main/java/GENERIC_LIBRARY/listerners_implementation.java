package GENERIC_LIBRARY;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listerners_implementation implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)Base_Test.listernersDriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/"+result.getName()+".png");
		try {
			FileHandler.copy(src, trg);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
}
