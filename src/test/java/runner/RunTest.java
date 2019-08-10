package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java"+"/feature/LeaftapsLogin.feature",glue="Steps")
public class RunTest extends AbstractTestNGCucumberTests{

}
