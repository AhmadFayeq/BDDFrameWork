package stepDefinitions;

import org.openqa.selenium.WebDriver;

import constants.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CanvasStepDefinition extends ConfigFileReader{
	
	WebDriver driver;
	
	@Given("^User is on Tek School Page$")
	public void user_is_on_Tek_School_Page()  {
		
		
	    
	}

	
	@When("^User click on Login button on top of the page$")
	public void user_click_on_Login_button_on_top_of_the_page(){
	  
	}

	@Then("^User should see Canvas Login Page$")
	public void user_should_see_Canvas_Login_Page() {
	    
	}


}
