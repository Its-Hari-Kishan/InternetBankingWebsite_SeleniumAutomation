package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BalanceEnquiryPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_BalanceEnquiryTest_013 extends BaseClass{
	
	@Test
	public void balanceEnquiry() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		BalanceEnquiryPage balEnquiry = new BalanceEnquiryPage(driver); 
		
		balEnquiry.clickOnBalanceEnquiry();
		
		logger.info("Provinding Account number.....");
		balEnquiry.enterAccountNo("130368");
		
		balEnquiry.clickSubmitButton();
		Thread.sleep(3000);
		
		logger.info("Processing started....");
		
		boolean res=driver.getPageSource().contains("Available Balance Details!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed....");
			
		}
		else
		{
			logger.info("Test case failed....");
			captureScreen(driver,"balanceEnquiry");
			Assert.assertTrue(false);
		}
		
		
		
	}

}
