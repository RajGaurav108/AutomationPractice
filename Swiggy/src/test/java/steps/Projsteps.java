package steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Projsteps {

	public static WebDriver driver;


	@Given("User is on Chrome browser")
	public void user_is_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\DownloadedApp\\chromedriver_win32_96\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("User is on Chrome browser");
	}
	@And("User is on swiggy page")
	public void user_is_on_swiggy_page() {
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		System.out.println("User is on swiggy page");

	}
	@When("Locates me")
	public void locates_me() {
		driver.findElement(By.xpath("//span[@class='LukWG']")).click();
		System.out.println("Locates me");
	}
	@Then("User enters to homepage")
	public void user_enters_to_homepage() {
		System.out.println("User enters to homepage");
	}

	@Given("User clicks on Search Button")
	public void user_clicks_on_search_button() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[normalize-space()='Search']")).click();
		System.out.println("User clicks on Search Button");
	}
	@When("User search for item {string}")
	public void user_search_for_item(String str) {
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']")).sendKeys("Aaloo Paratha");
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']")).sendKeys(Keys.ENTER);

		System.out.println("User search for item "+str+" and clicked Enter key");
	}
	@Then("User clicks on item")
	public void user_clicks_on_item() {
		driver.findElement(By.xpath("//div[normalize-space()='KHEER MAHAL']")).click();
		System.out.println("User clicks on Resturant");
	}
	@Given("User is on search page")
	public void user_is_on_search_page() {
		System.out.println("User is on selected Resturant Home Page");
	}

	@Given("User select item from options")
	public void user_select_item_from_options() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
		System.out.println("User clicks on food image from options");

	}

	@When("User clicks on image")
	public void user_clicks_on_image() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
		System.out.println("User clicked on add icon");
	}

	@When("User added item into the cart")
	public void user_added_item_into_the_cart() {
		//add to cart
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_1gPB7']")).click();
		System.out.println("User clicked on checkout");

	}

	@Then("User open the cart")
	public void user_open_the_cart() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		System.out.println("User open the cart");
	}


}
