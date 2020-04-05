package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage extends Elements {
	
	public RegisterPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id = "input-firstname")
	public static WebElement firstName;

	@FindBy(id = "input-lastname")
	public static WebElement lastname;

	@FindBy(id = "input-email")
	public static WebElement email;

	@FindBy(id = "input-telephone")
	public static WebElement telephone;

	@FindBy(id = "input-password")
	public static WebElement password;

	@FindBy(id = "input-confirm")
	public static WebElement confirmPassword;

	@FindBy(name = "agree")
	public static WebElement privacyPolicy;


	public static void enterAllDetails(DataTable dataTable) {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		Base.driver.findElement(By.id("input-firstname")).sendKeys(map.get("FirstName"));
		// Elements.TypeText(firstName, map.get("FirstName"));
		Base.driver.findElement(By.id("input-lastname")).sendKeys(map.get("LastName"));
		// Elements.TypeText(lastname, map.get("LastName"));
		Base.driver.findElement(By.id("input-email")).sendKeys(map.get("Email"));
		// Elements.TypeText(email, map.get("Email"));
		Base.driver.findElement(By.id("input-telephone")).sendKeys(map.get("Telephone"));
		// Elements.TypeText(telephone, map.get("Telephone"));
		Base.driver.findElement(By.id("input-password")).sendKeys(map.get("Password"));
		// Elements.TypeText(password, map.get("Password"));

		Base.driver.findElement(By.id("input-confirm")).sendKeys(map.get("Password"));
		// Elements.TypeText(confirmPassword, map.get("Password"));

	}
}
