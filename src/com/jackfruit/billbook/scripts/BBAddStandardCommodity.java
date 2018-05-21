package com.jackfruit.billbook.scripts;

import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.pages.BBAddNewCommodityOverlay;
import com.jackfruit.billbook.pages.BBCommodity;

import generics.Utility;


public class BBAddStandardCommodity extends BaseTest{

	@Test(priority=9,enabled=true)
	public void testAddStandardCommodity() throws Exception
	{
		
		BBCommodity comm=new BBCommodity(driver);
		
		BBAddNewCommodityOverlay addNewComm=new BBAddNewCommodityOverlay(driver);
		
		
		 String CommodityType=null;
		 String srhByName=null;
		 String Name=null;
		 String  category=null;
		 
		 String  hsnCode=null;
		 
		 String  gst=null;
		 
		 String  chapter=null;
		 
		 String  schedule=null;
		 
		 
		 String PracticeName=null;
		 
		 String Unit=null;
		 
		 String PriceStatus=null;
		 
		 String Price=null;
		 
		 String Stock=null;
		 
		 String Discount=null;
		 
		 String MerchentID=null;
		 
		 
		 
		 
		/*
		comm.CommoditiesButtonClick();
		
		comm.clickaddCommStdListBtn();
		
		//comm.clickGoodsBtn();
		
		comm.selectCategory(2);*/
		
		
		/*int rc1=Utility.getExcelRowCount(INPUT_PATH, "StdCommodity");
		System.out.println("Row Count::"+rc1);
		
		
		
		
		  for(int i=1;i<=rc1;i++)
		  {
			   srhByName=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,1);
			   
			   System.out.println("My search By Name::"+srhByName);
		  }
		
		comm.searchByName(srhByName);
		
		comm.clicksearchButton();
		
		comm.clickAddButton();*/
		
		
		/*
		
		
		
		addNewComm.sendPracticeName("Mixed Vegetables");
		addNewComm.sendInputUnit("KG");
		
		addNewComm.PriceStatus("2");
		
		addNewComm.sendInputPrice("400");
		
		addNewComm.sendInputStock("50");
		
		addNewComm.sendInputDiscount("10");
		
		addNewComm.sendMerchantID("0");
		
		addNewComm.clickSubmitButton();*/
		
		
		 comm.CommoditiesButtonClick();
		
		/***   Getting Data From excel     ***/
		
		int rc=Utility.getExcelRowCount(INPUT_PATH, "StdCommodity");
		
		System.out.println("My Row Count::"+rc);
		
		  for(int i=1;i<=rc;i++)
		  {
			  
			 
			  //comm.clickaddCommStdListBtn();
			  
			  
			  CommodityType=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,0);
			  
			  
			  srhByName=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,1);
			  
			  Name=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,2);
			  
			  category=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,3);
			   
			  hsnCode=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,4); 
			  
			  gst=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,5);
			  
			  chapter=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,6);
			  
			   schedule=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,7);
			  
			   PracticeName=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,8);
			  
			   Unit=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,9);
			  
			   PriceStatus=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,10);
			  
			   Price=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,11);
			  
			   Stock=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,12);
			  
			   Discount=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,13);
			  
			   MerchentID=Utility.getExcelCellValue(INPUT_PATH, "StdCommodity",i,14);
			  
			  
			
			  
			  
			  
			  System.out.println("My CommodityType"+CommodityType);
			  
			  
			  //int commType = Integer.parseInt(CommodityType);
			  
			  
			 String name1= "1.0";
			 String name2= "2.0"; 
			  
			 
			  if(CommodityType.equals(name1))
			  {	  
			  
			  System.out.println("My search By Name::"+srhByName);
			  comm.clickaddCommStdListBtn();
			   
			 comm.selectCategory(category);
			   
			 comm.searchByName(srhByName);
				
			//comm.clicksearchButton();
				
			 comm.clickAddButton();
			  
			  
		    addNewComm.sendPracticeName(PracticeName);
		  
		    addNewComm.sendInputUnit(Unit);
			
			addNewComm.PriceStatus(PriceStatus);
			
			addNewComm.sendInputPrice(Price);
			
			addNewComm.sendInputStock(Stock);
			
			addNewComm.sendInputDiscount(Discount);
			
			addNewComm.sendMerchantID(MerchentID);
			
			addNewComm.clickSubmitButton();
			  
			Thread.sleep(1000);
			
			
			}
			else if(CommodityType.equals(name2))
			{
				comm.clickAddNewCommButton();
				addNewComm.searchByName(Name);
				addNewComm.selectCategory(category);
				addNewComm.sendHSNCode(hsnCode);
				addNewComm.selectGST(gst);
				addNewComm.sendChapter(chapter);
				addNewComm.sendSchedule(schedule);
				
				addNewComm.sendPracticeName(PracticeName);
				  
			    addNewComm.sendInputUnit(Unit);
				
				addNewComm.PriceStatus(PriceStatus);
				
				addNewComm.sendInputPrice(Price);
				
				addNewComm.sendInputStock(Stock);
				
				addNewComm.sendInputDiscount(Discount);
				
				addNewComm.sendMerchantID(MerchentID);
				
				addNewComm.clickSubmitButton();
				  
				Thread.sleep(1000);
				
			}
			
			
			  
			System.out.println("My Row Count::"+rc);  
			  
		  }
		  
		
		
		
		
		
		
		
	}
	
}
