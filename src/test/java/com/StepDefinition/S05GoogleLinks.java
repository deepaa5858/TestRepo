package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S05GoogleLinks {

	WebDriver driver;
	String title;

	@Given("Open Google")
	public void open_google() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}

	@When("Read home page tilte")
	public void read_home_page_tilte() {
		title = driver.getTitle();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
		System.out.println("Google home page title :" + title);
	}

	@When("click on gmail link")
	public void click_on_gmail_link() {
		driver.findElement(By.linkText("Gmail")).click();
	}

	@When("read the gmail page title")
	public void read_the_gmail_page_title() {
		title = driver.getTitle();
	}

	@Then("gmail page should display")
	public void gmail_page_should_display() {
		System.out.println("Gmail page title :" + title);
	}

	@When("click on images link")
	public void click_on_images_link() {
		driver.findElement(By.linkText("Images")).click();
	}

	@When("read the images page title")
	public void read_the_images_page_title() {
		title = driver.getTitle();
	}

	@Then("Images page should display")
	public void images_page_should_display() {
		System.out.println("Images page title :" + title);
	}

	@When("click on google apps link")
	public void click_on_google_apps_link() {
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
	}

	@When("read the google apps page title")
	public void read_the_google_apps_page_title() {
		title = driver.getTitle();
	}

	@Then("google apps should display")
	public void google_apps_should_display() {
		System.out.println("Google apps page title :" + title);
	}

	@When("click on about link")
	public void click_on_about_link() {
		driver.findElement(By.linkText("About")).click();
	}

	@When("read the about page title")
	public void read_the_about_page_title() {
		title = driver.getTitle();
	}

	@Then("about page should display")
	public void about_page_should_display() {
		System.out.println("About page title :" + title);
	}

	@When("click on advertising link")
	public void click_on_advertising_link() {
		driver.findElement(By.linkText("Advertising")).click();
	}

	@When("read the advertising page title")
	public void read_the_advertising_page_title() {
		title = driver.getTitle();
	}

	@Then("advertising page should display")
	public void advertising_page_should_display() {
		System.out.println("advertising page title :" + title);
	}

}
