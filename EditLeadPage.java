package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;

public class EditLeadPage extends Projectspecific {
	@Given ("Click on CRMSFA edt")
	public void clickOnCrmsfaEdt() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And ("Click on leads tab")
	public void clickOnLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And ("Click on findLeads shortcut")
	public void clickOnFindLeadsShortcut(){
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click on Duplicate lead button")
	public void clickDuplicateLead()
	{
		//Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Then("Enter new Company Name as (.*)$")
	public void newCompanyName(String companyName)
	{
		//Enter Company Name
		WebElement element3 = driver.findElement(By.id("createLeadForm_companyName"));
		element3.clear();
		element3.sendKeys(companyName);
	}
	@And("Enter new first Name as (.*)$")
	public void newFirstName(String firstName)
	{
		//Enter first name
		WebElement element4 = driver.findElement(By.id("createLeadForm_firstName"));
		element4.clear();
		element4.sendKeys(firstName);
	}
	@And("Enter new  Surname as (.*)$")
	public void newSurname(String surName)
	{
		//Enter Surname
		WebElement element5 = driver.findElement(By.id("createLeadForm_lastName"));
		element5.clear();
		element5.sendKeys(surName);
	}
	@And("Click on Submit button on edit Lead page")
	public void clickeditPageSubmit()
	{
		//Submit
		driver.findElement(By.className("smallSubmit")).click();

	}
	@Then("Verify Edit Lead Page")
	public void verifyEditPage()
	{
		//Page title
		String title2 = driver.getTitle();
		//Print title
		System.out.println(title2);
	}
}
