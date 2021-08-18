package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class cartPage {

	public cartPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy (xpath = "//input[@name='submit.add-to-cart']")
	public WebElement addToCart;
	
	@FindBy (id = "newBuyBoxPrice")
	public WebElement price;
	
}
