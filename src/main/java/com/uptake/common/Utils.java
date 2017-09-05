package com.uptake.common;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Utils {
	
	protected WebDriver driver;
	String currentWindowHandle= "";
	
	public Utils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchToNewTab() {
		currentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String windowHandle : allWindowHandles) {
		    driver.switchTo().window(windowHandle);
		}
	}
	
	public void switchToMainTab() {
		driver.switchTo().window(currentWindowHandle);
	}

}
