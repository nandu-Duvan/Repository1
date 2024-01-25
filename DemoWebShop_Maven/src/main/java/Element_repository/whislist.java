package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class whislist {
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement whislist;
	

	public whislist(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getWhislist() {
		return whislist;
	}
	
	

}
