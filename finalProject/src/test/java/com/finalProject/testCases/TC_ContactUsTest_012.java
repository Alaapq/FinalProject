package com.finalProject.testCases;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.Test;
import com.finalProject.pageObject.ContactUsPage;
import com.finalProject.pageObject.LoginPage;

public class TC_ContactUsTest_012  extends BaseClass{


	  @Test
	  public void contactUs() throws InterruptedException, IOException {

		  LoginPage lp= new LoginPage(driver);
		  lp.setUserName(useremail);
		  lp.setPassword(password);
		  lp.clickSubmit();

		  ContactUsPage contaUs =new ContactUsPage(driver);
		  contaUs.clicklnkContUs();
		  System.out.println();
		  Thread.sleep(2000);
		  
			 if(driver.getTitle().equals("nopCommerce demo store. Contact Us")) {
				 contaUs.setEnquiry();
				 Thread.sleep(1000);
				 contaUs.submitBtnSend();
							 
				 if (contaUs.chekIfAppearResult()) {
					 captureScreen(driver,"TC_ContactUsTest_012");
					 assertEquals(true, true);  

				 }else {
					 assertEquals(true, false); 
					 captureScreen(driver,"TC_ContactUsTest_012 error");
				 }

			 }else {
				 assertEquals(true, false); 	 
			 }	 
		  }

	
  




}
