package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.FundTransferPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_FundTransferTest_011 extends BaseClass{
	
	@Test
	public void fundTransfer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		FundTransferPage fundtransfer = new FundTransferPage(driver);
		
		fundtransfer.clickOnFundTransfer();
		
		logger.info("Providing Fund Transfer Details......");
		
		fundtransfer.payersAccountNo("130369");
		fundtransfer.payeesAccountNo("130368");
		fundtransfer.enterAmount("100");
		fundtransfer.enterDescriprtion("Shoping");
		
		fundtransfer.clickSubmitButton();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Fund Transfer Details");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed....");
			
		}
		else
		{
			logger.info("Test case failed....");
			captureScreen(driver,"fundTransfer");
			Assert.assertTrue(false);
		}
		
		
		
		
	}

}
