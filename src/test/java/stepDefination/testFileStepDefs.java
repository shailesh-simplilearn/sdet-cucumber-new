package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testFileStepDefs {
	
	@Given("I am testing")
	public void iAmTestingMethod() {
		System.out.println("I am Testing Method");
	}
	
	@When("^I am on ([^\"]*) page$")
	public void i_am_on_my_page(String page) throws Throwable {
		System.out.println("This is I am On "+page+" Page method");
	}

	@Then("^This ([^\"]*) page should display$")
	public void page_should_display(String page) throws Throwable {
		System.out.println("This "+page+" page should display method");
	}

}
