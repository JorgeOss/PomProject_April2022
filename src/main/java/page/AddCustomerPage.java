package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {
WebDriver driver;
	
	
	public AddCustomerPage(WebDriver driver) {
	
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='account']") WebElement Full_Name_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]']") WebElement Company_Dropdown_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement Email_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement Phone_Num_Element;

	
	
	//corresponding method
	public void insertFullName(String FullName) {
		String insertedName = FullName + generateRndomNum(999);
		Full_Name_Element.sendKeys(insertedName);
	}
	public void selectCompanyDropdown(String company) {
		selectFromDropdown(Company_Dropdown_Element, company);
	}
	
	public void insertemail(String email) {
		String insertedEmail = generateRndomNum(999) + email; 
		Email_Element.sendKeys(email);
		
	}
	public void insertPhone(String phone) {
		Email_Element.sendKeys(phone);
	}
	
}
