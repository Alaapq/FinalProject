package com.finalProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.finalProject.pageObject.AddCustomerPage;

public class TC_AddCustomerTest_003 extends BaseClass{



  @Test
  public void addCustomer() throws InterruptedException, IOException {

	  AddCustomerPage  addcust = new AddCustomerPage(driver);

	  addcust.clickAddNewCustomer();


	  if ( addcust.lnkRegistration().equals("Register")) {

		  addcust.boxGender();
		  addcust.txtFirstName(randomestring(5));
		  addcust.txtLastName(randomestring(6));
			String mm = randomeNumrical(2);
			if (Integer.parseInt(mm) >12){
				mm="12";
			}
			addcust.custdob(mm,randomeNumrical(2),"19"+randomeNumrical(2));

			String email=randomestring(6)+"@gmail.com";
			addcust.txtEmail(email);
			addcust.txtCompanyName(randomestring(8));
			if(!addcust.chkNewsletter()) {
				addcust.setchkNewsletter();
			}

			String pas=randomestring(10);
			addcust.txtPassword(pas);
			addcust.txtConfirmPassword(pas);
			addcust.btnSubmit();



			Thread.sleep(3000);


			if(addcust.lnkSuccess().equals("Your registration completed"))
			{
				 captureScreen(driver,"TC_AddCustomerTest_003");
				readconfig.write(email, pas);
				//writeconfig.setEmail(email);

				System.out.println("pas ="+ pas);
				//writeconfig.setPassword(pas);
				//writeconfig.save();

				addcust.btnContiune();
				Assert.assertTrue(true);
				//logger.info("test case passed....");

			}
			else
			{
				//logger.info("test case failed....");
				captureScreen(driver,"addNewCustomer");
				Assert.assertTrue(false);
				 captureScreen(driver,"TC_AddCustomerTest_003 error");
			}


	  }else {
		  ///// somthing wrong with registration page
			System.out.println("somthing wrong with registration page  ");
	  }

  }


}
