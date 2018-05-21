package com.jackfruit.billbook.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.jackfruit.billbook.base.BasePage;

public class BBLoginPage2 extends BasePage{

	public BBLoginPage2(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	@FindBy(id="loginThrough")
	private WebElement loginThrough;
	
	@FindBy(id="email_logi")
	private WebElement emailId;
	
	@FindBy(id="userName")
	private WebElement userName;
	
	
	@FindBy(id="password")
	private WebElement password;
	
	
	@FindBy(xpath=".//*[@id='adminlog-form2']/div[4]/div[2]/input")
	private WebElement btnSignIn;
	
	
	public void login(String un,String pw) throws Exception{
		
		loginThrough.click();
		emailId.click();
		userName.sendKeys(un);
		password.sendKeys(pw);
		btnSignIn.click();
		
		//WebElement value = driver.findElement(By.xpath(".//*[@id='summary-bar-chart']/svg/rect[1]"));
		
		
		
		
		//List<WebElement> allElement=driver.findElements(By.xpath(".//*[@id='summary-bar-chart']/*[name()='div']/div[2]"));
		/*List<WebElement>  ele= driver.findElements(By.id("summary-bar-chart"));
		
          Actions actions = new Actions(driver);
          actions.moveToElement(ele).build().perform();
		
		ele.getText();*/	
		
		/*List<WebElement> fields = (List<WebElement>) driver.findElement(By.id("summary-bar-chart"));
		System.out.println(fields.size());
		*/
		//System.out.println("dsfgdsfsfdsfsdfsdf:::"+ele.getText());
		
		
		
		
		
		
		
		
		List<WebElement> allElements = driver.findElements(By.id("summary-bar-chart"));
		//List<WebElement> allElements = driver.findElements(By.id("commodity-bar-chart"));
		//Create object 'action' of an Actions class
		Actions action = new Actions(driver);
		
		
		for(WebElement element:allElements)
		{
			String tagName=element.getTagName();
			//System.out.println("dfgdfffffffffffffffffffg"+tagName);
			
			
			/**Happy Finally I Got You**/
			
			/*action.moveToElement(element, 0, 25).click().build().perform();//Sales
			System.out.println("Here I am Getting the Text of Sales Graph"+element.getText());
			
			Thread.sleep(5000);
			
			
			action.moveToElement(element, 100, 25).click().build().perform();//Purchase
			Thread.sleep(5000);
			
			
			
			action.moveToElement(element, 200, 25).click().build().perform();//Tax Paid
			Thread.sleep(5000);
			
			
			
			action.moveToElement(element, 300, 25).click().build().perform();//GST Collected
			Thread.sleep(5000);*/
			
			
			
			
			action.moveToElement(element, 200, 25).click().build().perform();
			
			
			
			/**Happy Finally I Got You**/
			
			
			
			
			
			
			
			
			
			//https://stackoverflow.com/questions/12925310/how-to-hover-over-and-click-on-an-invisible-element-using-selenium-webdriver
			
			//action.moveToElement(element,100,25).click().build().perform();
			//action.moveToElement(element,170,25).click().build().perform();//Tax Paid
			//action.moveToElement(element, 10, 25).click().build().perform();//Sales
			//action.moveToElement(element).perform();
			
			if(tagName.equals("Purchase"))
			{
			System.out.println("element.getText();"+element.getText());
			}
		
		}
		
		
		
		
		
		
		
		//Mouseover on an element
		 	//action.moveToElement(ele).build().perform();
		
		
	    Thread.sleep(3000);
		
		
	    System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkk");
		
		
		
		/*
		List<WebElement> allElements = driver.findElements(By.xpath("//*"));
		int line=0;
		
		Actions actions = new Actions(driver);
		
		System.out.println("All Elements::::"+allElements.size());
		
		for(WebElement element:allElements)
		{
			String tagName=element.getTagName();
			
			System.out.println("dfgdfffffffffffffffffffg");
			
			if(tagName.equals("Purchase"))
			{
				line++;
				
				
				actions.moveToElement(element).perform();
				Thread.sleep(2000);
				
				
				String xp="./following-sibling::*[1]/*[2]";
				WebElement toolTip = element.findElement(By.xpath(xp));
				System.out.println("Tooltips text:"+toolTip.getText());
				
				System.out.println(line);
				driver.quit();
			}}*/
		
	/*	List<WebElement> allElements =	driver.findElements(By.xpath("//*"));
		Actions actions = new Actions(driver);
		System.out.println(allElements.size());
		int line=0;
		for(WebElement element:allElements)
		{
			String tagName=element.getTagName();
			
			System.out.println("dfgdfffffffffffffffffffg");
			
			if(tagName.equals("Purchase"))
			{
				line++;
				
				
				actions.moveToElement(element).perform();
				Thread.sleep(2000);
				
				
				String xp="./following-sibling::*[1]/*[2]";
				WebElement toolTip = element.findElement(By.xpath(xp));
				System.out.println("Tooltips text:"+toolTip.getText());
				
				System.out.println(line);
				driver.quit();
			}}*/
				
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
	
	

}
