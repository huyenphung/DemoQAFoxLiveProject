package com.tutorialsninja.automation.stepdef;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class register extends Base {

	HeadersSection headersSection = new HeadersSection();
	// RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();

	@Given("^I launch the application$")
	public void i_launch_the_application() {

		driver.get(reader.getUrl());

	}

	@And("^I navigate to Account Registration page$")
	public void i_navigate_to_account_registration_page() {

		Elements.click(headersSection.myAccountLink);
		Elements.click(headersSection.register);
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {

		RegisterPage.enterAllDetails(dataTable);

	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_privacy_policy() {
		driver.findElement(By.name("agree")).click();
		// Elements.click(registerPage.privacyPolicy);

	}


	@And("^I click on Continue button$")
	public void i_click_on_continue_button() {
		driver.findElement(By.xpath(" //input[@type='submit']")).click();

	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_user_account_has_successfully_created() {
		Assert.assertTrue(Elements.isDisplayed(accountSuccessPage.successBreadCrumb));




	}


}