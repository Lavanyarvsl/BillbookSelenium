package com.jackfruit.billbook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jackfruit.billbook.base.HomePage;



/* LAVANYA R -- 27-02-2018 */

public class AddEmployeePage extends HomePage
{

	public AddEmployeePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="middleName")
	private WebElement middleName;
	
	
	@FindBy(id="photofile")
	private WebElement photofile;
	
	
	@FindBy(id="chkLogin")
	private WebElement chkLogin;
	
	
	@FindBy(id="user_name")
	private WebElement user_name;
	

	@FindBy(id="user_password")
	private WebElement user_password;
	
	
	@FindBy(id="re_password")
	private WebElement confirmPassword;
	
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	public void setFirstName(String fn){
		firstName.sendKeys(fn);
	}
	
	public void setLastName(String ln){
		lastName.sendKeys(ln);
	}
	
	
	public Object setphotofile(String pf){
		photofile.sendKeys(pf);
		return pf;
	}
	
	
	public void setMiddleName(String mn){
		middleName.sendKeys(mn);
	}
	

	public void setuserName(String usrName){
		user_name.sendKeys(usrName);
	}
	
	
	public void setUserPassword(String usrPswd){
		user_password.sendKeys(usrPswd);
	}
	
	
	
	

	public void setConfirmPassword(String conPswd){
		confirmPassword.sendKeys(conPswd);
	}

	public Object setchkLogin(){
		chkLogin.click();
		return btnSave;
	}
	
	
	
	
	public void clickSave(){
	btnSave.click();
	}
	
	
}
