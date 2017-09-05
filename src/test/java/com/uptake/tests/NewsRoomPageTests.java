package com.uptake.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.uptake.base.BaseSetup;
import com.uptake.common.Utils;
import com.uptake.pages.HomePage;
import com.uptake.pages.NewsRoomPage;

public class NewsRoomPageTests  extends BaseSetup {
	private WebDriver driver;
	Utils cm;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
		cm = new Utils(driver);
	}
	
	@Test
	public void verifyNewsRoomPage() {
		System.out.println("NewsRoom page test...");
		HomePage homePage = new HomePage(driver);
		NewsRoomPage newsRoomPage = homePage.clickNewsRoomLink();
		Assert.assertTrue(newsRoomPage.verifyNewsRoomPageTitle("Newsroom"), "Newsroom page title doesn't match");
	}
}
