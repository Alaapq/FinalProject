package com.finalProject.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.finalProject.pageObject.AddAddressesCustomerPage;
import com.finalProject.pageObject.LoginPage;

public class TC_AddAddressesCustomerPage_005 extends BaseClass{

  @Test
  public void addAddressesCustomer() throws InterruptedException, IOException {

	  LoginPage lp= new LoginPage(driver);
	  lp.setUserName(useremail);
	  lp.setPassword(password);
	  lp.clickSubmit();
	  AddAddressesCustomerPage addNew =new AddAddressesCustomerPage(driver);
	  addNew.lnkMyAccount();
	  addNew.clickLnkAddAddresses();

	  if (addNew.lnkTitlePage().equals("My account - Addresses")) {
		  // check if the title is correct

		  // check if there is list of addresses or not
		  addNew.btnAddAddresses();

		  if (addNew.lnkTitleAddNewAddress().equals("My account - Add new address")) {

			  addNew.txtFirstName(randomestring(6));
			  addNew.txtLastName(randomestring(6));
			  String email=randomestring(7)+"@gmail.com";
			  addNew.txtEmail(email);
			  addNew.txtCompany(randomestring(6));
			  addNew.txtCity(randomestring(5));
			  addNew.txtAddress1(randomestring(8));
			  addNew.txtAddress2(randomestring(5));
			  addNew.txtAddressZipPostalCode(randomeNumrical(6));
			  addNew.txtPhoneNumber("987"+randomeNumrical(6));
			  addNew.txtFaxNumber("987"+randomeNumrical(6));


			  addNew.selCountryId();
			  addNew.selStateProvinceId();


			  addNew.btnSave();
			  // if errors were show

			  boolean rr= addNew.chekError();
			  System.out.println("rr =" +rr);
			  if(rr) {
			   Assert.assertTrue(true);
			 Thread.sleep(1000);
			 captureScreen(driver,"TC_AddAddressesCustomerPage_005");
			 //driver.switchTo().alert().dismiss();

		    }else {
			  driver.switchTo().defaultContent();
	   	      Assert.assertTrue(false);
			  captureScreen(driver,"addAddressesCustomer Add new address");
			}


		  }
		  else {// some thing wronge with "My account - Add new address"
			  System.out.println("@ some thing wronge with My account - Add new address");
		  }


	  }else {// some thing wronge with "My account - Addresses"
		  System.out.println("@ some thing wronge with My account - Addresses");
		  captureScreen(driver,"TC_AddAddressesCustomerPage_005 error");
	  }



  }



  @Test
  public void addAddressesIfExitsCustomer() throws InterruptedException, IOException {

	  AddAddressesCustomerPage editNew =new AddAddressesCustomerPage(driver);

	  editNew.clickLnkAddAddresses();


	  if (editNew.lnkTitlePage().equals("My account - Addresses")) {
		  // check if the title is correct

			  // check if there is list of addresses or not

			  boolean rt= editNew.thereIsAddressSection();
			  Thread.sleep(2000);
			  if (rt) {

				 editNew.btnedit();
				 editNew.clearFlds();
				 Thread.sleep(1000);



				 editNew.txtFirstName(randomestring(6));
				 editNew.txtLastName(randomestring(6));
				  String email=randomestring(7)+"@gmail.com";
				  editNew.txtEmail(email);
				  editNew.txtCompany(randomestring(6));
				  editNew.txtCity(randomestring(5));
				  editNew.txtAddress1(randomestring(8));
				  editNew.txtAddress2(randomestring(5));
				  editNew.txtAddressZipPostalCode(randomeNumrical(6));
				  editNew.txtPhoneNumber("987"+randomeNumrical(6));
				  editNew.txtFaxNumber("987"+randomeNumrical(6));


				  editNew.selCountryId();
				  editNew.selStateProvinceId();


				  editNew.btnSave();
				  // if errors were show

				  boolean rr= editNew.chekError();

				  if(rr) {
				   Assert.assertTrue(true);
				 Thread.sleep(1000);
				 driver.switchTo().defaultContent();

			    }else {
				  driver.switchTo().defaultContent();
		   	      Assert.assertTrue(false);
		   	     captureScreen(driver,"TC_AddAddressesCustomerPage_005 error");
				}


			  }



	  }else {// some thing wronge with "My account - Addresses"
		  System.out.println("@ some thing wronge with My account - Addresses");
	  }




  }



  /*
  @Test
  public void deleteAddressesIfExitsCustomer() throws InterruptedException, IOException {

	  AddAddressesCustomerPage editNew =new AddAddressesCustomerPage(driver);

	  editNew.clickLnkAddAddresses();

	  if (editNew.lnkTitlePage().equals("My account - Addresses")) {
		  // check if the title is correct

			  // check if there is list of addresses or not

			  boolean rt= editNew.thereIsAddressSection();
			  Thread.sleep(2000);
			  if (rt ==true) {

				 editNew.btndelete();
				 Thread.sleep(1000);


				 if(acceptAlertPresent() == true) {
				   Assert.assertTrue(true);
				  logger.info("pass to addAddressesCustomer delete address");
				 Thread.sleep(2000);
				 driver.switchTo().defaultContent();

			    }else {
				  driver.switchTo().defaultContent();
		   	      Assert.assertTrue(false);
				  logger.info("failed to addAddressesCustomer delete address" );
				  captureScreen(driver,"addAddressesCustomer delete address");
				}


			  }



	  }else {// some thing wronge with "My account - Addresses"
		  System.out.println("@ some thing wronge with My account - Addresses");
	  }




  }
  */
}
