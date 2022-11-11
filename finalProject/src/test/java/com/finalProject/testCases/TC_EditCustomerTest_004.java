package com.finalProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.finalProject.pageObject.EditCustomerPage;
import com.finalProject.pageObject.LoginPage;

public class TC_EditCustomerTest_004  extends BaseClass{


	  @Test
	  public void editCustomer() throws InterruptedException, IOException {

		  LoginPage lp= new LoginPage(driver);
		  lp.setUserName(useremail);
		  lp.setPassword(password);
		  lp.clickSubmit();

		  EditCustomerPage editcust =new EditCustomerPage(driver);
		  editcust.clicklnkMyAccount();
		  editcust.clicklnkCustomerInfo();
		  System.out.println("editcust.lnkTitleCustomerInfo() "+editcust.lnkTitleCustomerInfo());

		  try {
			  if (editcust.lnkTitleCustomerInfo().equals("My account - Customer info")) {
				  editcust.boxGender();
				  editcust.txtFirstName(randomestring(5));
				  editcust.txtLastName(randomestring(6));
					String mm = randomeNumrical(2);


					if (Integer.parseInt(mm) >12){ mm="12"; }
					mm=getMounthStatement(mm);
					editcust.custdob(mm,randomeNumrical(2),"19"+randomeNumrical(2));// mm,randomeNumrical(2),"19"+randomeNumrical(2)

					editcust.txtCompanyName(randomestring(8));
					if(!editcust.chkNewsletter()) {
						editcust.setchkNewsletter();
					}


					   editcust.clickbtnSave();
					   Thread.sleep(2000);

						  boolean rr= editcust.chekError();
						  System.out.println("rr =" +rr);
						 if(rr) {
						   Assert.assertTrue(true);
						 Thread.sleep(1000);
						 driver.switchTo().defaultContent();

					    }else {
						  driver.switchTo().defaultContent();
				   	      Assert.assertTrue(false);
						  captureScreen(driver,"editCustomer");
						}

			  }else {
				  // Edit Customer Form did not show
				  System.out.println("@ Edit Customer Form did not show false");
			  }
		  }catch (Exception e) {
			  System.out.println("@ Edit Customer Form did not show" +e.getMessage());
		  }

  }




}
