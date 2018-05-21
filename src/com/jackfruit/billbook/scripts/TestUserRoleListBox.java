package com.jackfruit.billbook.scripts;

import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.pages.DashboardPage;
import com.jackfruit.billbook.pages.SystemUsersPage;


public class TestUserRoleListBox extends BaseTest{

	@Test(priority=7,enabled=true)
	public void testUserRoleListBox(){
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickAdminModule();
		dbPage.moveToUserManagementMenu();
		dbPage.clickUsersMenu();
		
		SystemUsersPage suPage=new SystemUsersPage(driver);
		suPage.checkUserRoleListBoxIsSorted();
	}
}
