package com.excersice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.cartPage;
import pages.checkOutPage;
import pages.searchPage;
import utility.ConfigurationReader;
import utility.Driver;

public class amazon {

	searchPage search = new searchPage();
	cartPage cart = new cartPage();
	checkOutPage check = new checkOutPage();
	
	@Test
	public void OpenAmazon() {
		WebDriver driver = Driver.getDriver();
		driver.get(ConfigurationReader.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		search.searchInbox.sendKeys(ConfigurationReader.getProperty("bookName"),Keys.ENTER);
		search.boxItem1.click();
	
		
		String priceExpect = "$47.49";
		String price = cart.price.getText();
		
		Assert.assertEquals(priceExpect, price);
		
		cart.addToCart.click();
	
		String priceAddtoCart = check.priceAddToCart.getText();
		Assert.assertEquals(priceExpect,priceAddtoCart );
		
		check.checkOut.click();
	
	
	}
	
	
	
}
