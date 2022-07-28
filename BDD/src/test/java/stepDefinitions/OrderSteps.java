package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_is_on_login_page");
	}
	@Given("user has entered Username")
	public void user_has_entered_username() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user_has_entered_username");
	}
	@Given("user has entered Password")
	public void user_has_entered_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_has_entered_password");
	}
	@Given("user has clicked on login button")
	public void user_has_clicked_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_has_clicked_on_login_button");
	}
	@Given("user has performed the validation")
	public void user_has_performed_the_validation() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_has_performed_the_validation");
	}
	@Given("user is on the products page")
	public void user_is_on_the_products_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_is_on_the_products_page");
	}
	@When("user searches for {string}")   //     
	public void user_searches_for(String strProduct) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user_searches_for "+strProduct);
	}
	@Then("user should be able to find the product on the page")
	public void user_should_be_able_to_find_the_product_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_should_be_able_to_find_the_product_on_the_page");
	}

	
	
	@When("User adds product to cart")
	public void user_adds_product_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user_adds_product_to_cart");
	}
	@Then("The product should be added to cart succesfully")
	public void the_product_should_be_added_to_cart_succesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("the_product_should_be_added_to_cart_succesfully");
	}
	
	
	
	

	@When("user searches for appliance for Model")
	public void user_searches_for_appliance_for_model(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<List<String>> lstProds = dataTable.asLists();
		for (List<String> prod : lstProds) {
			System.out.println("Appliance: "+prod.get(0)+" Model "+prod.get(1));
		}
		
//	    List<List<String>> lstProds = dataTable.asLists();
//	    for (List<String> prod : lstProds) {
//	    	System.out.println("Appliance: "+prod.get(0)+" Model "+prod.get(1));
//			
//		}
	}









}
