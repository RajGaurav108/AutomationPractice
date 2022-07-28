package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	public static WebDriver driver;
	public static LoginClass fly;

	@Given("user has opened Application")
	public void user_has_opened_application() {
		fly.Home();
		System.out.println("user has opened Application");
	}

	@When("user opens Home page")
	public void user_opens_home_page() {
		fly.MEMBER_LOGIN();
		System.out.println("user opens Home page");
	}

	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("user should be navigated to home page");
	}

	@Given("user has opened login page")
	public void user_has_opened_login_page() {
		fly.Login();
		fly.Nav_Home();
		System.out.println("user has opened login page");
	}
	
	@Given("user opts to register")
	public void user_opts_to_register() {
		fly.Register();
		System.out.println("user opts to register");
	}
	
	@When("user enters details required")
	public void user_enters_details_required() {
		fly.See_Bookings();
		System.out.println("user enters details required");
	}



}
