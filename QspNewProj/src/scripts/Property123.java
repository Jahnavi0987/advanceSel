package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


public class Property123 {
	@Test
	public void testProperty() throws FileNotFoundException, IOException 
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./p.properties"));
		String value=p.getProperty("key");
		String value1=p.getProperty("path");

		System.out.println(value);
		System.out.println(value1);
	}
}
