package com.jackfruit.billbook.scripts;

import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.pages.DashboardPage;
import com.jackfruit.billbook.pages.EmpInfoPage;


public class TestSearchButton extends BaseTest{

	@Test(priority=2,enabled=true)
	public void testSearchButton(){
		//click on PIM menu
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickPIM_Menu();
		//verify Search Button is Present
		EmpInfoPage eiPage=new EmpInfoPage(driver);
		eiPage.checkSearchButtonIsPresent();
	}
}
