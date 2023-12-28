package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DeleteExistingAccountPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DeleteExistingAccountTest_008 extends BaseClass{
	
	@Test
	public void deleteExistingAccount() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		DeleteExistingAccountPage delExistingAcc = new DeleteExistingAccountPage(driver);
		
		delExistingAcc.clickDeleteAccount();
		
		delExistingAcc.custID("130395");
		
		delExistingAcc.clickSubmitButton();
			
		logger.info("Processing started....");
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			logger.info("Account Deleted Successfully.");
			Assert.assertTrue(true);
			logger.info("Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test Failed");	
		}
		
		
	}
	
	public boolean isAlertPresent() //user defined method created to check alert is present or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}

}
