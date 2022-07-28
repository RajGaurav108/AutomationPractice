package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepsGet {
	 RequestSpecification given;
	 Response response;

	@Given("Perform get operation for home page")
	public void perform_get_operation_for_home_page() {
	   given = RestAssured.given();
	   given.baseUri("https://reqres.in/").contentType(ContentType.JSON);
	}

	@When("User opens the login page")
	public void user_opens_the_login_page() {
	   response = given.get("/api/users/2");
	}

	@Then("verify the status code")
	public void verify_the_status_code() {
	   Assert.assertEquals(200, response.getStatusCode());
	}




}
