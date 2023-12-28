package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass{
	
	@Test
	public void EditExistingCustomer() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		EditCustomerPage editcust = new EditCustomerPage(driver);
		
		editcust.clickEditCustomer();
		
		logger.info("Editing customer details....");
		
		editcust.custID("24047");
		editcust.clickSubmitButton1();
		
		editcust.clickSubmitButton2();
		
		Alert alert = driver.switchTo().alert();
		alert.accept(); 
		logger.info("Details edited successfully....");

		
	}
	




	
}
