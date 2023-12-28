package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	WebDriver ldriver;
	
	public DeleteCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[4]/a")
	@CacheLookup
	WebElement InkDeleteCustomer;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
	@CacheLookup
	WebElement txtCustomerID;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickDeleteCustomer() 
	{
	      InkDeleteCustomer.click();	        
	}
	
	public void custID(String id)
	{
		txtCustomerID.sendKeys(id);
	}
	
	public void clickSubmitButton()
	{
		btnSubmit.click();
	}

}
