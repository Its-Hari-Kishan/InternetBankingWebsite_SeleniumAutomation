package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteCustomerTest_005 extends BaseClass{
	
	@Test
	public void deleteExistingCustomer() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		DeleteCustomerPage deletecust = new DeleteCustomerPage(driver);
		
		deletecust.clickDeleteCustomer();
		
		logger.info("Deleting customer details....");
		
		deletecust.custID("458963");
		deletecust.clickSubmitButton();
	
		Alert alert = driver.switchTo().alert();
		alert.accept(); 
		logger.info("Details deleted successfully....");
		
		
		
	}

}
