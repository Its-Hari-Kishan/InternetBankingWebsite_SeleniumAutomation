package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.WithdrawMoneyFromAccountPage;

public class TC_WithdrawMoneyFromAccountTest_010 extends BaseClass{
	
	@Test
	public void withdrawMoney() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		WithdrawMoneyFromAccountPage withdrawmoney = new WithdrawMoneyFromAccountPage(driver);
		
		withdrawmoney.clickOnWithdrawal();
		
		logger.info("Providing withdrawal Details......");
		
		withdrawmoney.accountNo("130252");
		withdrawmoney.enterAmount("10000");
		withdrawmoney.enterDescriprtion("Shopping");
		withdrawmoney.clickSubmitButton();
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			Assert.assertTrue(true);
			logger.warn("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
			driver.switchTo().alert().accept();//close alert

		}
		

	}
	
	
	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
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
