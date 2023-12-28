package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.CustomisedStatementPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_CustomisedStatementTest_015 extends BaseClass{
	
	@Test
	public void customisedStatement() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		CustomisedStatementPage custstmt = new CustomisedStatementPage(driver); 
		
		custstmt.clickOnCustStatement();
		logger.info("Provinding the details....");
		
		custstmt.enterAccountNo("130368");
		custstmt.fromDate("10","12","2023");
		custstmt.toDate("25","12","2023");
		custstmt.minimumTransaction("100");
		custstmt.noOfTransaction("5");
		custstmt.clickSubmitButton();
		
		logger.info("Processing started....");
		
		boolean res=driver.getPageSource().contains("Customised Statement Details!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed....");
			
		}
		else
		{
			logger.info("Test case failed....");
			captureScreen(driver,"customisedStatement");
			Assert.assertTrue(false);
		}
		
		
		
	}

}
