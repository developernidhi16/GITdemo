package com.qa.test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
@BeforeMethod
	 	
public void Setup()
	{
	initialization();
	loginPage =new LoginPage();
	}

@Test (priority=1)
public void validateloginpageTitle() {
	String Title= loginPage.validateloginpageTitle();
	Assert.assertEquals(Title, "OrangeHRM");
}

@Test (priority=2)
public void Login() {
	loginPage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
	
}

	
@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
