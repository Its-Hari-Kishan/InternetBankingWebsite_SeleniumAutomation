package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithdrawMoneyFromAccountPage {

	WebDriver ldriver;
	
	public WithdrawMoneyFromAccountPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[9]/a")
	@CacheLookup
	WebElement InkWithdrawal;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtAccountNo;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	@CacheLookup
	WebElement txtAmount;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickOnWithdrawal() 
	{
	      InkWithdrawal.click();	        
	}
	
	public void accountNo(String AccNo)
	{
		txtAccountNo.sendKeys(AccNo);
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
