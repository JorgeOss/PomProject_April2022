package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public void selectFromDropdown(WebElement company, String visibleText) {
		Select sel = new Select(company);
		sel.selectByVisibleText(visibleText);
	
	
	
	}
	public int generateRndomNum(int boundaryNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundaryNum);
		return generatedNum;
	}
	
}
