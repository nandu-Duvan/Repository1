package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	
	@FindBy(xpath="//a[@class='ico-logout']")
	private WebElement logout;
	
	public Logout_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}
