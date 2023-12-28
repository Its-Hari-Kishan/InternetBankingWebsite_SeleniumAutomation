package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.EditExistingAccountPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_EditExistingAccountTest_007 extends BaseClass{

	@Test
	public void editExistingAccount() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		EditExistingAccountPage editAcc = new EditExistingAccountPage(driver);
		
		editAcc.clickEditAccount();
		
		
		editAcc.custID("130368");
		
		logger.info("Customer ID provided....");
		
		editAcc.clickSubmitButton();
		
		logger.info("Submit button clicked....");
		Thread.sleep(3000);
		

		boolean res=driver.getPageSource().contains("Edited Account Details!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed....");
			
		}
		else
		{
			logger.info("Test case failed....");
			captureScreen(driver,"editExistingAccount");
			Assert.assertTrue(false);
		}
		
	}
}
