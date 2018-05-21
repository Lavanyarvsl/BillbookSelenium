package com.jackfruit.billbook.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.jackfruit.billbook.base.HomePage;

public class BBPOSPage extends HomePage
{

	public BBPOSPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id="paid")
	private WebElement paid;
	
	
	@FindBy(id="due")
	private WebElement due;
	
	
	@FindBy(xpath=".//*[@id='Form']/div[3]/div/div[2]/div[2]/div[2]/div/button")
	private WebElement GenerateInvoice;
	
	
	//Send Commodity Name
	
	public void sendCommodityName(String id,String CommodityName)
	{
		WebElement searchByName= driver.findElement(By.name("posList["+id+"].commodityName"));
		searchByName.sendKeys(CommodityName);
	}
	
	
	
	//Send Commodity Name with Search Id
	public void sendCommodityName(String id,String CommyName,String CommodityName,String id1) throws InterruptedException
	{
		
		/**IMPORTANT**/
			WebElement searchByName= driver.findElement(By.name("posList["+id+"].commodityName"));
			searchByName.sendKeys(CommyName);
			WebElement option1 =  driver.findElement(By.xpath(".//*[@id='ui-id-"+id1+"']"));
			System.out.println("My Xpath::"+option1);
			//Thread.sleep(1000);
			//WebElement option1 =  driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
			option1.click();
			
			/**IMPORTANT**/
			
		/*
			WebElement searchByName= driver.findElement(By.name("posList["+id+"].commodityName"));
			searchByName.sendKeys(CommyName);
		
			WebElement autoOptions = driver.findElement(By.xpath(".//*[@id='1']/td[2]/input"));
			wait.until(ExpectedConditions.visibilityOf(autoOptions));
			
			
			
			
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect)
			{
		        if(option.getText().equals(CommodityName)) 
		        {
		        	System.out.println("Trying to select: "+CommodityName);
		            option.click();
		            break;
		        }
		    }
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		WebElement searchByName= driver.findElement(By.name("posList["+id+"].commodityName"));
		searchByName.sendKeys(CommyName);
		searchByName.sendKeys(Keys.ARROW_DOWN);
		searchByName.sendKeys(Keys.ENTER);
		Thread.sleep(10000);*/
		//((WebElement) driver).sendKeys(Keys.DOWN);
		//driver.findElement(By.name("posList["+id+"].commodityName")).sendKeys(Keys.ARROW_DOWN);
		//searchByName.sendKeys(Keys.ARROW_DOWN);
		
		//Thread.sleep(10000);
		//WebElement.sendKeys(Keys.DOWN);
		
		//WebElement option1 =  driver.findElement(By.className("ui-menu-item"));
		
		/*WebElement autoOptions = driver.findElement(By.name("posList["+id+"].commodityName"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));*/
		
		//System.out.println("My Xpath::"+option1);
		//Thread.sleep(1000);
		
		/*List<WebElement> optionsToSelect = searchByName.findElements(By.tagName("li"));
		optionsToSelect.get(1).click();*/
		
		/*for(WebElement option : optionsToSelect)
		{
	        if(option.getText().equals(CommodityName)) 
	        {
	        	System.out.println("Trying to select: "+CommodityName);
	            option.click();
	            break;
	        }
	    }*/
		
		
		
		
		
		
		
		
		//option1.click();
		
		
		/**IMPORTANT**/
	/*	WebElement searchByName= driver.findElement(By.name("posList["+id+"].commodityName"));
		searchByName.sendKeys(CommyName);
		WebElement option1 =  driver.findElement(By.xpath(".//*[@id='ui-id-"+id1+"']"));
		System.out.println("My Xpath::"+option1);
		
		//WebElement option1 =  driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
		option1.click();
		
		
		*/
		
		/**IMPORTANT**/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		WebElement autoOptions = driver.findElement(By.name("posList["+id+"].commodityName"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		
		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect){
	        if(option.getText().equals("Mixed Vegetables")) {
	        	System.out.println("Trying to select: "+CommodityName);
	            option.click();
	            break;
	        }
	        }*/
		
		
		/*WebElement searchByName= driver.findElement(By.name("posList["+id+"].commodityName"));
		driver.findElement(By.xpath(" .//*[@id='ui-id-3']"));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		
		  js.executeScript("document.getElementByName('posList["+id+"].commodityName').value='someValue';");
		
		*/
		  
		 
		
		
		
		
		
		
		/*
		
		*/
		/*searchByName.click();
		searchByName.sendKeys(CommyName);
		searchByName.sendKeys(Keys.UP);*/
		
		
		
		/*driver.findElement(By.name("posList["+id+"].commodityName")).click();
		driver.findElement(By.name("posList["+id+"].commodityName")).sendKeys(CommyName);
		driver.findElement(By.name("posList["+id+"].commodityName")).sendKeys(Keys.TAB);*/
		
		
		
		
		/*
		
		
		WebElement searchByName= driver.findElement(By.name("posList["+id+"].commodityName"));
		searchByName.sendKeys(CommyName);
		
		WebElement autoOptions = driver.findElement(By.name("posList["+id+"].commodityName"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		
		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect){
	        if(option.getText().equals("Mixed vegetables")) {
	        	System.out.println("Trying to select: "+CommodityName);
	            option.click();
	            break;
	        }
	        }
		
		
		
		*/
		
		
		
		
		
		
		
		/*String textToSelect = "CommodityName";
		
		WebElement autoOptions= driver.findElement(By.name("posList["+id+"].commodityName"));
		autoOptions.sendKeys(CommyName);
	    autoOptions.sendKeys(Keys.PAUSE);
	   // autoOptions.sendKeys(Keys.END);
	    Thread.sleep(5000);*/
		
	   /* WebElement autoOpt = driver.findElement(By.id("ui-id-3"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		autoOpt.click();*/
		//driver.findElement(By.xpath(".//*[@id='"+id+"']/td[2]/input")).sendKeys("Mixed v" , Keys.TAB);

		/*List<WebElement> optionsToSelect = driver.findElements(By.className("ui-menu-item-wrapper"));

	    for(WebElement option : optionsToSelect){
	        System.out.println(option);
	        if(option.getText().equals(textToSelect)) {
	            System.out.println("Trying to select: "+textToSelect);
	            option.click();
	            break;
	        }
	    }*/
		
		/*String xp=".//*[@id='"+id+"']/td[2]/input";
		//driver.findElement(By.xpath(xp)).sendKeys(CommodityName);
		
		WebElement mySelectElement = driver.findElement(By.xpath(xp));
		mySelectElement.sendKeys(CommyName);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ui-id-6']")).click();
		*/
		
		/*Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText(CommodityName);
		Thread.sleep(5000);*/
		
	}
	
	
	
	//select Commodity Name 1
	public void selectCommName(String id,String CommodityName)
	{
		
	}
	
	//Select Commodity Name
	public void selectCommodityName(String id,String CommodityName)
	{
		
		String xp=".//*[@id='ui-id-"+id+"']";
		driver.findElement(By.xpath(xp)).click();
		
	}
	
	//Send Commodity Name
	public void sendHSNCode(String id,String HSN)
	{
			
			String xp=".//*[@id='"+id+"']/td[3]/input";
			System.out.println("My HSN COde::"+xp);
			
			driver.findElement(By.xpath(xp)).sendKeys(HSN);
			
	}
	
	//Send QTY Name
	public void sendQTY(String id,String QTY)
	{
			
			String xp=".//*[@id='"+id+"']/td[4]/input";
			driver.findElement(By.xpath(xp)).clear();
			driver.findElement(By.xpath(xp)).sendKeys(QTY);
			driver.findElement(By.xpath(".//*[@id='"+id+"']/td[5]/input")).click();
			
	}
	
	//Send QTY Name
	public void sendUnit(String id,String Unit)
	{
			
			String xp=".//*[@id='"+id+"']/td[5]/input";
			driver.findElement(By.xpath(xp)).sendKeys(Unit);
			
	}
	
	//Send PriceType
	public void sendPriceType(String id,String PriceType)
	{
		System.out.println("My Price Type----- ::"+PriceType);	
		
			String xp=".//*[@id='"+id+"']/td[6]/select/option["+PriceType+"]";
			System.out.println("My Price Type COde::"+xp);
			driver.findElement(By.xpath(xp)).click();
			
	}
	
	//Send Rate
	public void sendRate(String id,String Rate)
	{
		System.out.println("Rate::"+Rate);
			String xp=".//*[@id='"+id+"']/td[7]/input";
			driver.findElement(By.xpath(xp)).clear();
			driver.findElement(By.xpath(xp)).sendKeys(Rate);
			
	}
	
	//Send Discount
	public void sendDiscount(String id,String Discount)
	{
			
			String xp=".//*[@id='"+id+"']/td[8]/input";
			System.out.println("sendDiscount"+xp);
			driver.findElement(By.xpath(xp)).clear();
			driver.findElement(By.xpath(xp)).sendKeys(Discount);
			
			
			
	}
	
	//Send GST
	public void sendGST(String id,String option)
	{
			
			String xp=".//*[@id='"+id+"']/td[10]/select/option["+option+"]";
			driver.findElement(By.xpath(xp)).click();
			
	}
	
	
	//Send Total
	public void sendTotal(String id,String Total)
	{
			
			String xp=".//*[@id='"+id+"']/td[11]/input";
			driver.findElement(By.xpath(xp)).click();
			
	}
	
	
	//Click Delete
	
	public void clickDeleteIcon(String id)
	{
			
			String xp=".//*[@id='"+id+"']/td[12]/a/span";
			driver.findElement(By.xpath(xp)).click();
			
	}
	
	
	//Click Paid button
	public void clickPaidBtn()
	{
			
		paid.click();
			
	}
	
	
	//Click Due button
	
	public void clickDueBtn()
	{
			
		due.click();
			
	}
	
	
	//Click Generate Invoice Button
	
	public void clickGenerateInvoice()
	{
			
		GenerateInvoice.click();
			
	}
	
	
	
	
	

}
