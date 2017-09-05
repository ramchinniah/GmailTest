package com.uptake.pages;

import org.openqa.selenium.WebDriver;

public class BlogPage {
	
	protected WebDriver driver;
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	public boolean verifyBlogPageTitle(String title) {
		return driver.getTitle().equalsIgnoreCase(title);
	}

}
