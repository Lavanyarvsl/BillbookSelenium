package com.jackfruit.billbook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.jackfruit.billbook.base.HomePage;


/* Lavanya R -- 28-02-2018 */
public class EditEmpLeftNavigationMenu extends HomePage{

	public EditEmpLeftNavigationMenu(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id="empPic")
	private WebElement empPic;
	
	
	public void clickEmpPicId(){
		empPic.click();
	}

}
