package com.omrbranch.stepdefn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefn {
	WebDriver driver;

	@Given("user is on the facebook page")
	public void user_is_on_the_facebook_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
		WebElement txtEmailId = driver.findElement(By.id("email"));
		txtEmailId.sendKeys(username);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(password);

	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@Then("user should verify error message")
	public void user_should_verify_error_message() {
		WebElement textMessage = driver.findElement(By.xpath("//div[contains(@class,'_9ay7')]"));
		String actualMessage = textMessage.getText();
		Assert.assertEquals("Verify Message", "The email address or mobile number you entered "
				+ "isn't connected to an account. Find your account and log in.", actualMessage);
	}

}
