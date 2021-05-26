package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.Leave;
import com.qa.pages.LoginPage;
import com.qa.pages.MyInfoPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	Leave leavePage;
	MyInfoPage myInfoPage;
	public HomePageTest() {
		super();
	}
@BeforeMethod
	 	
public void Setup()
	{
	initialization();
	loginPage =new LoginPage();
	leavePage= new Leave();
	myInfoPage= new MyInfoPage();
	homePage=loginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
	}

@Test
public void VerifyHomePageTitleTest() {
	String Title=homePage.validateHomepageTitle();
	System.out.println(Title);
 Assert.assertEquals(Title, "OrangeHRM");
}

@Test
public void VerifyUsernameTest() {
	Assert.assertTrue(homePage.VerifyUsername());
}
 @Test
	public void ClickOnLeavePageTest() {
	leavePage=  homePage.ClickOnLeavePage();
	}
	
 @Test
	public void ClickOnMyInfoPageTest() {
		myInfoPage=homePage.ClickOnMyInfoPage();
	}
	

	

@AfterMethod
public void teardown() {
	driver.quit();
}

}
