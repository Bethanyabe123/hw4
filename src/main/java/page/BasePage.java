package page;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
 
	public void validateElement(String actualText, String expectedText, String erromMsg) {
		
		Assert.assertEquals(actualText, expectedText,erromMsg);
	}
	
	public void waitForElement(WebDriver driver, int waitTime, By elementToBeLocated) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementToBeLocated));
	
}
	public void SelectFromDropdown(WebElement element, String visibleText) {
		Select Sel = new Select( element);
        Sel.selectByVisibleText(visibleText);
		
	}
	public int randomNumGenerator(int bound) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(bound);
		return generatedNum;
	}
		
	
	
	
	

}
