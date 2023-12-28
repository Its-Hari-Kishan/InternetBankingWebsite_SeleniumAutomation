package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangeLoginPasswordPage {
	
	WebDriver ldriver;
	
	public ChangeLoginPasswordPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[11]/a")
	@CacheLookup
	WebElement InkChangePassword;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txtOldPassword;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")
	@CacheLookup
	WebElement txtNewPassword;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtConfirmNewPassword;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickOnChangePassword() 
	{
	      InkChangePassword.click();	        
	}
	
	public void oldPassword(String oldPass) 
	{
	      txtOldPassword.sendKeys(oldPass);        
	}
	
	public void newPassword(String newPass) 
	{
	      txtNewPassword.sendKeys(newPass);        
	}
	
	public void conNewPassword(String conNewPass) 
	{
		txtConfirmNewPassword.sendKeys(conNewPass);        
	}
	
	public void clickSubmitButton()
	{
		btnSubmit.click();
	}
	
}
