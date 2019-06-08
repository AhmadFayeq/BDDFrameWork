package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import constants.ConfigFileReader;

public class ScreenShotUtil extends ConfigFileReader {
	
	
	public static void captureScreenShot(String name, String location) throws IOException {
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File(location+name+".png"));
		//FileUtils.copyFile(src, new File("c:\\tmp\\screenshot.png"));
		
	}

}
