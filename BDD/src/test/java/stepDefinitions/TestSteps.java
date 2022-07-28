package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

	@Given("^I want to write a step with \"([^\"]*)\" name$")
	public void i_want_to_write_a_step_with_name1_name(String name) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Name is "+name);
	}
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer stepNo) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step number: "+stepNo);
	}
	@Then("^I verify the status \"([^\"]*)\" in step$")
	public void i_verify_the_status_success_in_step(String status) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Status is "+status);
	}






}
