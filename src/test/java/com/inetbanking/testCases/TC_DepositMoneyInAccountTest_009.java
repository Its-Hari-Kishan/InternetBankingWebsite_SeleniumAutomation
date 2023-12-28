package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DepositMoneyInAccountPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_DepositMoneyInAccountTest_009 extends BaseClass {

	@Test
	public void depositMoney() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		DepositMoneyInAccountPage depositmoney = new DepositMoneyInAccountPage(driver);
		
		depositmoney.clickOnDeposit();
		
		logger.info("Providing Deposit Details......");
		
		depositmoney.accountNo("130368");
		
		depositmoney.enterAmount("50000");
		depositmoney.enterDescriprtion("Education");
		depositmoney.clickSubmitButton();
		
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Amount Deposited Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case passed....");
			
		}
		else
		{
			logger.info("Test case failed....");
			captureScreen(driver,"depositMoney");
			Assert.assertTrue(false);
		}
		
		
	}
}
