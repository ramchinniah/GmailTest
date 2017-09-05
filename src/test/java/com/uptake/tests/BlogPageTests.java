package com.uptake.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.uptake.base.BaseSetup;
import com.uptake.common.Utils;
import com.uptake.pages.BlogPage;
import com.uptake.pages.HomePage;

public class BlogPageTests extends BaseSetup {
	private WebDriver driver;
	Utils cm;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
		cm = new Utils(driver);
	}
	
	@Test
	public void verifyBlogPage() {
		System.out.println("Blog page test...");
		HomePage homePage = new HomePage(driver);
		BlogPage blogPage = homePage.clickBlogLink();
		cm.switchToNewTab();
		Assert.assertTrue(blogPage.verifyBlogPageTitle("Uptake Blog – Analytics for the Industrial Internet")
						  ,"About page title doesn't match");
		cm.switchToMainTab();
	}

}
