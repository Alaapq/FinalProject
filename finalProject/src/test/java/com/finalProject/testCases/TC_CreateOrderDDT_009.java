package com.finalProject.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.finalProject.pageObject.CreateOrderDDT;
import com.finalProject.pageObject.LoginPage;
import com.finalProject.utilities.XLUtils;
public class TC_CreateOrderDDT_009 extends BaseClass{
	int openPage =0;
	int col=1;
  @Test (dataProvider ="SearchData")
  public void createDDT(String title,String title1) throws InterruptedException, IOException {

	  if(openPage == 0 ) {
		  LoginPage lp= new LoginPage(driver);
		  lp.setUserName(useremail);
		  lp.setPassword(password);
		  lp.clickSubmit();
		  Thread.sleep(2000);
	      openPage=1;
	  }
	  if(driver.getTitle().equals("nopCommerce demo store") && !title.isEmpty()) { // page ready to take value
		  CreateOrderDDT createOrder =new CreateOrderDDT(driver);
		  createOrder.txtsearchStore(title);
		  Thread.sleep(1000);
		  createOrder.searchBtn();
		  Thread.sleep(3000);

		  if(driver.getTitle().equals("nopCommerce demo store. Search")) { // result page ready

			  if (createOrder.isThereItems()) {// there is result
				   createOrder. selectFormITems();
				   createOrder.clickLnkAddToCart();
				   if( createOrder.successAddedToCart()) {// add to cart
					   createOrder.clickLnkWishlist();
					   if (createOrder.successAddedWishlist()) {

						   // modify xlsx to success
						   assertEquals(true, true);
						   XLUtils.writer(pathSearchData,testPass, col, 1 ,testPassColor);
						   col++;
						   captureScreen(driver,"TC_CreateOrderDDT_009");
						   Thread.sleep(5000);
						   driver.navigate().back();
						   driver.navigate().back();

					   }else {

					   }
				   }else {// cant add to cart

				   }
			  }else {// there is no result around this title
				// modify xlsx to faild
				  XLUtils.writer(pathSearchData,testFail, col ,1,testFailColor);
				  captureScreen(driver,"TC_CreateOrderDDT_009 error");
			  }
			// driver.switchTo().defaultContent();
			// driver.switchTo().defaultContent();
		  }else {// result page not ready
//			  /System.out.println("faild "+ col);
		  }



	  }else {// page did not ready
		 // Assert.assertTrue(false);
		  assertEquals(true, false);
	  }

  }



  @DataProvider(name="SearchData")
  String [][] getData() throws IOException
  {
	  int rownum  =XLUtils.getRowCount(pathSearchData,"Sheet1");
	  int colcount = XLUtils.getCellCount(pathSearchData,"Sheet1",1);

	  String logindata[][] =new String [rownum-1][colcount];

	  for(int i = 1;i<rownum;i++) {
		  for(int j = 0;j<colcount;j++) {
			  String st =XLUtils.getCellData(pathSearchData,"Sheet1", i, j);
			  if (st!=null) {
				  logindata [i-1][j]=st;
			  }

		  }
	  }
	  return logindata;
  }
}
