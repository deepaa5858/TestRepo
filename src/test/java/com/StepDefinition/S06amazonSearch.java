package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S06amazonSearch {
	WebDriver driver;

	@Given("Open Amazon")
	public void pen_amazon() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
	}

	@When("Click on search Functionality")
	public void click_on_search_functionality() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	}

	@Then("Cursor should be placed in the search box")
	public void cursor_should_be_placed_in_the_search_box() {
		System.out.println("Cusror should be placed in the search box");

	}

	@When("Search {string} under the Price {int}")
	public void search_under_the_price(String product, Integer price) {
		System.out.println("Search for:" + product + "with price:" + price);

	}

	@Then("Found {string} with Price {int} Should be displayed")
	public void found_with_price_should_be_displayed(String product, Integer price) {
		System.out.println("found:" + product + "with price :" + price);
	}

}


