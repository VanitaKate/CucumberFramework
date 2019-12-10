package com.cucumberFramework.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cucumberFramework.PageObjects.LoginPageObjects;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {
	WebDriver driver;
	LoginPageObjects LP=new LoginPageObjects(driver);
	@Given("User launch FireFox Browser")
	public void user_launch_FireFox_Browser() {
		setup("FireFox");
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String string) {
		getURL();
	}

	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String userName, String Password) {
		LP.setUserName("Vasudha1981@yahoo.com");
		LP.setPassword("Password101");
	}

	@When("Clicks on LogIn button")
	public void clicks_on_LogIn_button() {
		LP.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {

		if (title.equalsIgnoreCase(driver.getTitle())){

		}else {
			logger.info("Page title is not as expected.Expected page title is: " +title);
		}
	}

	@When("UserClicks on settings and logout link")
	public void userclicks_on_settings_and_logout_link() {

	}

	@Then("Page tile should be {string}")
	public void page_tile_should_be(String string) {

	}


}
