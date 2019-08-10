package Steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@Before
public void Beforerescenario(Scenario sc){
	System.out.println("Testcase Name: "+sc.getName());
	System.out.println("Line Numbuer: "+sc.getId());
	System.out.println("Status: "+sc.getStatus());
	
}
@After
public void AfterScenario(Scenario sc)
{
	System.out.println("Status: "+sc.getStatus());
}
}
