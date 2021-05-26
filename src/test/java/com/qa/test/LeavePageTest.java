package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.Leave;
import com.qa.pages.LoginPage;

public class LeavePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	Leave leavePage;
	public LeavePageTest() {
		super();
	}
@BeforeMethod
	 	
public void Setup()
	{
	initialization();
	loginPage =new LoginPage();
	leavePage= new Leave();
	homePage=loginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
	leavePage=homePage.ClickOnLeavePage();
	
	}



	@Test
	public void VerifyLeaveLabelTest() {
		Assert.assertFalse(leavePage.VerifyLeaveLabel());
		
	}

	

@AfterMethod
public void teardown() {
	driver.quit();
}

}


