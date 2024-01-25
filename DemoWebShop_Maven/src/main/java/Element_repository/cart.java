package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart {
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement cart;
	
	
	@FindBy(xpath="//h1[text()='Shopping cart']")
	private WebElement shoppingcart;
	

	public cart(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getCart() {
		return cart;
	}
	
	
	

}
