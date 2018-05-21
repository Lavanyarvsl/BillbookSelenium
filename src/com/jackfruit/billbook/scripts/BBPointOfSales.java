package com.jackfruit.billbook.scripts;

import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;
import com.jackfruit.billbook.base.HomePage;
import com.jackfruit.billbook.pages.BBPOSPage;

import generics.Utility;

public class BBPointOfSales extends BaseTest
{
	@Test(priority=10,enabled=true)
	public void testPointOfSale() throws Exception
	{
	
		BBPOSPage pos=new BBPOSPage(driver);
		
		pos.POSButton();
		//pos.sendCommodityName("0","Mixe","Mixed vegetables","3");
		
		//pos.sendQTY("1", "2");
		//Thread.sleep(5000);
		
		int rc=Utility.getExcelRowCount(INPUT_PATH, "POS");
		
		String CommType=null;
		String searchByName=null;
		String searchByNameId=null;
		String AutoSearchId=null;
		String CommodityName=null;
		String HSNId=null;
		String HSNCode=null;
		String qtyId=null;
		String qty=null;
		String unitId=null;
		String unit=null;
		String PriceTypeID=null;
		String PriceType =null;
		String Rate =null;
		String RateId =null;
		String DiscountId =null;
		String Discount =null;
		String TaxableAmountID =null;
		String GSTID =null;
		String GST =null;
		String TotalId=null;
		
		
		
		
		  for(int i=1;i<=rc;i++)
		  {
			  
			  CommType=Utility.getExcelCellValue(INPUT_PATH, "POS",i,0);
			  searchByName=Utility.getExcelCellValue(INPUT_PATH, "POS",i,1);
			  searchByNameId=Utility.getExcelCellValue(INPUT_PATH, "POS",i,2);
			  AutoSearchId=Utility.getExcelCellValue(INPUT_PATH, "POS",i,3);
			  CommodityName=Utility.getExcelCellValue(INPUT_PATH, "POS",i,4);
			  HSNId=Utility.getExcelCellValue(INPUT_PATH, "POS",i,5);
			  HSNCode=Utility.getExcelCellValue(INPUT_PATH, "POS",i,6);
			  qtyId=Utility.getExcelCellValue(INPUT_PATH, "POS",i,7);
			  qty=Utility.getExcelCellValue(INPUT_PATH, "POS",i,8);
			  
			  unitId=Utility.getExcelCellValue(INPUT_PATH, "POS",i,9);
			  unit=Utility.getExcelCellValue(INPUT_PATH, "POS",i,10);
			  
			  PriceTypeID=Utility.getExcelCellValue(INPUT_PATH, "POS",i,11);
			  PriceType=Utility.getExcelCellValue(INPUT_PATH, "POS",i,12);
			  RateId=Utility.getExcelCellValue(INPUT_PATH, "POS",i,13);
			  Rate=Utility.getExcelCellValue(INPUT_PATH, "POS",i,14);
			  DiscountId=Utility.getExcelCellValue(INPUT_PATH, "POS",i,15);
			  Discount=Utility.getExcelCellValue(INPUT_PATH, "POS",i,16);
			  TaxableAmountID=Utility.getExcelCellValue(INPUT_PATH, "POS",i,17);
			  GSTID=Utility.getExcelCellValue(INPUT_PATH, "POS",i,18);
			  GST=Utility.getExcelCellValue(INPUT_PATH, "POS",i,19);
			  TotalId=Utility.getExcelCellValue(INPUT_PATH, "POS",i,20);
			  
			  
			  
			  
			  if((CommType.equals("1")) || (CommType.equals("2")))
			  {	  
			
			  pos.sendCommodityName(searchByNameId,searchByName,CommodityName,AutoSearchId);
			  
			  pos.sendQTY(qtyId,qty);
			  
			  }
			  else  if((CommType.equals("3")) )
			  {
				  System.out.println("Add Dummy Commodity");
				  
				  pos.sendCommodityName(searchByNameId,CommodityName);
				  pos.sendHSNCode(HSNId, HSNCode);
				  pos.sendQTY(qtyId, qty);
				  pos.sendUnit(unitId, unit);
				  pos.sendPriceType(PriceTypeID,PriceType);
				  pos.sendRate(RateId,Rate);
				  pos.sendDiscount(DiscountId,Discount);
				  pos.sendGST(GSTID, GST);
				  
				  
				  
			  }
			 
			 
			  
		  }
		  
		 pos.clickGenerateInvoice();
		  
		  /*Thread.sleep(5000);
		  pos.clickGenerateInvoice();*/
		
	}
	
}
