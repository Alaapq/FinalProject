package com.finalProject.testCases;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.finalProject.pageObject.LoginPage;
import com.finalProject.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BaseClass{
	int col=1;
  @Test (dataProvider ="LoginData")
  public void loginDDT(String user,String pwd,String pwd1) throws InterruptedException, IOException {
	  driver.get(baseUrl);

	  LoginPage lp= new LoginPage(driver);
	  lp.setUserName(user);
	  lp.setPassword(pwd);
	  lp.clickSubmit();

	  Thread.sleep(1000);
	  if(driver.getTitle().equals("nopCommerce demo store. Login")) {
		  driver.switchTo().defaultContent();
		  Assert.assertTrue(true);
		  XLUtils.writer(pathLoginData,testFail, col, 2 ,testFailColor);
		  col++;
	  }else {
		  Assert.assertTrue(false);
		  XLUtils.writer(pathLoginData,testPass, col, 2 ,testPassColor);
		  // lp.clickLogout();
		  Thread.sleep(1000);
		  driver.switchTo().defaultContent();


	  }

  }



  @DataProvider(name="LoginData")
  String [][] getData() throws IOException
  {
      int rownum  =XLUtils.getRowCount(pathLoginData,"Sheet1");
	  int colcount = XLUtils.getCellCount(pathLoginData,"Sheet1",1);
	  String logindata[][] =new String [rownum][colcount];

	  for(int i = 1;i<=rownum;i++) {
		  for(int j = 0;j<colcount;j++) {
			  logindata [i-1][j]=XLUtils.getCellData(pathLoginData,"Sheet1", i, j);

		  }
	  }


	  return logindata;
  }
}
