package com.finalProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.finalProject.pageObject.CreateOrder;
import com.finalProject.pageObject.LoginPage;

public class TC_CreateOrderPage_007 extends BaseClass{
  @Test
  public void createOrder() throws InterruptedException, IOException {

	  LoginPage lp= new LoginPage(driver);
	  lp.setUserName(useremail);
	  lp.setPassword(password);
	  lp.clickSubmit();

	  CreateOrder crtOrd =new CreateOrder(driver);
	  crtOrd.lnkComputer();
	  crtOrd.lnkItemGridClass();
	  if (crtOrd.lnkAvailability()) {

		  if (crtOrd.lnkdelivery()) {
			  // Delivery is free
			  if (crtOrd.thereIsAttributes()) {
				  // there are attributes and need to defind

				  crtOrd.lstOfProcessor();
				  crtOrd. lstOfRAM();
				  crtOrd.lstOfHDD();
				  crtOrd.AddToCart();
				  Thread.sleep(3000);


				  if(crtOrd.notificationSuccess()) {
					  //Success test
						Assert.assertTrue(true);

					}
					else
					{
						 //Failed test
						captureScreen(driver,"CreateOrder");
						Assert.assertTrue(false);
					}


				  }
				  else {

					  crtOrd.AddToCart();
					   Thread.sleep(3000);


					  if(crtOrd.notificationSuccess()) {
						  //Success test
							Assert.assertTrue(true);

						}
						else
						{
							 //Failed test");
							captureScreen(driver,"CreateOrder");
							Assert.assertTrue(false);
						}

				  }
		  }else {
			 // Delivery is for fees and need to choice

			  crtOrd. lnkProductEstimateShipping();
			  Thread.sleep(2000);
			  crtOrd. selCountryId();
			  crtOrd. selStateProvinceId();
			  crtOrd.txtZipPostalCode(randomeNumrical(7));
			  Thread.sleep(1000);
			  crtOrd.btnApply();
			  Thread.sleep(2000);

			  boolean tt= crtOrd.chkMessageFailure();
			  if(!tt) {
				  //Success test
					Assert.assertTrue(true);

				}
				else
				{
					 //Failed test
					crtOrd.lnkMfpClose();
					captureScreen(driver,"CreateOrder");
					Assert.assertTrue(false);
				}



		  }

	  } else {
		//  System.out.println("@ CreateOrder not in stock");
	  }


  }
}
