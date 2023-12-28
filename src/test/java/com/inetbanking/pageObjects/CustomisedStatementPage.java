package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomisedStatementPage {
	
WebDriver ldriver;
	
	public CustomisedStatementPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[14]/a")
	@CacheLookup
	WebElement InkCustomisedStatement;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtAccountNo;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	@CacheLookup
	WebElement txtFromDate;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement txtToDate;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	@CacheLookup
	WebElement txtMinumumTransactionValue;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	@CacheLookup
	WebElement txtNumberOfTransaction;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickOnCustStatement() 
	{
		InkCustomisedStatement.click();	        
	}
	
	public void enterAccountNo(String AccNo) 
	{
	      txtAccountNo.sendKeys(AccNo);        
	}
	
	public void fromDate(String dd,String mm,String yy)
	{
		txtFromDate.sendKeys(dd);
		txtFromDate.sendKeys(mm);
		txtFromDate.sendKeys(yy);
	}
	
	public void toDate(String dd,String mm,String yy)
	{
		txtToDate.sendKeys(dd);
		txtToDate.sendKeys(mm);
		txtToDate.sendKeys(yy);
	}
	
	public void minimumTransaction(String amount)
	{
		txtMinumumTransactionValue.sendKeys(amount);
	}
	
	public void noOfTransaction(String num)
	{
		txtNumberOfTransaction.sendKeys(num);
	}
	
	public void clickSubmitButton()
	{
		btnSubmit.click();
	}


}
