package POCTest;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import cucumber.annotation.en.*;
import cucumber.runtime.PendingException;

public class CucumberSteps {
	
	public WebDriver driver;
	public WebElement element;
		
	@Given("^The User has successfully navigated to Tesco Direct$")
	public void The_User_has_successfully_navigated_to_Tesco_Direct() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.tesco.com/direct/");
		assertTrue(isElementPresent(By.cssSelector("img[alt=\"Tesco direct\"]")));
	}

	@When("^They Click on the offers button$")
	public void They_Click_on_the_offers_button() throws Throwable {
		 driver.findElement(By.linkText("Offers")).click();
	}

	@Then("^the Clearance Link$")
	public void the_Clearance_Link() throws Throwable {
		driver.findElement(By.cssSelector("img[alt=\"Clearance\"]")).click();
	}

	@Then("^I Expect To See the message Hurry when it's gone it's gone$")
	public void I_Expect_To_See_the_message_Hurry_when_it_s_gone_it_s_gone() throws Throwable {
		assertTrue(isElementPresent(By.cssSelector("img[alt=\"Clearance. Hurry... when it's gone it's gone\"]")));
		driver.close();
	}
	
	@Given("^I am about to search$")
	public void I_am_about_to_search() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	@When("^I begin to type my query$")
	public void I_begin_to_type_my_query() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^a list of suggestions shuld appear below the search field$")
	public void a_list_of_suggestions_shuld_appear_below_the_search_field() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the suggestions should update as I type$")
	public void the_suggestions_should_update_as_I_type() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
	 private boolean isElementPresent(By by) {
		 try {
			 driver.findElement(by);
		     return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
	}

}
