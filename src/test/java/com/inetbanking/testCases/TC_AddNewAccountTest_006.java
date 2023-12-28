package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddNewAccountPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddNewAccountTest_006 extends BaseClass{
	
	@Test
	public void addNewAccountOfCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddNewAccountPage addNewAcc = new AddNewAccountPage(driver);
		
		addNewAcc.clickAddNewAccount();
		
		logger.info("Opening new account....");
		
		addNewAcc.custID("45498");
		addNewAcc.selectAccountType();
		
		addNewAcc.initialDeposit("10000");
		addNewAcc.clickSubmitButton();
		logger.info("opening the account....");
		
		boolean res=driver.getPageSource().contains("Account Generated Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed....");
			
		}
		else
		{
			logger.info("Test case failed....");
			captureScreen(driver,"addNewAccountOfCustomer");
			Assert.assertTrue(false);
		}
	}

}
