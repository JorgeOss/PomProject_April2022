package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class DashboardPage {
	WebDriver driver;
	
	
	public DashboardPage(WebDriver driver) {
	
	}
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]") WebElement Dashboard_Header_Element;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]") WebElement Customer_Menu_Element;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement Add_Customer_Menu_Element;
	
	
	//corresponding method
	public void validateDashboardPage() {
		Assert.assertEquals(Dashboard_Header_Element.getText(), "Dashboard", "Dashboard Not Found!!");
		
	
	}
	
	public void clickCustomerMenuButton() {
	Customer_Menu_Element.click();	
	}
	public void clickAddCustomerMenuButton() {
		Add_Customer_Menu_Element.click();
	}
	
	
	
	
}
