package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03OHRMLogin {
	WebDriver driver;

	@Given("Open Orange HRM Application")
	public void open_orange_hrm_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter valid username")
	public void enter_valid_username() {
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))
				.sendKeys("Admin");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
				.sendKeys("admin123");
	}

	@When("Hit enter")
	public void Hit_enter() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
				.sendKeys(Keys.ENTER);
	}

	@Then("Login page should display")
	public void login_page_should_display() {
		if (driver.getCurrentUrl().contains("dashboard"))
			System.out.println("Login Successfull");
		else
			System.out.println("Login UnSuccessfull");
	}

	@When("Enter invalid username")
	public void enter_invalid_username() {
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Deepa");

	}

	@When("Enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
				.sendKeys("deepa123");
	}

	@When("hit enter")
	public void hit_enter() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
				.sendKeys(Keys.ENTER);

	}

	@Then("Error msg should display")
	public void error_msg_should_display() {
		if (driver.getCurrentUrl().contains("dashboard"))
			System.out.println("Login Successfull");
		else
			System.out.println("Error msg -> invalid username and invalid password");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[1]/p")).getText());

	}
}
