package com.jackfruit.billbook.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.jackfruit.billbook.base.BasePage;

public class BBLoginPage extends BasePage{

	public BBLoginPage(WebDriver driver) 
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
	
	
	public void login(String un,String pw) throws Exception
	{
		
		loginThrough.click();
		emailId.click();
		userName.sendKeys(un);
		password.sendKeys(pw);
		btnSignIn.click();
		
		
	}
	
	

}
