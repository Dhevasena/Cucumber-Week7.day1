package stepdefs;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectspecific extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		// call webdriver manager
		WebDriverManager.chromedriver().setup();
		//Launch chrome browser
		driver=new ChromeDriver();
		//Open URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
