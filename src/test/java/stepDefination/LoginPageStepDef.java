package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageStepDef {
	WebDriver driver;
	LoginPage loginPage ;
	
	@Given("^I am on automationpractice$")
	public void i_am_on_www_automationpractice_com()  {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationpractice.com");
		
	}
	
	@When("^I click on SignIn link$")
	public void i_click_on_SignIn_link()  {
		loginPage = new LoginPage(driver);
		loginPage.clickOnSignIn();
	}

	@When("^I enter username$")
	public void i_enter_username()  {
		loginPage = new LoginPage(driver);
		loginPage.loginToApplication("test@test.com", "password");
		
	}

	@When("^I enter password$")
	public void i_enter_password()  {
	}

	@When("^I click SigIn button$")
	public void i_click_SigIn_button()  {
	}

	@Then("^I should be logged in to the application$")
	public void i_should_be_logged_in_to_the_application() {
		loginPage = new LoginPage(driver);
		Assert.assertEquals(loginPage.getValidationMessage(), "Invalid password.");
		driver.quit();
	}

}
