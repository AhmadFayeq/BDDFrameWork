package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class RegisterPage extends ConfigFileReader {

	public RegisterPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//input[@name = 'firstname']")
	private WebElement firstNameField;

	@FindBy(how = How.XPATH, using = "//input[@name = 'input-lastname']")
	private WebElement lastNameFeild;

	@FindBy(how = How.XPATH, using = "//input[@name = 'input-email']")
	private WebElement emailField;

	@FindBy(how = How.XPATH, using = "//input[@name = 'input-telephone']")
	private WebElement phoneField;

	@FindBy(how = How.XPATH, using = "//input[@id= 'input-password")
	private WebElement passField;

	@FindBy(how = How.XPATH, using = "//input[@name ='confirm']")
	private WebElement passConfirmField;

	@FindBy(how = How.XPATH, using = "(//input[@type = 'radio' and @value = '1'])[1]")
	private WebElement yesButton;
	@FindBy(how = How.XPATH, using = "(//input[@type = 'radio' and @value = '1'])[2]")
	private WebElement noButton;

	@FindBy(how = How.XPATH, using = "//input[@type = 'checkbox']")
	private WebElement privatePolicyBox;

	@FindBy(how = How.XPATH, using = "//input[@type = 'submit']")
	private WebElement continueButton;
}
