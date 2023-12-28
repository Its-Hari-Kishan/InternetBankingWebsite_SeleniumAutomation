package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.MiniStatementPage;

public class TC_MiniStatementTest_014 extends BaseClass {
	
	@Test
	public void miniStatement() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		MiniStatementPage miniStmt = new MiniStatementPage(driver); 
		
		miniStmt.clickOnMiniStatement();
		
		logger.info("Provinding Account number.....");
		miniStmt.enterAccountNo("130368");
		
		miniStmt.clickSubmitButton();
		Thread.sleep(3000);
		
		logger.info("Processing started....");
		
		boolean res=driver.getPageSource().contains("Mini Statement Details!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed....");
			
		}
		else
		{
			logger.info("Test case failed....");
			captureScreen(driver,"miniStatement");
			Assert.assertTrue(false);
		}
		
		
		
	}

}
