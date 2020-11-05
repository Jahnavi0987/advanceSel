package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Screenshot {
	public static void getPhoto(WebDriver driver) throws IOException {
		String photo="./Photos/";
		Date d1=new Date();
		String d2=d1.toString();
		d2.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileUtils.copyFile(src, dst);
		
	}

}
