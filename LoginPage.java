package stepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginPage extends Projectspecific {

	@Given("Type the username as {string}")
	public void typeUsername(String username)
	{
		//find and Enter User name
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Type the password as {string}")
	public void typePassword(String password)
	{
		//find and Enter password
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on Login button")
	public void clickLogin()
	{
		//Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify login successful")
	public void verifyHomePage()
	{
		//Check Correct Page
		WebElement webElement = driver.findElement(By.className("decorativeSubmit"));
		//get attribute and print it
		String attribute = webElement.getAttribute("value");
		//Print the attribute
		System.out.println(attribute);
		if(attribute.equalsIgnoreCase("logout"))
		{
			System.out.println("Logged in successfully");
		}
		else{
			System.out.println("Login is not successful");
		}
	}

	@But("Error invalid username or password")
	public void verifyErrorMesage()
	{
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}

}
