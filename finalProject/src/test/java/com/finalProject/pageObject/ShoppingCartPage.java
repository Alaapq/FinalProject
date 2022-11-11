package com.finalProject.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	WebDriver ldriver;
	public ShoppingCartPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 checkout-button\"]")
	@CacheLookup
	WebElement  bntCheckout ;


	@FindBy(how = How.NAME, using ="termsofservice")
	@CacheLookup
	WebElement  checkBoxAgreeTerm;

	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 new-address-next-step-button\"]")
	@CacheLookup
	WebElement  bntContinue ;


	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 shipping-method-next-step-button\"]")
	@CacheLookup
	WebElement  bntShippingMethodContinue ;


	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 payment-method-next-step-button\"]")
	@CacheLookup
	WebElement  bntPaymentMethodContinue ;


	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 payment-info-next-step-button\"]")
	@CacheLookup
	WebElement  bntPaymentInfoContinue ;


	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 confirm-order-next-step-button\"]")
	@CacheLookup
	WebElement  bntConfirmOrderContinue ;

	@FindBy(how = How.XPATH, using ="//*[@class=\"order-number\"]")
	@CacheLookup
	WebElement divOrderNumber;

	@FindBy(how = How.XPATH, using ="//*[@class=\"button-1 order-completed-continue-button\"]")
	@CacheLookup
	WebElement  bntOrderCompletedContinue ;



	public void clickBntCheckout() {
		bntCheckout.click();
	}

	public void checkCheckBoxAgreeTerm() {
		checkBoxAgreeTerm.click();
	}

	public void checkBntContinue() {
		bntContinue.click();
	}

	public void checkBntShippingMethodContinue() {
		bntShippingMethodContinue.click();
	}

	public void checkBntPaymentMethodContinue() {
		bntPaymentMethodContinue.click();
	}

	public void checkBntPaymentInfoContinue() {
		bntPaymentInfoContinue.click();
	}

	public void checkBntConfirmOrderContinue() {
		bntConfirmOrderContinue.click();
	}


	public boolean chekIfTakeOrderNumber() {
		try {
			if(divOrderNumber.isDisplayed()) {
				//if(!divOrderNumber.getText().isEmpty()) {
				return true;
			}
		} catch (Exception e) {
			 System.out.println("@ did not take order number " +e.getMessage());
		}
		return false;
	}

	public void checkBntOrderCompletedContinue() {
		bntOrderCompletedContinue.click();
	}



}
