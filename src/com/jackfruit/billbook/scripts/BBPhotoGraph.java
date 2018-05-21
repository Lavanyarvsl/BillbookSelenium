package com.jackfruit.billbook.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.pages.DashboardPage;
import com.jackfruit.billbook.pages.EditEmpLeftNavigationMenu;
import com.jackfruit.billbook.pages.EmployeeListPage;
import com.jackfruit.billbook.pages.PhotographDetPage;

import generics.Utility;

/* Lavanya R -- 28-02-2018 */

public class BBPhotoGraph extends BaseTest
{

	
	@Test(priority=9,enabled=true)
	public void testPersonalDetails() throws Exception
	{
		
		DashboardPage dbPage=new DashboardPage(driver);
		
		EmployeeListPage empListPage=new EmployeeListPage(driver);
		
		EditEmpLeftNavigationMenu empLefmenu=new EditEmpLeftNavigationMenu(driver);
		
		PhotographDetPage photo=new PhotographDetPage(driver);
		
		//Click on the PIM button of dashboard
		
		 dbPage.clickPIM_Menu();
		
        /*WebElement s=empListPage.getSpecificLinkText();
		WebElement ele=empListPage.getLinkText();
		System.out.println("Get Link Attribute::"+ele.getText());*/
		
		 
		//Click on the Specific Employee Id link of Employee List page
		empListPage.clickLinkID();
		
		//Click on the Specific Employee Profile Image of Edit profile Employ List left Navigation bar
		empLefmenu.clickEmpPicId();
		
		int rc=Utility.getExcelRowCount(INPUT_PATH, "photograph");
		
		for(int i=1;i<=rc;i++)
		{
			   
			String filePath=Utility.getExcelCellValue(INPUT_PATH, "photograph",i,0);
			
			
			photo.clickBrowseButton(filePath);
			
		}
		
		photo.clickUploadButton();
		
		photo.clickDeleteButton();
		
		photo.clickButtonYes();
		
	}
	
}
