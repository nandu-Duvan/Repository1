package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement Login;
	
	
	@FindBy(id="Email")
	private WebElement emailtextfield;
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement login1;

	public WebElement getLogin()
	{
		return Login;
	}
		
		public Login_Page(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
	

	public WebElement getEmailtextfield()
	{
		return emailtextfield;
	}

	public WebElement getPasswordtextfield()
	{
		return passwordtextfield;
	}
	


	public WebElement getLogin1()
	{
		return login1;
	}
	
		

}
