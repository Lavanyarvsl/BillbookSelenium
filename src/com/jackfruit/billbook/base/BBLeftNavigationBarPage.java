package com.jackfruit.billbook.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBLeftNavigationBarPage extends BasePage
{

	public BBLeftNavigationBarPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="html/body/aside/div/section/ul/li[1]/a/span")
	private WebElement myVendors;
	
	@FindBy(xpath="html/body/aside/div/section/ul/li[2]/a/i")
	private WebElement myBuyers;

	@FindBy(xpath="html/body/aside/div/section/ul/li[3]/a")
	private WebElement myBranches;
	
	
	@FindBy(xpath="html/body/aside/div/section/ul/li[4]/a/span")
	private WebElement saleInvoices;
	
	
	@FindBy(xpath="html/body/aside/div/section/ul/li[5]/a/span")
	private WebElement purchaseBills;
	
	
	@FindBy(xpath="html/body/aside/div/section/ul/li[6]/a/span")
	private WebElement commodities;
	
	@FindBy(xpath="html/body/aside/div/section/ul/li[7]/a/span")
	private WebElement pointOfSale;
	
	@FindBy(xpath="html/body/aside/div/section/ul/li[8]/a/span")
	private WebElement selfBilling;
	
	
	
	
	public void myVendorsButtonClick() 
	{
		myVendors.click();
	}
	
	
	public void myBuyersButtonClick() 
	{
		myBuyers.click();
	}
	
	public void myBranchesButtonClick() 
	{
		myBranches.click();
	}
	
	
	public void saleInvoicesButtonClick() 
	{
		saleInvoices.click();
	}
	
	public void purchaseBillsButtonClick() 
	{
		purchaseBills.click();
	}
	
	public void commoditiesButtonClick() 
	{
		commodities.click();
	}
	
	
	
	public void pointOfSaleButtonClick() 
	{
		pointOfSale.click();
	}
	
	
	public void selfBillingButtonClick() 
	{
		selfBilling.click();
	}
	
	
	
	
}
