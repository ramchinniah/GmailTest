package stepDefintions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import environment.BaseTest;

public class UserStepDefinitions implements BaseTest{

	@Then("^I print the number of emails present$")
	public void check_No_Of_Email_present()
	{
		List<WebElement> emails=driver.findElements(By.xpath(".//*[@gh='tm']//span[@class='ts']"));
		String noOfEmails= emails.get(2).getText();
		System.out.println(noOfEmails);
	}
}
