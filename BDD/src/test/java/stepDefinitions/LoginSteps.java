package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("User is registered")
	public void user_is_registered() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("1.User is registered");
	}

//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//		System.out.println("2.User is on Login page");
//	}

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


	@When("User enters valid username")
	public void user_enters_valid_username() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("3.User enters valid username");
	}

	@When("User enters valid password")
	public void user_enters_valid_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("4.User enters valid password");
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("5.User clicks on login");
	}

	@Then("User should have loggged in")
	public void user_should_have_loggged_in() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("6.User should have loggged in");
	}

	@When("User enters  username")
	public void user_enters_username() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("a.User enters  username");
	}

	@When("User enters invalid password")
	public void user_enters_invalid_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("b.User enters invalid password");
	}

	@Then("User should not logged in")
	public void user_should_not_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("c.User should not logged in");
	}





}
