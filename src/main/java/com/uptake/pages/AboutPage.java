package com.uptake.pages;

import org.openqa.selenium.WebDriver;

public class AboutPage {

	protected WebDriver driver;
	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	public boolean verifyAboutPageTitle(String title) {
		System.out.println(driver.getTitle());
		return driver.getTitle().equalsIgnoreCase(title);
	}

}
