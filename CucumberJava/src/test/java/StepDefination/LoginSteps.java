package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {



	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("in given");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("in when");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("in AND");
	}

	@Then("user should be nevigated to homepage")
	public void user_should_be_nevigated_to_homepage() {
		System.out.println("in then");
	}

}
