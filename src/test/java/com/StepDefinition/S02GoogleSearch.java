package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch 
{
	WebDriver driver;

	@Given("i open google")
	public void i_open_google() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}

	@When("enter Youtube Keyword in Search box")
	public void enter_youtube_keyword_in_search_box() 
	{
		driver.findElement(By.id("APjFqb")).sendKeys("Youtube");
	}

	@When("Hit Enter")
	public void hit_enter() 
	{
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}

	@Then("Youtube Should Be Displayed in Searchbox")
	public void youtube_should_be_displayed_in_searchbox() 
	{
		if(driver.getTitle().contains("Youtube"))
			System.out.println("Search succesfull");
		else
			System.out.println("Search Unsuccesfull");
	}
}




