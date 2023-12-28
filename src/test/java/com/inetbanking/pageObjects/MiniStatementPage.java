package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementPage {
	
	WebDriver ldriver;
	
	public MiniStatementPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[13]/a")
	@CacheLookup
	WebElement InkMiniStatement;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtAccountNo;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickOnMiniStatement() 
	{
		InkMiniStatement.click();	        
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
