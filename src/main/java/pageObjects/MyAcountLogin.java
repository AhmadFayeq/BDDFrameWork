package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class MyAcountLogin extends ConfigFileReader {
	
	public MyAcountLogin() {
		  
		  PageFactory.initElements(driver, this);
		  		  
		  
		  
	  }
	@FindBy (how = How.XPATH , using ="//span[text() = 'My Account']")
	  private WebElement myAccountButton;
	@FindBy (how = How.XPATH , using ="//a[text() = 'Register']")
	  private WebElement registarButton;
	@FindBy (how = How.XPATH , using ="//a[text() = 'Login']")
	  private WebElement loginButton;
	@FindBy (how = How.XPATH , using ="//a[@id='input-email']")
    private WebElement email;
	@FindBy (how = How.XPATH , using ="//a[@id='input-password']")
    private WebElement password;
	@FindBy (how = How.XPATH , using ="//a[@value='Login']")
    private WebElement loginButton1;

	
	 public void clickOnMyAcount() {
	      myAccountButton.click();
	  }
	 public void clickOnRegister() {
		 registarButton.click();
	  }
	 
	 public void clickOnLogin() {
		 loginButton.click();
	  }
	
}
