package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before(order = 0)
	public void beforeScenario() {
		System.out.println("open browser beforeScenario \nopen URL beforeScenario");
	}
	

	@Before(order = 2)
	public void beforeSecondScenario() {
		System.out.println("open browser beforeSecondScenario \nopen URL beforeSecondScenario");
	}
	

	@Before(order = 1)
	public void beforeFirstScenario() {
		System.out.println("open browser beforeFirstScenario \nopen URL beforeFirstScenario");
	}
	@After
	public void afterEachScenario() {
		System.out.println("close browser");
	}

}
