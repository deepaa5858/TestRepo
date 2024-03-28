package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S01GoogleTitle 
{
	WebDriver driver;
	String exptitle = "Google", acttitle; 
	
	@Given("open google")
	public void open_google() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}


	@When("Read the title")
	public void read_the_title() 
	{
		System.out.println(acttitle = driver.getTitle());
	}

	@Then("Title should google")
	public void title_should_google() 
	{
		if(exptitle.equals(acttitle))
			System.out.println("Title matching");
		else
			System.out.println("Title not matching");
		driver.close();
	}

}
