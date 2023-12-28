package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.ChangeLoginPasswordPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_ChangeLoginPasswordTest_012 extends BaseClass{
	
	@Test
	public void changePassword() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ChangeLoginPasswordPage changePass = new ChangeLoginPasswordPage(driver); 
		
		changePass.clickOnChangePassword();
		
		logger.info("Providing the Passwords......");
		
		changePass.oldPassword("@1234567");
		changePass.newPassword("@1234567");
		changePass.conNewPassword("@1234567");
		
		changePass.clickSubmitButton();
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.warn("Test Case Failed");
			driver.switchTo().alert().accept();//close alert

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
