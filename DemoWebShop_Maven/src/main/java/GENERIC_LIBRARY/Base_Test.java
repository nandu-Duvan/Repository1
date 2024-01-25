package GENERIC_LIBRARY;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Element_repository.Home_Page;
import Element_repository.Login_Page;

public class Base_Test {
	public Data_utitlity data_utility=new Data_utitlity();
	public common_utitlity common_utility=new common_utitlity();
	public WebDriver driver;
	public static WebDriver listernersDriver;
	Home_Page home_page;

	@Parameters("Browser")
	@BeforeClass(alwaysRun=true)
	public void launchbrowser(@Optional("Chrome")String  browserName) throws FileNotFoundException
	{
		if(browserName.equals("Chrome"))
		{
			driver=new ChromeDriver();

		}
		else if(browserName.equals("Edge"))
		{
			driver=new EdgeDriver();

		}
		else
		{
			System.out.println("enter valid browser name");
		}
		listernersDriver=driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(data_utility.getDataFromProperties("url"));
	}

	@BeforeMethod
	public void login()
	{
		//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		//		driver.findElement(By.cssSelector("[id=\"email\"]")).sendKeys("pooja.bs@gmail.com");
		//		driver.findElement(By.cssSelector("[id=\"Password\"]")).sendKeys("Pooja@123");
		//		
		//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		home_page=new Home_Page(driver);
		home_page.getLogin().click();
		Login_Page loginPage=new Login_Page(driver);
		loginPage.getEmailtextfield().sendKeys("adi@gmail.com");
		loginPage.getPasswordtextfield().sendKeys("adi@123");
		loginPage.getLogin1().click();
		
		


	}

	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		driver.close();
	}

	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}

}