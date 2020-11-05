package scripts;

import org.junit.Assert;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Generic_ReadExcel;
import POM.Acti_Login;

public class ActiValid_scripts extends Base_Test {
	@Test
	public void validLogin() {
		String uname=Generic_ReadExcel.getData("Sheet1", 0, 0);
		String pwd=Generic_ReadExcel.getData("Sheet1", 0, 1);
		Acti_Login act= new Acti_Login(driver);
		act.setUsername(uname);
		act.setPassword(pwd);
		act.clickBtn();
		Assert.fail();
		
	}
}
