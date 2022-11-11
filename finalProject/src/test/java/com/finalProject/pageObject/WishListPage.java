package com.finalProject.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class WishListPage {

	WebDriver ldriver;
	public WishListPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.XPATH, using ="//*[@class=\"wishlist-label\"]")
	@CacheLookup
	WebElement lnkWishlist; //class="wishlist-label"

	@FindBy(how = How.XPATH, using ="//*[@class=\"button-2 wishlist-add-to-cart-button\"]")
	@CacheLookup
	WebElement bntishlistAddToCart;


	@FindAll({
		@FindBy(how = How.NAME, using ="addtocart"),
	})
	@CacheLookup
	List<WebElement> checkBoxAddToCart;



	public void clicklnkWishlist() {
		lnkWishlist.click();
	}


	public void clickBntishlistAddToCart() {
		bntishlistAddToCart.click();
	}

	public void checkAllCheckBox() {

		 for (WebElement dum:checkBoxAddToCart) {
			 dum.click();
		 }

	}

}
