package com.jackfruit.billbook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jackfruit.billbook.base.HomePage;



public class PhotographDetPage extends HomePage
{

	public PhotographDetPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(id="photofile")
	private WebElement photofile;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="btnYes")
	private WebElement btnYes;
	
	
	public Object clickBrowseButton(String pf){
		photofile.sendKeys(pf);
		return pf;
	}
	
	
	public void clickUploadButton()
	{
		btnSave.click();
	
	}
	
	public void clickDeleteButton()
	{
		btnDelete.click();
	
	}
	

	public void clickButtonYes()
	{
		btnYes.click();
	
	}
	
	
}
