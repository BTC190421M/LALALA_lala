package com.page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//div[text()='Back To School']") WebElement backToSchoolMainMenu;
	@FindBy(xpath="//a[@class='_3B53C _1cRgw'and text()='Activewear']")WebElement activeWearSubMenu;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void hoverOverOnBackToSchool () {
		Helper.mouseOver(driver,backToSchoolMainMenu);
		
	}
	
	public ActiveWearPage clickOnActiveWear () {
		Helper.clickOnElement(activeWearSubMenu);
		return new ActiveWearPage(driver);
		
	}
	
}