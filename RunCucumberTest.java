package runner;


import io.cucumber.testng.CucumberOptions;
import stepdefs.Projectspecific;
@CucumberOptions(features={"src/test/java/features"},
glue={"stepdefs"},
monochrome=true,
publish=true
)
public class RunCucumberTest extends Projectspecific{

}
