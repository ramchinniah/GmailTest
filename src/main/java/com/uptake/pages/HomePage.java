package com.uptake.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	protected WebDriver driver;
	JavascriptExecutor js; 
	private By aboutPageLink = By.xpath(".//a[text()='About' and @class='menu__item']");
	private By blogPageLink = By.xpath(".//a[text()='Blog' and @class='menu__item']");
	private By newsRoomPageLink = By.xpath(".//a[text()='Newsroom' and @class='menu__item']");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		js = (JavascriptExecutor) driver;
	}
	
	public AboutPage clickAboutLink() {
		WebElement aboutPageLinkElement=driver.findElement(aboutPageLink);
		if(aboutPageLinkElement.isDisplayed()||aboutPageLinkElement.isEnabled()) {
			aboutPageLinkElement.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
			System.out.println("Element not found");
		return new AboutPage(driver);
	}

	public boolean verifyHomePageTitle(String title) {
		return driver.getTitle().equalsIgnoreCase(title);
	}

	public BlogPage clickBlogLink() {
		WebElement blogPageLinkElement=driver.findElement(blogPageLink);
		if(blogPageLinkElement.isDisplayed()||blogPageLinkElement.isEnabled()) {
			blogPageLinkElement.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
			System.out.println("Element not found");
		return new BlogPage(driver);
	}
	
	public NewsRoomPage clickNewsRoomLink() {
		//WebElement newsRoomPageLinkElement = (new WebDriverWait(driver, 30))
			//	  .until(ExpectedConditions.elementToBeClickable(newsRoomPageLink));
		WebElement newsRoomPageLinkElement=driver.findElement(newsRoomPageLink);
		if(newsRoomPageLinkElement.isDisplayed()||newsRoomPageLinkElement.isEnabled()) {
			//js.executeScript("arguments[0].click();", newsRoomPageLinkElement);
			System.out.println(newsRoomPageLinkElement.getText());
			newsRoomPageLinkElement.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
			System.out.println("Element not found");
		return new NewsRoomPage(driver);
	}
}
