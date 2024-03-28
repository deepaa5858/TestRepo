package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class S04PracticeTestAutomation {
	WebDriver driver;

	@Given("open practicetestautomation")
	public void open_practicetestautomation() {

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@When("Enter valid Username as {string}")
	public void Enter_valid_username_as(String un) {
		driver.findElement(By.id("username")).sendKeys(un);

	}

	@When("Enter valid Password as {string}")
	public void enter_valid_password_as(String ps) {
		driver.findElement(By.id("password")).sendKeys(ps);

	}

	@When("Click on submit")
	public void Click_on_submit() {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).sendKeys(Keys.ENTER);
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() {
		if (driver.getCurrentUrl().contains("logged-in-successfully"))
			System.out.println("Login Successfull");
		else
			System.out.println("Login unSuccessfull");
	}

	@When("enter invalid username as {string}")
	public void enter_invalid_username_as(String un) {
		driver.findElement(By.id("username")).sendKeys(un);

	}

	@When("enter invalid password as {string}")
	public void enter_invalid_password_as(String ps) {
		driver.findElement(By.id("password")).sendKeys(ps);

	}

	@When("Click on Submit")
	public void click_on_submit() {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).sendKeys(Keys.ENTER);

	}

	@Then("error msg should be displayed")
	public void error_msg_should_be_displayed() {
		if (driver.getCurrentUrl().contains("logged-in-successfully"))
			System.out.println("Login Successfull");
		else
			System.out.println("Login unSuccessfull");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());

	}
}

