package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ProductDetailPage {
	
	WebDriver driver;
	@FindBy(xpath="//select[@class='E-MJI optionNotSelected']")WebElement sizeMSelected;
	@FindBy(xpath="//*[@id=\"GlobalOptions-AddToCart\"]/button/div/p[2]")WebElement addToCart;
    @FindBy(xpath="//*[@id=\"atPanelContent\"]/div/section/section/section[1]/div[2]/div/button[2]")WebElement checkOut;
	
	
	public ProductDetailPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectSize() {
		Helper.selectElement(sizeMSelected, "medium");
	}
	
	public void clickOnAddToCart() {
		Helper.clickOnElement(addToCart);
	}
	
	public void clickOnCheckOut() {
		Helper.clickOnElement(checkOut);
	}

}