package com.finalProject.pageObject;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateOrderDDT {

	WebDriver ldriver;
	public CreateOrderDDT (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.ID, using ="small-searchterms")
	@CacheLookup
	WebElement txtSearchStore;

	@FindBy(how = How.XPATH, using ="//*[@id=\"small-search-box-form\"]/button")
	@CacheLookup
	WebElement searchBtn;

	@FindBy(how = How.CLASS_NAME, using ="product-grid")
	@CacheLookup
	WebElement itemsGrid;

	@FindAll(@FindBy(how = How.CLASS_NAME, using ="item-box"))
	@CacheLookup
	List <WebElement> items;

	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 add-to-cart-button\"]")
	@CacheLookup
	WebElement lnkAddToCart; 	//*[@class=\"button-1 add-to-cart-button\"]


	@FindBy(how = How.XPATH, using ="//*[@id=\"bar-notification\"]/div")
	@CacheLookup
	WebElement addToCartBarNotificationSuccess;


	@FindBy(how = How.XPATH, using ="//*[@class=\"button-2 add-to-wishlist-button\"]")
	@CacheLookup
	WebElement lnkWishlist; 	//button-2 add-to-wishlist-button


	@FindBy(how = How.XPATH, using ="//*[@id=\"bar-notification\"]/div/p")
	@CacheLookup
	WebElement wishlistBarNotificationSuccess;


	public void txtsearchStore(String dum) {
		txtSearchStore.sendKeys(dum);
	}


	public void searchBtn() {
		searchBtn.click();
	}


	public boolean isThereItems() {

		try {
		if(itemsGrid.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ CreateOrder not found items "+e.getMessage());
		}
		return false;
	}

	public void selectFormITems() {
    int choice =0;
    items.get(choice).click();

	}

	public void clickLnkAddToCart() {
		lnkAddToCart.click();
	}


	public boolean successAddedToCart() {

		try {
		if(addToCartBarNotificationSuccess.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ CreateOrder cant add to cart "+e.getMessage());
		}
		return false;
	}

	public void clickLnkWishlist() {
		lnkWishlist.click();
	}

	public boolean successAddedWishlist() {

		try {
		if(wishlistBarNotificationSuccess.isDisplayed()) {
			return true;
		}

		} catch (Exception e) {
			System.out.println("@ CreateOrder cant add to Wishlist "+e.getMessage());
		}
		return false;
	}





}
