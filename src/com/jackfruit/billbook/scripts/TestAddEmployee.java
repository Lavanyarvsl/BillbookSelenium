package com.jackfruit.billbook.scripts;

import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.pages.AddEmployeePage;
import com.jackfruit.billbook.pages.DashboardPage;

import generics.Utility;

/* LAVANYA R -- 27-02-2018 */


public class TestAddEmployee extends BaseTest
{
	@Test(priority=8,enabled=true)
	public void testAddEmployee() throws Exception
	{
		
		int rc=Utility.getExcelRowCount(INPUT_PATH, "AddEmp");
		
		   for(int i=1;i<=rc;i++){
			   
			   
			String fn=Utility.getExcelCellValue(INPUT_PATH, "AddEmp",i,0);
			String mn=Utility.getExcelCellValue(INPUT_PATH, "AddEmp",i,1);
			String ln=Utility.getExcelCellValue(INPUT_PATH, "AddEmp",i,2);
			
			
			String filePath=Utility.getExcelCellValue(INPUT_PATH, "AddEmp",i,3);
			
			String un=Utility.getExcelCellValue(INPUT_PATH, "AddEmp",i,4);
			String pswd=Utility.getExcelCellValue(INPUT_PATH, "AddEmp",i,5);
			String confirmPswd=Utility.getExcelCellValue(INPUT_PATH, "AddEmp",i,6);
			
			
			// go to PIM->add employee
			DashboardPage dbPage=new DashboardPage(driver);
			dbPage.clickPIM_Menu();
			dbPage.click_AddEmp_Menu();
			//enter Fn, LN & Save;
			
			
			AddEmployeePage addEmp=new AddEmployeePage(driver);
			
			addEmp.setFirstName(fn);
			addEmp.setMiddleName(mn);
			addEmp.setLastName(ln);
			
			addEmp.setphotofile(filePath);
			
			//Thread.sleep(10000);
			
			Object a = addEmp.setchkLogin();
			
			//System.out.println("BBBBBBBB:::"+a);
			
			addEmp.setuserName(un);
			
			addEmp.setUserPassword(pswd);
			addEmp.setConfirmPassword(confirmPswd);
			
			addEmp.clickSave();
			
			
			
		
		}
	}
	
	
  
}
