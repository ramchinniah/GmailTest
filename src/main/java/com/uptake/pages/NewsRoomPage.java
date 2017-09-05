package com.uptake.pages;

import org.openqa.selenium.WebDriver;

public class NewsRoomPage {

	protected WebDriver driver;
	public NewsRoomPage(WebDriver driver) {
		this.driver = driver;
	}
	public boolean verifyNewsRoomPageTitle(String title) {
		return driver.getTitle().equalsIgnoreCase(title);
	}

}
