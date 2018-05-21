package com.jackfruit.billbook.scripts;
import org.testng.annotations.Test;

import com.jackfruit.billbook.base.BaseTest;



public class BBLoginLogoutTest extends BaseTest{
	@Test(priority=1,enabled=true)
	public void testAutoLoginLogout1(){
		log.info("This script will automatically login and logout");
	}
}
