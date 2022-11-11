package com.finalProject.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.finalProject.pageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass{




  @Test
  public void loginTest() throws IOException, InterruptedException
	{

	    driver.get(baseUrl);
		LoginPage lp=new LoginPage(driver);

		lp.setUserName(useremail);

		lp.setPassword(password);

		lp.clickSubmit();
		Thread.sleep(5000);


		if(!driver.getTitle().equals("nopCommerce demo store. Login") )
		{
			//lp.clickContiune();
			Assert.assertTrue(true);
		}
		else
		{

			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			System.out.println("Login test failed");
		}


	}
}
