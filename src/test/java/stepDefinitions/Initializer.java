package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.ConfigFileReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Initializer extends ConfigFileReader {

	
	ConfigFileReader configFileReader;
	
	// Cucumber Hooks
	// @ before hooks and after hooks
	// @Before Hooks will run before each scenario/ scenario outlin
	// @ After Hooks willrun after each scenarion/ scenario ouline
	/**
	 * this method will before each scenario
	 */
	@Before
	public void beforeScenario() {
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", ConfigFileReader.getDriverPath());
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ConfigFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(ConfigFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		
	}
    /**
     * this method will after each scenario
     */
	@After
	public void afterScenario() {
		
		driver.close();
		driver.quit();
		
	}
	
	
	
	
}
