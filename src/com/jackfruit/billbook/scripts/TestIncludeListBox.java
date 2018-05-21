package com.jackfruit.billbook.scripts;

import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.pages.DashboardPage;
import com.jackfruit.billbook.pages.EmpInfoPage;

public class TestIncludeListBox extends BaseTest{

	@Test(priority=5,enabled=true)
	public void testIncludeListBox(){
		//click PIM menu
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickPIM_Menu();
		
		EmpInfoPage eiPage=new EmpInfoPage(driver);
		//check Include LB has no duplicate
		eiPage.checkIncludeListBoxHasNoDuplicate();
				
		//check Include LB is sorted
		eiPage.checkIncludeListBoxIsSorted();
		
	}
	
}
