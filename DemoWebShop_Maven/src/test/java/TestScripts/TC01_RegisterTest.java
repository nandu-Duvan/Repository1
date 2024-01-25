package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Element_repository.Home_Page;
import Element_repository.Login_Page;
import Element_repository.Register_page;
import GENERIC_LIBRARY.Data_utitlity;
@Test
public class TC01_RegisterTest {

//abc fh
	//abgdid
	//chdsuhcu
	public void registerTestCase()
	{
		
		
			WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/books");
	
	Home_Page homePage=new Home_Page(driver);
	homePage.getRegister1().click();
    Register_page registerPage=new Register_page(driver);
    registerPage.getFemaleradiobutton().click();
    registerPage.getFirstname().sendKeys("nandu");
    registerPage.getLastname().sendKeys("g");
    registerPage.getEmail().sendKeys("nandu45@gmail.com");
    registerPage.getPassword().sendKeys("nanu@12");
    registerPage.getConfirmpassword().sendKeys("nanu@12");
    registerPage.getRegister().click();
    
	
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
}	



