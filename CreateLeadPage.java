package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;


import io.cucumber.java.en.And;

public class CreateLeadPage extends Projectspecific{
	@Given("Click on CRMSFA link")
	public void clickCRMSFAlink()
	{
		//Click on CRM/SFS
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click on Leads tab")
	public void clickLeadsTab()
	{
		//Click Create lead link
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter Company Name as (.*)$")
	public void typeCompanyName(String companyName)
	{
		//Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	@And("Enter first Name as (.*)$")
	public void typeFirstName(String firstName)
	{
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@And("Enter Surname as (.*)$")
	public void typeSurname(String surName)
	{
		//Enter Surname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(surName);
	}
	@And("Enter the Firstname Local as (.*)$")
	public void typeFirstNameLocal(String firstNameLocal)
	{
		//Enter the Firstname Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(firstNameLocal);
	}
	@And("Enter the department as (.*)$")
	public void typeDepartment(String department)
	{
		//Enter the department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(department);
	}
	@And("Enter the Description as (.*)$")
	public void typeDescription(String description)
	{
		//Enter the Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys(description);
	}
	@And("Enter the Email as (.*)$")
	public void typeEmail(String Email )
	{
		//Enter the Email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(Email);
	}
	@And("Click on Submit button")
	public void clickSubmitButton()
	{
		//Submit
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("Verify view leads page")
	public void verifyViewLeadPage()
	{
		//Page title
		String title = driver.getTitle();
		//Print title
		System.out.println(title);
	}

}
