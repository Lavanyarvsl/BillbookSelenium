package com.jackfruit.billbook.scripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.pages.LoginPage;


public class TestLoginButtonIsPresent extends BaseTest{
	@BeforeClass
	public void disableAutoLoginLogout(){
		loginlogoutRequired=false;
	}
	
	@Test(priority=3,enabled=true)
	public void  testLoginButtonIsPresent(){
		LoginPage lPage=new LoginPage(driver);
		lPage.checkLoginButtonIsPresent();
	}
}
