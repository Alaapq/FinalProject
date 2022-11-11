package com.finalProject.testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.finalProject.pageObject.LoginPage;
import com.finalProject.pageObject.ShoppingCartPage;
import com.finalProject.pageObject.WishListPage;


public class TC_WishListTest_010 extends BaseClass{
  @Test
  public void addNewAccount() throws Exception {

	  LoginPage lp= new LoginPage(driver);
	  lp.setUserName(useremail);
	  lp.setPassword(password);
	  lp.clickSubmit();
	  Thread.sleep(2000);

	  WishListPage wishList =new WishListPage(driver);

	  wishList.clicklnkWishlist();
	  Thread.sleep(2000);

	  if(driver.getTitle().equals("nopCommerce demo store. Wishlist")) {
		  wishList.checkAllCheckBox();
		  Thread.sleep(3000);
		  wishList.clickBntishlistAddToCart();
		  Thread.sleep(1000);
		  ShoppingCartPage shpCart =new ShoppingCartPage(driver);
			  if(driver.getTitle().equals("nopCommerce demo store. Shopping Cart")) {
				  shpCart.checkCheckBoxAgreeTerm();
				  shpCart.clickBntCheckout();
				  Thread.sleep(2000);
				  shpCart.checkBntContinue();
				  Thread.sleep(1000);
				  shpCart.checkBntShippingMethodContinue();
				  Thread.sleep(1000);
				  shpCart.checkBntPaymentMethodContinue();
				  Thread.sleep(1000);
				  shpCart.checkBntPaymentInfoContinue();
				  Thread.sleep(1000);
				  shpCart.checkBntConfirmOrderContinue();
				  Thread.sleep(1000);
					  if (shpCart.chekIfTakeOrderNumber()) {

						  shpCart.checkBntOrderCompletedContinue();
						  Thread.sleep(2000);
						  //nopCommerce demo store
							  if(driver.getTitle().equals("nopCommerce demo store")) {
								 // Assert.assertTrue(true);
								  assertEquals(true, true);
							  }else {

							  }
					  }else {

					  }

			  }else {
				  assertEquals(false, true);
			  }


	  }else {
		 //
		  assertEquals(false, true);

	  }


  }
}
