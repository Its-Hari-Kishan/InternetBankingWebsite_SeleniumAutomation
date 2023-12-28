package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	
	WebDriver ldriver;
	
	public EditCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[3]/a")
	@CacheLookup
	WebElement InkEditCustomer;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	@CacheLookup
	WebElement txtCustomerID;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit1;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit2;
	
	

	public void clickEditCustomer() 
	{
	      InkEditCustomer.click();	        
	}
	
	public void custID(String id)
	{
		txtCustomerID.sendKeys(id);
	}
	
	public void clickSubmitButton1()
	{
		btnSubmit1.click();
	}
	
	public void clickSubmitButton2()
	{
		btnSubmit2.click();
	}
	

}
