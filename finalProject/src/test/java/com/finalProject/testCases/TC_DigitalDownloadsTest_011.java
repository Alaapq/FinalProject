package com.finalProject.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.finalProject.pageObject.DigitalDownloadsPage;
import com.finalProject.pageObject.EmailAFriendPage;
import com.finalProject.pageObject.LoginPage;

public class TC_DigitalDownloadsTest_011  extends BaseClass{


	  @Test
	  public void digitalDownloads() throws InterruptedException, IOException {

		  LoginPage lp= new LoginPage(driver);
		  lp.setUserName(useremail);
		  lp.setPassword(password);
		  lp.clickSubmit();

		  DigitalDownloadsPage digitalDown =new DigitalDownloadsPage(driver);
		  digitalDown.clickLnkDigDown();
		  System.out.println();
		  Thread.sleep(2000);
		  int lengthItems=digitalDown.getItemsLength();
		  for(int i=0;i<lengthItems;i++) {
			  digitalDown.clickPositionOfItem(i);
			  Thread.sleep(2000);
			  digitalDown.clickLnkDownload();

			  if (digitalDown.chkrangePrice()) {
				  digitalDown.setValidPrice();
			  }
			  digitalDown.clickLnkAddCart();
			  Thread.sleep(2000);
			  digitalDown.clicklnkEmailFriend();
				 if(driver.getTitle().contains("nopCommerce demo store. Email A Friend.")) {
					 EmailAFriendPage emailFriend =new EmailAFriendPage(driver);
					 emailFriend.setFriendEmail();
					 Thread.sleep(1000);
					 emailFriend.setYourEmail(useremail);
					 Thread.sleep(1000);
					 emailFriend.setPersonalMessage();
					 Thread.sleep(2000);
					 emailFriend.clickBtnSendEmail();
					 // continue after test

					 if (emailFriend.chekIfAppearResult()) {
						 captureScreen(driver,"TC_DigitalDownloadsTest_011 ");
						 assertEquals(true, true);

					 }else {
						 assertEquals(true, false);
						 captureScreen(driver,"TC_DigitalDownloadsTest_011 ");
					 }

				 }else {
					 assertEquals(true, false);
				 }

				 break;
		  }


  }




}
