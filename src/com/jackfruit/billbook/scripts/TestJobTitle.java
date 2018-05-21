package com.jackfruit.billbook.scripts;

import generics.Utility;

import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.pages.AddJobTitlePage;
import com.jackfruit.billbook.pages.DashboardPage;
import com.jackfruit.billbook.pages.JobTitlesPage;



public class TestJobTitle extends BaseTest{

	@Test(priority=6,enabled=true)
	public void testJobTitle(){
		String title=Utility.getExcelCellValue(INPUT_PATH,"JobTitle",1,0);
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickAdminModule();
		dbPage.moveToJobMenu();
		dbPage.clickJobTitleMenu();
		
		JobTitlesPage jtPage=new JobTitlesPage(driver);
		jtPage.clickAdd();
		AddJobTitlePage ajtPage=new AddJobTitlePage(driver);
		ajtPage.setJobTitle(title);
		ajtPage.clickSave();
		
		jtPage.checkJobTitleIsPresent(title);
		jtPage.selectJobTitleCheckBox(title);
		jtPage.clickDelete();
		jtPage.clickOK();
		jtPage.checkJobTitleIsNotPresent(title);
		
	}
}
