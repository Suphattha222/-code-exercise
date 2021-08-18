package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class checkOutPage {

	public checkOutPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "hlb-ptc-btn-native")
	public WebElement checkOut;
		
	@FindBy (xpath = "(//span[text()='$47.49'])[1]")
	public WebElement priceAddToCart;
	
}
