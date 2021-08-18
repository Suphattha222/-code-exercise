package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Driver;

public class searchPage {

	public searchPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "twotabsearchtextbox")
	public WebElement searchInbox;
	
	@FindBy (xpath = "(//a[@class='a-link-normal a-text-normal'])[1]")
	public WebElement boxItem1;
	
	
}
