package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	@FindBy(xpath="//img[@alt=\"Tricentis Demo Web Shop\"]")
	private WebElement home;
	
	
	@FindBy(xpath="//a[@class='ico-register']")
	private WebElement Register1;
	
	


	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement login;
	
	
	public Home_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getHome() {
		return home;
	}


	public WebElement getLogin() {
		return login;
	}


	public WebElement getRegister1() {
		return Register1;
	}
	
	

}
