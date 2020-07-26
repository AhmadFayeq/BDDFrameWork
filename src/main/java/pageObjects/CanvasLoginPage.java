
package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import constants.ConfigFileReader;

public class CanvasLoginPage extends ConfigFileReader{
	
	  public CanvasLoginPage () {
		  
		  PageFactory.initElements(driver, this);  
		  
	  }
	  
	  @FindBy (how = How.ID, using = "username")
	  private WebElement username;
	  
	  @FindBy (id = "book")
	  WebElement book;
	  
	  
	  
	  @FindBy (how = How.XPATH , using ="(//input[@class = 'ic-Input text'])[1]")
	  private WebElement emailField;
	  
	  @FindBy (how = How.XPATH , using ="(//input[@class = 'ic-Input text'])[2]")
	  private WebElement passwordField;
	  
	  @FindBy (how = How.XPATH , using ="((//input[@value = '1'])[2]")
	  private WebElement stayLoggedInBox;
	  
	  @FindBy (how = How.XPATH , using ="(//button[@type = 'submit'])[1]")
	  private WebElement loginButton;
	  

}
