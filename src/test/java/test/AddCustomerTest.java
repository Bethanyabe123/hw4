package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerpage;
import page.DashbordPage;
import page.LoginPage;
import util.BrowserFactory;






public class AddCustomerTest {
	WebDriver driver;
	
	String userName ="demo@techfios.com";
	String password ="abc123";
	String dashbordValidationText = "Dashboard";
	String addCuomerValidationText ="Add Contact";
	String fullName = "Selenium 2023";
	String company = "Techfios";
	String email = "abcd123@yahoo.com";
	String phone ="972-564-0098";
	String address = "1243 debora ln plano ";
	String city = "plano";
	String state = "tx";
	String zip = "75469";
	String countery = "Afghanistan";
	
	
	@Test
	public void userSouldBeAbleToAddCustomer() throws InterruptedException {
		
		
		driver = BrowserFactory.init();
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.inserUserName(userName);
		loginPage.inserPassword(password);
		loginPage.clickOnSigninButton();
		
		
		
		DashbordPage dashboardPage = PageFactory.initElements(driver, DashbordPage.class);
		dashboardPage.validateDashboardPage(dashbordValidationText);
	   
		dashboardPage.clickCustomerButton();
	    dashboardPage.clickAddCustomerButton();
	    
	  
	    AddCustomerpage addCustomerPage = PageFactory.initElements(driver, AddCustomerpage.class);
	    addCustomerPage.validateAddCustomerPage(addCuomerValidationText);
	    addCustomerPage.insertFullName(fullName);
	    addCustomerPage.selectCompanyName(company);
	    addCustomerPage.insertEmail(email);
	    addCustomerPage.insertPhone(phone);
	    addCustomerPage.insertAddress(address);
	    addCustomerPage.insertCity(city);
	    addCustomerPage.insertState(state);
	    addCustomerPage.insertZip(zip);
	    addCustomerPage.selectCountery(countery);
	    addCustomerPage.clickOnSubmitButton();
	    //addCustomerPage.clickOnListcustomersField();
	    
	    
	    
	    
	    
	}
	

}
