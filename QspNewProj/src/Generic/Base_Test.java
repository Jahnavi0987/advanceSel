package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements framework_Constants{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{	
		System.setProperty(Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
	}
	@AfterMethod
	public void closeApp(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus())
		{
			Generic_Screenshot.getPhoto(driver);
		}
		driver.quit();
	}

}
