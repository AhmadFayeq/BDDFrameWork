package pageObjects;

import org.apache.http.util.Asserts;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class TestEnvironmentPage extends ConfigFileReader {
	
	
	
	// first extend base class
    // create constructor for this class
	
	public TestEnvironmentPage() {
	
		
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (how = How.XPATH , using ="//span[text() = 'My Account']")
	  private WebElement myAccount;
	@FindBy (how = How.XPATH , using ="//a[text() = 'Register']")
	  private WebElement registar;
	@FindBy (how = How.XPATH , using ="//a[text() = 'Login']")
	  private WebElement login;
	@FindBy (how = How.XPATH , using ="//input[@id='input-email']")
    private WebElement email;
	@FindBy (how = How.XPATH , using ="//input[@id='input-password']")
    private WebElement password;
	@FindBy (how = How.XPATH , using ="//input[@value='Login']")
    private WebElement loginButton1;
	
	public void clickOnMyAcount() {
		myAccount.click();
	}
	public void clickOnRegister() {
		registar.click();
	}
	public void clickOnLogin() {
		login.click();
	}
	public String getPageURL() {
	String actualUrl = 	driver.getCurrentUrl();
	
	  return  actualUrl;
		
	// we use Junit assertion  to pass or fail verifications;

	}
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		
		return pageTitle;
		
	}
	
	public void enterEmail(String emailAddress) {
		email.sendKeys(emailAddress);
		
		
		
	}
	
	public void enterPassword(String passwordData) {
		password.sendKeys(passwordData);
	}
	
	public void clickOnLoginButton() {
		loginButton1.click();
	}
}
