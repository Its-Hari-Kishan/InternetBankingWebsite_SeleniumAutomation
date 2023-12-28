package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage {
	
WebDriver ldriver;
	
	public FundTransferPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
	@CacheLookup
	WebElement InkFundTransfer;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txtPayersAccountNo;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")
	@CacheLookup
	WebElement txtPayeesAccountNo;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtAmount;

	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
		
	
	public void clickOnFundTransfer()
	{
		InkFundTransfer.click();
	}
	
	public void payersAccountNo(String AccNo)
	{
		txtPayersAccountNo.sendKeys(AccNo);
	}
	
	public void payeesAccountNo(String AccNo)
	{
		txtPayeesAccountNo.sendKeys(AccNo);
	}
	
	public void enterAmount(String amount)
	{
		txtAmount.sendKeys(amount);
	}
	
	public void enterDescriprtion(String text)
	{
		txtDescription.sendKeys(text);
	}
	
	public void clickSubmitButton()
	{
		btnSubmit.click();
	}
	
	

}
