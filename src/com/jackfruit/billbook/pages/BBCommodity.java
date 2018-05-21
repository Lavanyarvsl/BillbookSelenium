package com.jackfruit.billbook.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.jackfruit.billbook.base.BBSecondaryNavigationBarPage;

public class BBCommodity extends BBSecondaryNavigationBarPage
{

	public BBCommodity(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	@FindBy(xpath=".//*[@id='tablet']/li[2]/a")
	private WebElement addCommStdListBtn;
	
	@FindBy(xpath=".//*[@id='myId']/option[2]")
	private WebElement goodsbtn;
	
	
	
	@FindBy(id="names")
	private WebElement searchByName;
	
	@FindBy(id="searchButton")
	private WebElement searchButton;
	
	@FindBy(id="hellobutton")
	private WebElement hellobutton;
	
	@FindBy(id="addNewCommodity")
	private WebElement addNewCommodity;
	
	
	
	
	//select the Goods button
	
	
	
	

	
	public void selectCategory(String category)
	{
		
		String xp=".//*[@id='myId']/option["+category+"]";
		driver.findElement(By.xpath(xp)).click();
	}
	
	
	
	//click on the Add Commodity from Standard list button
	public void clickaddCommStdListBtn()
	{
		addCommStdListBtn.click();
	}
	
	//click on the Add Commodity from Standard list button
	public void clickGoodsBtn()
	{
			goodsbtn.click();
	}
	
	//search by name
		
	public void searchByName(String name) throws InterruptedException
	{
		/*searchByName.sendKeys(name);
		WebElement autoOptions = driver.findElement(By.xpath(".//*[@id='names']"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		
		
		
		
		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect)
		{
	        if(option.getText().equals(name)) 
	        {
	        	System.out.println("Trying to select: "+name);
	            option.click();
	            break;
	        }
	    }
		*/
		
		
		searchByName.sendKeys(name);
		//driver.findElement(By.xpath(".//*[@id='names']")).sendKeys(Keys.ARROW_DOWN);
		
		
		WebElement autoOptions = driver.findElement(By.xpath(".//*[@id='ui-id-2']"));
		
		autoOptions.click();
		
		
		/*wait.until(ExpectedConditions.visibilityOf(autoOptions));
		
		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect)
		{
	        if(option.getText().equals(name)) 
	        {
	        	System.out.println("Trying to select: "+name);
	            option.click();
	            break;
	        }
	    }
		
		*/
		
		
		//driver.findElement(By.id("names")).sendKeys(Keys.TAB); 
		//driver.findElement(By.id("names")).sendKeys(Keys.ARROW_DOWN); 
		
		
		//driver.findElement(By.id("names"));
		//assign key board object
	      // Keyboard keyboard=((HasInputDevices) driver).getKeyboard();
	       //enter a key
	    //keyboard.pressKey(Keys.ARROW_DOWN);
	    
	    System.out.println("jhkhkhkhkhjk");
	    
		Thread.sleep(1000);
		
		
		
		//driver.findElement(By.id("names")).sendKeys(Keys.ENTER); 
		/*Actions actionObject = new Actions(driver);
		actionObject.sendKeys(Keys.ARROW_DOWN);*/
		//searchByName.sendKeys(Keys.ARROW_DOWN);
		/*WebElement autoOptions = driver.findElement(By.xpath(".//*[@id='names']"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		
		
		
		
		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect)
		{
	        if(option.getText().equals(name)) 
	        {
	        	System.out.println("Trying to select: "+name);
	            option.click();
	            break;
	        }
	    }*/
		
		
		
	}
		
	//click on search button
	
	public void clicksearchButton()
	{
		searchButton.click();
	}
	
	//click on Add button
	
	
	public void clickAddButton()
	{
		hellobutton.click();
	}
	
	
	public void clickAddNewCommButton()
	{
		addNewCommodity.click();
	}
	
	
}
