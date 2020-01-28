package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ResultsForJuniorsPage {
	WebDriver driver;
	@FindBy(xpath="//img[@class='_2kmmO _14a-3 _2BVC5'and@src='//s7d4.scene7.com/is/image/JCPenney/DP0711201913012520M.tif?wid=350&hei=350&op_usm=.4,.8,0,0&resmode=sharp2']")WebElement clickOnFirstProduct;
	
	public ResultsForJuniorsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductDetailPage clickOnJunior () {
		Helper.clickOnElement(clickOnFirstProduct);
		return new ProductDetailPage(driver);
		//
		
	}
	

}