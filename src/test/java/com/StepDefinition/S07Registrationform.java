package com.StepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class S07Registrationform 
{

	@Given("Open Registration Page")
	public void open_registration_page() 
	{
		System.out.println("Open Registration Page");
	}

	@When("Enter following data")
	public void enter_following_data(io.cucumber.datatable.DataTable dataTable) 
	{
		List<List<String>> data = dataTable.asLists();

		for (List<String> d : data)
			System.out.println(d);

	}

	@Then("Registration should success")
	public void registration_should_success() 
	{
		System.out.println("Registration should success");

	}

	@When("Enter data as follow")
	public void enter_data_as_follow(io.cucumber.datatable.DataTable dataTable) 
	{
		List<Map<String, String>> data = dataTable.asMaps();

		System.out.println(data);

		for (Map<String, String> d : data) {
			System.out.println("First Name: " + d.get("FirstName"));
			System.out.println("Last Name : " + d.get("LastName"));
			System.out.println("Address   : " + d.get("Address"));
			System.out.println("E Mail ID : " + d.get("MailID"));
			System.out.println("Contact No: " + d.get("ContactNo"));
		}

	}

	@Then("Registration should be success")
	public void registration_should_be_success() 
	{
		System.out.println("Registration is successful");

	}

}
