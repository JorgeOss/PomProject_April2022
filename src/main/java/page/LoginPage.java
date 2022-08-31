package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//webElement list
	//WebElement
	//By
	//@FindBy(how,using)

	



	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement UserName_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement LoginButton_Element;
	
	//Corresponding method
	public void insertUsername(String userName) {
		UserName_Element.sendKeys(userName);
	}
	
	public void insertpassword(String password) {
		Password_Element.sendKeys(password);
	}
	public void LoginButton() {
		LoginButton_Element.click();
	}
	public void performLogin(String UserName, String password) {
		UserName_Element.sendKeys(UserName);
		Password_Element.sendKeys(password);
		LoginButton_Element.click();
	}
}
