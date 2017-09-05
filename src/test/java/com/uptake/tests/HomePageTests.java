package com.uptake.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.uptake.base.BaseSetup;
import com.uptake.pages.HomePage;

public class HomePageTests extends BaseSetup {
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void verifyHomePage() {
		System.out.println("Home page test...");
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.verifyHomePageTitle("Analytics for the industrial internet"), "Home page title doesn't match");
	}
}
