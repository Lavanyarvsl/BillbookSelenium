package com.jackfruit.billbook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.jackfruit.billbook.base.HomePage;




/* Lavanya R -- 28-02-2018 */

public class EmployeeListPage extends HomePage 
{

	public EmployeeListPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*@FindBy(how = How.XPATH, using = ".//*[@id='resultTable']/tbody/tr/td[2]/a")
	 static WebElement lnk_Id;
	
	public void setLinkID(String linkId){
		lnk_Id.sendKeys(linkId);
	}*/
	
	@FindBy(xpath=".//*[@id='resultTable']/tbody/tr/td[2]/a")
	private WebElement linId;
	
	
	public void clickLinkID(){
		linId.click();
	}
	
	public WebElement getLinkText()
	{
		linId.getText();
		return linId;
	}
	
	
	
	
}
