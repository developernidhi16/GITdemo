package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Leave extends TestBase {
	
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveList']")
	WebElement LeaveList;
	
	
	//Initializing the Page object
	public Leave() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyLeaveLabel() {
		return  LeaveList.isDisplayed();
	}
	

}
