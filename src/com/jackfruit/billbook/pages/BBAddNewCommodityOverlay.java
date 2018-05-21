package com.jackfruit.billbook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jackfruit.billbook.base.HomePage;

public class BBAddNewCommodityOverlay extends HomePage
{

	public BBAddNewCommodityOverlay(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(id="exampleInputName")
	private WebElement CommName;
	
	
	@FindBy(id="exampleInputHsnCode")
	private WebElement exampleInputHsnCode;
	
	@FindBy(id="exampleInputCGST")
	private WebElement exampleInputCGST;
	
	@FindBy(id="exampleInputSGST")
	private WebElement exampleInputSGST;
	
	@FindBy(id="exampleInputIGST")
	private WebElement exampleInputIGST;
	
	
	@FindBy(id="exampleInputChapter")
	private WebElement exampleInputChapter;
	
	@FindBy(id="exampleInputSchedule")
	private WebElement exampleInputSchedule;
	
	@FindBy(id="exampleInputPracticeName")
	private WebElement exampleInputPracticeName;
	
	@FindBy(id="exampleInputUnit")
	private WebElement exampleInputUnit;
	
	@FindBy(id="exampleInputPrice")
	private WebElement exampleInputPrice;
	
	@FindBy(id="exampleInputStock")
	private WebElement exampleInputStock;
	
	@FindBy(id="exampleInputDiscount")
	private WebElement exampleInputDiscount;
	
	@FindBy(id="exampleInputMerchentId")
	private WebElement exampleInputMerchentId;
	
	@FindBy(id="addCommodity")
	private WebElement addCommodity;
	
	
	
	
	
	
	//send Commodity Name
	public void searchByName(String name){
		//String xp=".//*[@id='ui-id-32']";
		CommName.sendKeys(name);
		
		//driver.findElement(By.xpath(xp)).click();
	}
	
	
	//Select Category Type
	public void selectCategory(String category)
	{
		String xp=".//*[@id='exampleInputCategory']/option["+category+"]";
		
		driver.findElement(By.xpath(xp)).click();
	}
	
	//send HsnCode
	
	public void sendHSNCode(String HsnCode)
	{
		exampleInputHsnCode.sendKeys(HsnCode);
	}
	
	//Select GST
	public void selectGST(String gst)
	{
		String xp=".//*[@id='exampleInputGST']/option["+gst+"]";
		
		driver.findElement(By.xpath(xp)).click();
	}
	

	
	//Send CGST
	
	public void sendCGST(String CGST)
	{
		exampleInputCGST.sendKeys(CGST);
	}
	
	
	//Send SGST
	
	public void sendSGST(String SGST)
	{
		exampleInputSGST.sendKeys(SGST);
	}
	
	
	//Send IGST
	
	public void sendIGST(String IGST)
	{
		exampleInputIGST.sendKeys(IGST);
	}
	
	//Send Chapter
	
	public void sendChapter(String Chapter)
	{
		exampleInputChapter.sendKeys(Chapter);
	}
	
	//Send Schedule
	
		public void sendSchedule(String Schedule)
		{
			exampleInputSchedule.sendKeys(Schedule);
		}
	
		//Send PracticeName
		public void sendPracticeName(String PracticeName)
		{
			exampleInputPracticeName.sendKeys(PracticeName);
		}
	
		//Send Unit
		public void sendInputUnit(String InputUnit)
		{
			exampleInputUnit.sendKeys(InputUnit);
		}
		
		public void PriceStatus(String priceStatus)
		{
			String xp=".//*[@id='exampleddpriceStatus']/option["+priceStatus+"]";
			
			driver.findElement(By.xpath(xp)).click();
		}
		
		
		//Send Price
		public void sendInputPrice(String InputPrice)
		{
			exampleInputPrice.sendKeys(InputPrice);
		}
		
		//Send Stock
		public void sendInputStock(String InputStock)
		{
			exampleInputStock.sendKeys(InputStock);
		}
		
		//Send Discount
		public void sendInputDiscount(String Discount)
		{
			exampleInputDiscount.sendKeys(Discount);
		}
		
		//Send Merchant ID
		public void sendMerchantID(String merchantID)
		{
			exampleInputMerchentId.sendKeys(merchantID);
		}
		
	
		//click on Submit button
		
		public void clickSubmitButton()
		{
			addCommodity.click();
		}
		
	   
	
	
	
	
	
	
}
