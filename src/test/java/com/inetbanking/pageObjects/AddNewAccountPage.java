package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAccountPage {
	
WebDriver ldriver;
	
	public AddNewAccountPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[5]/a")
	@CacheLookup
	WebElement InkAddNewAccount;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
	@CacheLookup
	WebElement txtCustomerID;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	@CacheLookup
	WebElement listAccountType;
	
	@FindBy(xpath ="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement initialDeposit;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	
	
	
	public void clickAddNewAccount()
	{
		InkAddNewAccount.click();
	}
	
	public void custID(String id)
	{
		txtCustomerID.sendKeys(id);
	}
	
	public void selectAccountType()
	{
		listAccountType.getText();
	}
	
	public void initialDeposit(String money)
	{
		initialDeposit.sendKeys(money);
	}
	
	public void clickSubmitButton()
	{
		btnSubmit.click();
	}
	
	
	
	
}
