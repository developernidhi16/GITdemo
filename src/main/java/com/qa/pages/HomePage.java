package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//img[contains(@alt='OrangeHRM')]")
	WebElement HomePageLabel;
	
	@FindBy(xpath="//a[text()='Welcome Paul']")
	WebElement Username;
	
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")
	WebElement LeavePage;
	
	@FindBy(xpath="//a[@id= 'menu_pim_viewMyDetails']")
	WebElement MyInfoPage;
	
	//Initializing the Page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateHomepageTitle() {
		return driver.getTitle();
	
		
	}
	
	public boolean VerifyUsername() {
		return Username.isDisplayed();
		
	}
	
	public Leave ClickOnLeavePage() {
		LeavePage.click();
		return new Leave();
	}
	
	public MyInfoPage ClickOnMyInfoPage() {
		MyInfoPage.click();
		return new MyInfoPage();
	}
	
	
	
	
	

}
