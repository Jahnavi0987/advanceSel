package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_Login {
	@FindBy(id="email")        //declaratn
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LogIn;
	
	public  Acti_Login(WebDriver driver) {    //initalizatn
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {      //utilizatn
		email.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void clickBtn() {
		LogIn.click();
	}
	
	 
	
}
