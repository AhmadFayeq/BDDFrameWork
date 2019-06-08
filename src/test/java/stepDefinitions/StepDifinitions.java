package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import constants.ConfigFileReader;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolHomePage;
import pageObjects.TestEnvironmentPage;
import utilities.ScreenShotUtil;

public class StepDifinitions extends ConfigFileReader {

	TekSchoolHomePage tsh;
	TestEnvironmentPage tep;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {

	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() {

	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() {

	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() {

	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() {

	}

	@Given("^User go to  Tek School page$")
	public void user_go_to_Tek_School_page() throws IOException {
		ConfigFileReader.initializtion();
		tsh = new TekSchoolHomePage();
		tsh.getPageTitle();
		ScreenShotUtil.captureScreenShot("TekScoolHomepage",
				"C:\\Users\\allem\\eclipse-workspace\\BDDTestFramework\\target\\testPictures");
	}

	@When("^User click on test environment$")
	public void user_click_on_test_environment() {
		tsh = new TekSchoolHomePage();
		tsh.clickOnTestEnvironment();
		tsh.getPageTitle();
		

	}

	@When("^User should see the test environment page$")
	public void user_should_see_the_test_environment_page() throws IOException {

		tep = new TestEnvironmentPage();

		String pageUrl = tep.getPageURL();
		String expectedPageUrl = "https://www.tekschoolofamerica.com/test-environment/";
		assertEquals(expectedPageUrl, pageUrl);
		ScreenShotUtil.captureScreenShot("TestEnvironmentPic",
				"C:\\Users\\allem\\eclipse-workspace\\BDDTestFramework\\target\\testPictures");
	}

	@Then("^User veriry test environment title$")
	public void user_veriry_test_environment_title() {
		tep = new TestEnvironmentPage();
		String pageTitle = tep.getPageTitle();
		String expectedPageTitle = "Tek School of America Test Environment";
		assertEquals(expectedPageTitle, pageTitle);

	}

	@When("^User click on myAccount$")
	public void user_click_on_myAccount() {
		tep = new TestEnvironmentPage();
		tep.clickOnMyAcount();

	}

	@When("^User select login from dropdown$")
	public void user_select_login_from_dropdown() {
		tep = new TestEnvironmentPage();
		tep.clickOnLogin();
	}

	@Then("^User should see login page$")
	public void user_should_see_login_page() throws IOException {
		tep = new TestEnvironmentPage();

		String actualAccountLoginTitle = tep.getPageTitle();
		String expectedAccountLoginTitle = "Account Login";

		assertEquals(expectedAccountLoginTitle, actualAccountLoginTitle);
		Assert.assertEquals(expectedAccountLoginTitle, actualAccountLoginTitle);
		ScreenShotUtil.captureScreenShot("LoginPagePic",
				"C:\\Users\\allem\\eclipse-workspace\\BDDTestFramework\\target\\testPictures");
	}

	@When("^User enter username (.+)$")
	public void user_enter_username_test_test_com(String userName) {
		tep = new TestEnvironmentPage();
		tep.enterEmail(userName);

	}

	@When("^User enter password (.+)$")
	public void user_enter_password_test_test_com(String password) {
		tep = new TestEnvironmentPage();
		tep.enterPassword(password);
	}

	@When("^Click continue button$")
	public void click_continue_button() {
		tep = new TestEnvironmentPage();
		tep.clickOnLoginButton();

	}

	@Then("^User should be logged in successfully$")
	public void user_should_be_logged_in_successfully() throws IOException {
		tep = new TestEnvironmentPage();
		String actualTitle = tep.getPageTitle();
		String expectedTitle = "My Account";
		assertEquals(expectedTitle, actualTitle);
		//Assert.assertEquals(expectedTitle, actualTitle);
		ScreenShotUtil.captureScreenShot("MyAcount Picture",
				"C:\\Users\\allem\\eclipse-workspace\\BDDTestFramework\\target\\testPictures");
	}

	@When("^User enter username test(\\d+)@test\\.com$")
	public void user_enter_username_test_test_com(int arg1) {

	}

	@When("^User enter password test(\\d+)@test\\.com$")
	public void user_enter_password_test_test_com(int arg1) {

	}
}