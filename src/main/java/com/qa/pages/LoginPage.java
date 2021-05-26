package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page factory (Object repository)

	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement LoginBtn;
	
	//Initializing the Page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	//Actions
	
	public String validateloginpageTitle() {
		return driver.getTitle();
		
	}
	
	public HomePage Login(String un, String pwd) {
		
	
	Username.sendKeys(un);
	Password.sendKeys(pwd);
	LoginBtn.click();
	
	return new HomePage();
		
	}
	
	}
