package com.jackfruit.billbook.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBSecondaryNavigationBarPage extends BasePage
{

	protected BBSecondaryNavigationBarPage(WebDriver driver) 
	{
		super(driver);
		
	}

	@FindBy(xpath="html/body/section/div/div[1]/a[6]")
	private WebElement myVendors;
	
	@FindBy(xpath="html/body/section/div/div[1]/a[5]")
	private WebElement myBuyers;
	
	
	@FindBy(xpath="html/body/section/div/div[1]/a[4]")
	private WebElement myBranches;
	
	
	@FindBy(xpath="html/body/section/div/div[1]/a[3]")
	private WebElement salesInvoices;
	
	
	@FindBy(xpath="html/body/section/div/div[1]/a[2]")
	private WebElement purchaseBills;
	
	
	@FindBy(xpath="html/body/section/div/div[1]/a[1]")
	private WebElement commodities;
	
	
	public void  myVendorsButtonClick() 
	{
		myVendors.click();
	}
	
	
	public void  myBuyersButtonClick() 
	{
		myBuyers.click();
	}
	
	public void  myBranchesButtonClick() 
	{
		myBranches.click();
	}
	
	public void  saleInvoiceButtonClick() 
	{
		salesInvoices.click();
	}
	
	
	public void purchaseBillsButtonClick() 
	{
		purchaseBills.click();
	}
	
	
	public void CommoditiesButtonClick() 
	{
		commodities.click();
	}
	
	
	
	
}
