package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {
	
	@FindBy(id="gender-male")
	private WebElement maleradiobutton;
	
	
	@FindBy(id="gender-female")
	private WebElement femaleradiobutton;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
  	private WebElement lastname;
	 
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy(id="register-button")
	private WebElement register;

	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}

	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	
	
	public WebElement getRegister() {
		return register;
	}

	public Register_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
