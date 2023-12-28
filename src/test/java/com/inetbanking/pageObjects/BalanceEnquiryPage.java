package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalanceEnquiryPage {
	
	WebDriver ldriver;
	
	public BalanceEnquiryPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[12]/a")
	@CacheLookup
	WebElement InkBalanceEnquiry;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtAccountNo;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickOnBalanceEnquiry() 
	{
	      InkBalanceEnquiry.click();	        
	}
	
	public void enterAccountNo(String AccNo) 
	{
	      txtAccountNo.sendKeys(AccNo);        
	}
	
	public void clickSubmitButton()
	{
		btnSubmit.click();
	}


}
