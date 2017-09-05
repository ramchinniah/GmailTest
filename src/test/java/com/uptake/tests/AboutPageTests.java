package com.uptake.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.uptake.base.BaseSetup;
import com.uptake.pages.AboutPage;
import com.uptake.pages.HomePage;

public class AboutPageTests extends BaseSetup {
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void verifyAboutPage() {
		System.out.println("About page test...");
		HomePage homePage = new HomePage(driver);
		AboutPage aboutPage = homePage.clickAboutLink();
		Assert.assertTrue(aboutPage.verifyAboutPageTitle("About"), "About page title doesn't match");
	}
}

